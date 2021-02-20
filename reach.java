//EntityDamageByEntityEvent event
Entity taking = event.getEntity();
int limit = 3.5; 
Location locationDamager = player.getLocation();
Location locationDamagee = taking.getLocation();
double LocationDamagerX = locationDamager.getX();
double LocationDamagerY = locationDamager.getY() + 1.0;
double LocationDamagerZ = locationDamager.getZ();
double LocationDamageeX = locationDamagee.getX();
double LocationDamageeY = locationDamagee.getY();
double LocationDamageeZ = locationDamagee.getZ();
double range;
range = Math.sqrt(Math.pow(LocationDamagerX - LocationDamageeX, 2) + Math.pow(LocationDamagerY - LocationDamageeY, 2)+ Math.pow(LocationDamagerZ - LocationDamageeZ, 2));
if (range >= limit) {
	//flag player
}
