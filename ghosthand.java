            double clickX = e.getClickedBlock().getX();
            double clickY =  e.getClickedBlock().getY();
            double clickZ = e.getClickedBlock().getZ();
            
            double playerX = e.getPlayer().getEyeLocation().getBlockX();
            double playerY = e.getPlayer().getEyeLocation().getBlockY();
            double playerZ = e.getPlayer().getEyeLocation().getBlockZ();
            double dd = Math.sqrt(Math.pow(clickX - playerX, 2.0)
                    + Math.pow(clickY - playerY, 2.0)
                    + Math.pow(clickZ - playerZ, 2.0)) - 1;
            
            Vector dir = e.getPlayer().getEyeLocation().getDirection();
            ArrayList<Material> mat = new ArrayList<>(); 
            for(double dis = 0; dis < dd; dis += 0.5) {
                  mat.add(e.getPlayer().getEyeLocation().toVector().clone().add(dir.clone().multiply(dis)).toLocation(e.getPlayer().getWorld()).getBlock().getType());
            }            
            for(int x = 0; x != mat.size(); x++) {
                if(mat.get(x).isSolid()) {
                    Bukkit.broadcastMessage("Flagged");
                }
            }
