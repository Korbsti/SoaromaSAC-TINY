rrayList < Integer > degrees = new ArrayList < > ();
        for (int i = -1; i != 362; i++) {
            degrees.add(i);
        }
        Integer angle = 40;
        ////
        Location damagerXYZ = damager.getLocation();
        Location damageeXYZ = damagee.getLocation();
        double damagerX = damagerXYZ.getX();
        double damagerZ = damagerXYZ.getZ();
        double damageeX = damageeXYZ.getX();
        double damageeZ = damageeXYZ.getZ();
        double distanceA = Math.sqrt(Math.pow(damagerX - damageeX, 2.0) + Math.pow(damagerZ - damageeZ, 2.0));
        double rotation = (player.getLocation().getYaw() - 90) % 360;
        if (rotation < 0) {
            rotation += 360.0;
        }
        int damagerYaw = (int) rotation;
        double x = damagerX - damageeX;
        double y = damagerZ - damageeZ;
        double derp = Math.atan2(y, x);
        double answer = Math.toDegrees(derp);
        if (answer < 0) {
            answer += 360;
        }
        int holder1 = 0;
        int holder2 = 0;
        int playerDegree = 0;
        int damageeDegree = 0;
        for (int degrees = 0; degrees != 361; degrees++) {
            if (degrees == damagerYaw) {
                playerDegree = holder1;
                break;
            }
            holder1++;
        }
        for (int degrees = 0; degrees != 361; degrees++) {
            if (degrees == (int) answer) {
                damageeDegree = holder2;
                break;
            }
            holder2++;
        }
        boolean within = false;
        int placeholderOne = 0;
        for (int check = damageeDegree; placeholderOne != angle + 1; check++) {
            if (plugin.degrees.get(check) == 361) {
                check = 0;
            }
            if (plugin.degrees.get(check) == playerDegree) {
                within = true;
                break;
            }
            placeholderOne++;
        }
        int placeholderTwo = 0;
        for (int check = damageeDegree; placeholderTwo != angle + 1; check--) {
            if (plugin.degrees.get(check) == -1) {
                check = 360;
            }
            if (plugin.degrees.get(check) == playerDegree) {
                within = true;
                break;
            }
            placeholderTwo++;
        }
        if (!within) {
            // flag player
        }
