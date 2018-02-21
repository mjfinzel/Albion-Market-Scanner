package program;

public class Item {
	Recipe recipe = new Recipe();
	public Item(String name){
		if(name.equalsIgnoreCase("Carrot Seeds")){
			//no recipe
		}
		if(name.equalsIgnoreCase("Carrots")){
			//no recipe
		}
		if(name.equalsIgnoreCase("Letter of Transfer")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Blueprints")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Artistic Manuscripts")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Geomantic Surveys")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Mortar")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Crates")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Barrels")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Heavy Fur")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: \"The Package\"")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Patrol Route")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Geoff the Brigand's All-Natural Enriched Moonshine")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Sack of Kittens")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Beehives")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Old Clothes")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Farmyard Tools")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Pile of Manure")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Assassination Order")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Casualty Report")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Regimental Rings")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Medical Supplies")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Delivery: Sensitive Barrels")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Royal \"Horse\" Token")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Rough Logs")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Rough Stone")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Scraps of Hide")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Trash")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Carrot Soup")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Carrots"), 16));
		}
		if(name.equalsIgnoreCase("Beginner's Shield")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 4));
		}
		if(name.equalsIgnoreCase("Beginner's Mercenary Hood")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Scraps of Hide"), 4));
		}
		if(name.equalsIgnoreCase("Beginner's Mercenary Jacket")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Scraps of Hide"), 8));
		}
		if(name.equalsIgnoreCase("Beginner's Mercenary Shoes")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Scraps of Hide"), 4));
		}
		if(name.equalsIgnoreCase("Beginner's Pickaxe")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 3));
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Stone"), 3));
		}
		if(name.equalsIgnoreCase("Beginner's Stone Hammer")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 3));
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Stone"), 3));
		}
		if(name.equalsIgnoreCase("Beginner's Axe")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 3));
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Stone"), 3));
		}
		if(name.equalsIgnoreCase("Beginner's Sickle")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 3));
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Stone"), 3));
		}
		if(name.equalsIgnoreCase("Beginner's Skinning Knife")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 3));
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Stone"), 3));
		}
		if(name.equalsIgnoreCase("Beginner's Broadsword")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Logs"), 6));
			recipe.ingredients.add(new ItemAmtPair(new Item("Rough Stone"), 6));
		}
		if(name.equalsIgnoreCase("Haystack")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Haystack and cart")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Tree stump with pumpkins")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Fire bowl")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Fire bowl with pedestal")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Small arcane stone sigil")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Arcane stone sigil")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Small nature stone sigil")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Nature stone sigil")){
			//no recipe
		}
		if(name.equalsIgnoreCase("Scholar statue")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Broken scholar statue")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Hunting sculpture")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Hunter statue")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Book sculpture")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Magician statue")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Small sword sculpture")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Sword sculpture")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Sword and shield sculpture")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Warrior statue")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Small valorous stone sigil")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Valorous stone sigil")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Stone well")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Autumn tree")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Summer tree")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Spring tree")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Small fruit tree")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Fruit tree")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Bunting portal")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Wooden watchtower")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Wooden sign")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Wooden entrance")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Wooden gate")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Clothes line")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Fish line")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Flower vase")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Simple lantern")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Corner lantern")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Candelabra")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Barrel with candle")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Bean Seed")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Arcane Agaric Seed")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Beans")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Arcane Agaric")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Birch Logs")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Limestone")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Copper Ore")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Rugged Hide")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Cotton")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Birch Planks")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Logs"), 1));
		}
		if(name.equalsIgnoreCase("Limestone Block")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Limestone"), 1));
		}
		if(name.equalsIgnoreCase("Copper Bar")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Ore"), 1));
		}
		if(name.equalsIgnoreCase("Stiff Leather")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rugged Hide"), 1));
		}
		if(name.equalsIgnoreCase("Simple Cloth")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Cotton"), 1));
		}
		if(name.equalsIgnoreCase("Trash")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Minor Healing Potion")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Arcane Agaric"), 8));
		}
		if(name.equalsIgnoreCase("Minor Energy Potion")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Arcane Agaric"), 8));
		}
		if(name.equalsIgnoreCase("Bean Salad")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Beans"), 8));
			recipe.ingredients.add(new ItemAmtPair(new Item("Carrots"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Shield")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 4));
		}
		if(name.equalsIgnoreCase("Novice's Tome of Spells")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 4));
		}
		if(name.equalsIgnoreCase("Novice's Cape")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 4));
		}
		if(name.equalsIgnoreCase("Novice's Bag")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 12));
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 12));
		}
		if(name.equalsIgnoreCase("Recruiters Cape")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 4));
		}
		if(name.equalsIgnoreCase("Explorer's Hat")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 8));
		}
		if(name.equalsIgnoreCase("Explorer's Armor")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 16));
		}
		if(name.equalsIgnoreCase("Explorer's Boots")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 8));
		}
		if(name.equalsIgnoreCase("Adventurer's Helmet")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Adventurer's Jacket")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Adventurer's Shoes")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice's Soldier Helmet")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Soldier Armor")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 16));
		}
		if(name.equalsIgnoreCase("Novice's Soldier Boots")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Mercenary Hood")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Mercenary Jacket")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 16));
		}
		if(name.equalsIgnoreCase("Novice's Mercenary Shoes")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Scholar Cowl")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Scholar Robe")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Scholar Sandals")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Pickaxe")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 6));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 2));
		}
		if(name.equalsIgnoreCase("Novice's Stone Hammer")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 6));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 2));
		}
		if(name.equalsIgnoreCase("Novice's Axe")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 6));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 2));
		}
		if(name.equalsIgnoreCase("Novice's Sickle")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 6));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 2));
		}
		if(name.equalsIgnoreCase("Novice's Skinning Knife")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 6));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 2));
		}
		if(name.equalsIgnoreCase("Novice's Demolition Hammer")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 12));
			recipe.ingredients.add(new ItemAmtPair(new Item("Limestone Block"), 12));
		}
		if(name.equalsIgnoreCase("Novice's Bow")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 32));
		}
		if(name.equalsIgnoreCase("Novice's Fire Staff")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 16));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Broadsword")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 16));
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 8));
		}
		if(name.equalsIgnoreCase("Novice's Mule")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Guild Banner on fabric")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Guild Banner on shield")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice's Bed")){
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 10));
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 20));
		}
		if(name.equalsIgnoreCase("Novice's Chest")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 20));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 10));
		}
		if(name.equalsIgnoreCase("Novice's Table")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 30));
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 30));
		}
		if(name.equalsIgnoreCase("Adventurer's Handbook")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Mercenary's Trophy")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Stuffed Fox Head")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Lumberjack's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Stonecutter's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Prospector's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Cropper's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Gamekeeper's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Blacksmith's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Fletcher's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Imbuer's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Tinker's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Mercenary's Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice's Generalist Trophy Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Mercenary's Trophy Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Novice Gamekeeper's Trophy Journal (Partially Full)")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Wheat Seeds")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Brightleaf Comfrey Seed")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Journeyman's Ox Calf")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Journeyman's Foal")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Baby Chickens")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Journeyman's Horse")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Journeyman's Ox")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Chicken")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Sheaf of Wheat")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Brightleaf Comfrey")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Hen Eggs")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Raw Chicken")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Chicken"), 1));
		}
		if(name.equalsIgnoreCase("Flour")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Sheaf of Wheat"), 1));
		}
		if(name.equalsIgnoreCase("Chestnut Logs")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Logs"), 3));
		}
		if(name.equalsIgnoreCase("Sandstone")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Limestone"), 3));
		}
		if(name.equalsIgnoreCase("Tin Ore")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Ore"), 3));
		}
		if(name.equalsIgnoreCase("Thin Hide")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Rugged Hide"), 3));
		}
		if(name.equalsIgnoreCase("Flax")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Cotton"), 3));
		}
		if(name.equalsIgnoreCase("Chestnut Planks")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Chestnut Logs"), 2));
			recipe.ingredients.add(new ItemAmtPair(new Item("Birch Planks"), 1));
		}
		if(name.equalsIgnoreCase("Sandstone Block")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Sandstone"), 2));
			recipe.ingredients.add(new ItemAmtPair(new Item("Limestone Block"), 1));
		}
		if(name.equalsIgnoreCase("Bronze Bar")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Tin Ore"), 2));
			recipe.ingredients.add(new ItemAmtPair(new Item("Copper Bar"), 1));
		}
		if(name.equalsIgnoreCase("Thick Leather")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Thin Hide"), 2));
			recipe.ingredients.add(new ItemAmtPair(new Item("Stiff Leather"), 1));
		}
		if(name.equalsIgnoreCase("Neat Cloth")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Flax"), 2));
			recipe.ingredients.add(new ItemAmtPair(new Item("Simple Cloth"), 1));
		}
		if(name.equalsIgnoreCase("Explorer's Anchor")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Minor Gigantify Potion")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Brightleaf Comfrey"), 8));
		}
		if(name.equalsIgnoreCase("Minor Resistance Potion")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Brightleaf Comfrey"), 8));
		}
		if(name.equalsIgnoreCase("Minor Sticky Potion")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Brightleaf Comfrey"), 8));
		}
		if(name.equalsIgnoreCase("Wheat Soup")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Sheaf of Wheat"), 48));
		}
		if(name.equalsIgnoreCase("Chicken Pie")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Raw Chicken"), 8));
			recipe.ingredients.add(new ItemAmtPair(new Item("Flour"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Sheaf of Wheat"), 2));
		}
		if(name.equalsIgnoreCase("Chicken Omelette")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Raw Chicken"), 8));
			recipe.ingredients.add(new ItemAmtPair(new Item("Sheaf of Wheat"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Hen Eggs"), 2));
		}
		if(name.equalsIgnoreCase("Royal Blue Fireworks")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Royal Green Fireworks")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Royal Red Fireworks")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Royal Yellow Fireworks")){ 
			//no recipe
		}
		if(name.equalsIgnoreCase("Journeyman's Shield")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Chestnut Planks"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Bronze Bar"), 4));
		}
		if(name.equalsIgnoreCase("Journeyman's Tome of Spells")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Neat Cloth"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Thick Leather"), 4));
		}
		if(name.equalsIgnoreCase("Journeyman's Torch")){ 
			recipe.ingredients.add(new ItemAmtPair(new Item("Chestnut Planks"), 4));
			recipe.ingredients.add(new ItemAmtPair(new Item("Neat Cloth"), 4));
		}
		if(name.equalsIgnoreCase("Journeyman's Cape")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Bag")){ 

		}
		if(name.equalsIgnoreCase("Uncle Frost's Hat")){ 

		}
		if(name.equalsIgnoreCase("Legendary Explorer's Cloak")){ 

		}
		if(name.equalsIgnoreCase("Legendary Explorer's Hat")){ 

		}
		if(name.equalsIgnoreCase("Legendary Explorer's Armor")){ 

		}
		if(name.equalsIgnoreCase("Legendary Explorer's Boots")){ 

		}
		if(name.equalsIgnoreCase("Legendary Adventurer's Cloak")){ 

		}
		if(name.equalsIgnoreCase("Legendary Adventurer's Hat")){ 

		}
		if(name.equalsIgnoreCase("Legendary Adventurer's Armor")){ 

		}
		if(name.equalsIgnoreCase("Legendary Adventurer's Boots")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Soldier Helmet")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Soldier Armor")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Soldier Boots")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Mercenary Hood")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Mercenary Jacket")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Mercenary Shoes")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Scholar Cowl")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Scholar Robe")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Scholar Sandals")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Pickaxe")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Stone Hammer")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Axe")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Sickle")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Skinning Knife")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Demolition Hammer")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Bow")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Dagger")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Spear")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Battleaxe")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Broadsword")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Quarterstaff")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Hammer")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Mace")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Riding Horse")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Transport Ox")){ 

		}
		if(name.equalsIgnoreCase("Recruiter's Horse")){ 

		}
		if(name.equalsIgnoreCase("Recruiter's Donkey")){ 

		}
		if(name.equalsIgnoreCase("Legendary Explorer's Horse")){ 

		}
		if(name.equalsIgnoreCase("Legendary Explorer's Ox")){ 

		}
		if(name.equalsIgnoreCase("Epic Explorer's Giant Stag")){ 

		}
		if(name.equalsIgnoreCase("Legendary Adventurer's Horse")){ 

		}
		if(name.equalsIgnoreCase("Legendary Adventurer's Cart")){ 

		}
		if(name.equalsIgnoreCase("Guild Banner on fabric")){ 

		}
		if(name.equalsIgnoreCase("Guild Banner on shield")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Bed")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Chest")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Table")){ 

		}
		if(name.equalsIgnoreCase("Explorer's Looking Glass")){ 

		}
		if(name.equalsIgnoreCase("Founder's Certificate")){ 

		}
		if(name.equalsIgnoreCase("Founder's Statue")){ 

		}
		if(name.equalsIgnoreCase("Magical Tome")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Mercenary's Trophy")){ 

		}
		if(name.equalsIgnoreCase("Stuffed Wolf Head")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Lumberjack's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Stonecutter's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Prospector's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Cropper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Gamekeeper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Blacksmith's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Fletcher's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Imbuer's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Tinker's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Mercenary's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Generalist Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Mercenary's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Gamekeeper's Trophy Journal (Partially Full)")){ 

		}

		if(name.equalsIgnoreCase("Journeyman Lumberjack's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Stonecutter's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Prospector's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Cropper's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Gamekeeper's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Blacksmith's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Fletcher's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Imbuer's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Tinker's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Mercenary's Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman's Generalist Trophy Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Mercenary's Trophy Journal (empty)")){ 

		}
		if(name.equalsIgnoreCase("Journeyman Gamekeeper's Trophy Journal (empty)")){ 

		}

		if(name.equalsIgnoreCase("Turnip Seed")){ 

		}
		if(name.equalsIgnoreCase("Crenellated Burdock Seed")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ox Calf")){ 

		}
		if(name.equalsIgnoreCase("Adept's Foal")){ 

		}
		if(name.equalsIgnoreCase("Adept's Fawn")){ 

		}
		if(name.equalsIgnoreCase("Kid")){ 

		}
		if(name.equalsIgnoreCase("Adept's Horse")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ox")){ 

		}
		if(name.equalsIgnoreCase("Adept's Tame Giant Stag")){ 

		}
		if(name.equalsIgnoreCase("Goat")){ 

		}
		if(name.equalsIgnoreCase("Turnips")){ 

		}
		if(name.equalsIgnoreCase("Crenellated Burdock")){ 

		}
		if(name.equalsIgnoreCase("Goat's Milk")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Sigil")){ 

		}
		if(name.equalsIgnoreCase("Raw Goat")){ 

		}
		if(name.equalsIgnoreCase("Goat's Butter")){ 

		}
		if(name.equalsIgnoreCase("Bread")){ 

		}
		if(name.equalsIgnoreCase("Pine Logs")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Pine Logs")){ 

		}
		if(name.equalsIgnoreCase("Rare Pine Logs")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Pine Logs")){ 

		}
		if(name.equalsIgnoreCase("Travertine")){ 

		}
		if(name.equalsIgnoreCase("Iron Ore")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Iron Ore")){ 

		}
		if(name.equalsIgnoreCase("Rare Iron Ore")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Iron Ore")){ 

		}
		if(name.equalsIgnoreCase("Medium Hide")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Medium Hide")){ 

		}
		if(name.equalsIgnoreCase("Rare Medium Hide")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Medium Hide")){ 

		}
		if(name.equalsIgnoreCase("Hemp")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Hemp")){ 

		}
		if(name.equalsIgnoreCase("Rare Hemp")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Hemp")){ 

		}
		if(name.equalsIgnoreCase("Pine Planks")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Pine Planks")){ 

		}
		if(name.equalsIgnoreCase("Rare Pine Planks")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Pine Planks")){ 

		}
		if(name.equalsIgnoreCase("Travertine Block")){ 

		}
		if(name.equalsIgnoreCase("Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Rare Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Worked Leather")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Worked Leather")){ 

		}
		if(name.equalsIgnoreCase("Rare Worked Leather")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Worked Leather")){ 

		}
		if(name.equalsIgnoreCase("Fine Cloth")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Fine Cloth")){ 

		}
		if(name.equalsIgnoreCase("Rare Fine Cloth")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Fine Cloth")){ 

		}
		if(name.equalsIgnoreCase("Adept's Occult Orb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Arrowheads")){ 

		}
		if(name.equalsIgnoreCase("Adept's Carved bone")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Blade")){ 

		}
		if(name.equalsIgnoreCase("Adept's Reinforced Morgana Pole")){ 

		}
		if(name.equalsIgnoreCase("Adept's Alluring Bolts")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bloodforged Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Adept's Keeper Axeheads")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellish Bolts")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellish Hammer Heads")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cursed Blades")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Blades")){ 

		}
		if(name.equalsIgnoreCase("Adept's Possessed Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Adept's Burning Orb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Morgana Halberd Head")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ancient Hammer Head")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Harpoon Tip")){ 

		}
		if(name.equalsIgnoreCase("Adept's Possessed Scroll")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Scroll")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Scroll")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cursed Frozen Crystal")){ 

		}
		if(name.equalsIgnoreCase("Adept's Icicle Orb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Unholy Scroll")){ 

		}
		if(name.equalsIgnoreCase("Adept's Black Leather")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Arrows")){ 

		}
		if(name.equalsIgnoreCase("Adept's Imbued Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Adept's Symbol of Blight")){ 

		}
		if(name.equalsIgnoreCase("Adept's Preserved Log")){ 

		}
		if(name.equalsIgnoreCase("Adept's Engraved Log")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lost Crossbow Mechanism")){ 

		}
		if(name.equalsIgnoreCase("Adept's Preserved Rocks")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cursed Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cursed Barbs")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellish Sicklehead Pair")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lost Arcane Crystal")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lost Cursed Crystal")){ 

		}
		if(name.equalsIgnoreCase("Adept's Wildfire Orb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hoarfrost Orb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druidic Inscriptions")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hardened Debole")){ 

		}
		if(name.equalsIgnoreCase("Adept's Runed Rock")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bloodforged Blade")){ 

		}
		if(name.equalsIgnoreCase("Adept's Keeper Spearhead")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellish Sicklehead")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ancient Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bloodforged Spikes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Alluring Crystal")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Adept's Inscribed Stone")){ 

		}
		if(name.equalsIgnoreCase("Adept's Runed Horn")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellish Handle")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Candle")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ancient Padding")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ancient Chain Rings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ancient Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Scraps")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Plates")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Filling")){ 

		}
		if(name.equalsIgnoreCase("Adept's Carved Skull Padding")){ 

		}
		if(name.equalsIgnoreCase("Adept's Preserved Animal Fur")){ 

		}
		if(name.equalsIgnoreCase("Adept's Inscribed Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Imbued Visor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Imbued Leather Folds")){ 

		}
		if(name.equalsIgnoreCase("Adept's Imbued Soles")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonhide Padding")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonhide Leather")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonhide Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Visor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Leather")){ 

		}
		if(name.equalsIgnoreCase("Adept's Ghastly Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druidic Preserved Beak")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druidic Feathers")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druidic Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Cloth Visor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Cloth Folds")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Cloth Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Alluring Padding")){ 

		}
		if(name.equalsIgnoreCase("Adept's Alluring Amulet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Alluring Bindings")){ 

		}
		if(name.equalsIgnoreCase("Adept's Essence")){ 

		}
		if(name.equalsIgnoreCase("Adept's Rune")){ 

		}
		if(name.equalsIgnoreCase("Adept's Soul")){ 

		}
		if(name.equalsIgnoreCase("Adept's Relic")){ 

		}
		if(name.equalsIgnoreCase("Trash")){ 

		}
		if(name.equalsIgnoreCase("Healing Potion")){ 

		}
		if(name.equalsIgnoreCase("Energy Potion")){ 

		}
		if(name.equalsIgnoreCase("Minor Poison Potion")){ 

		}
		if(name.equalsIgnoreCase("Turnip Salad")){ 

		}
		if(name.equalsIgnoreCase("Goat Stew")){ 

		}
		if(name.equalsIgnoreCase("Goat Sandwich")){ 

		}
		if(name.equalsIgnoreCase("Snowball")){ 

		}
		if(name.equalsIgnoreCase("Adept's Shield")){ 

		}
		if(name.equalsIgnoreCase("Adept's Sarcophagus")){ 

		}
		if(name.equalsIgnoreCase("Adept's Caitiff Shield")){ 

		}
		if(name.equalsIgnoreCase("Adept's Facebreaker")){ 

		}
		if(name.equalsIgnoreCase("Adept's Tome of Spells")){ 

		}
		if(name.equalsIgnoreCase("Adept's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Adept's Muisak")){ 

		}
		if(name.equalsIgnoreCase("Adept's Taproot")){ 

		}
		if(name.equalsIgnoreCase("Adept's Torch")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mistcaller")){ 

		}
		if(name.equalsIgnoreCase("Adept's Leering Cane")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cryptcandle")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cape")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bag")){ 

		}
		if(name.equalsIgnoreCase("Adept's Soldier Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Soldier Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Soldier Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Knight Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Knight Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Knight Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Guardian Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Guardian Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Guardian Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Graveguard Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Graveguard Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Graveguard Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demon Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demon Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demon Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Judicator Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Judicator Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Judicator Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mercenary Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mercenary Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mercenary Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hunter Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hunter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hunter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Assassin Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Assassin Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Assassin Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Stalker Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Stalker Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Stalker Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellion Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellion Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hellion Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Specter Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Specter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Specter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Scholar Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Scholar Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Scholar Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cleric Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cleric Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cleric Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mage Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mage Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mage Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druid Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druid Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druid Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Fiend Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Fiend Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Fiend Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cultist Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cultist Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cultist Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Cowl")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Robe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Sandals")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Hood")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Jacket")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Shoes")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Helmet")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Armor")){ 

		}
		if(name.equalsIgnoreCase("Adept's Royal Boots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Harvester Cap")){ 

		}
		if(name.equalsIgnoreCase("Adept's Harvester Garb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Harvester Workboots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Harvester Backpack")){ 

		}
		if(name.equalsIgnoreCase("Adept's Skinner Cap")){ 

		}
		if(name.equalsIgnoreCase("Adept's Skinner Garb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Skinner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Skinner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Adept's Miner Cap")){ 

		}
		if(name.equalsIgnoreCase("Adept's Miner Garb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Miner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Miner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Adept's Quarrier Cap")){ 

		}
		if(name.equalsIgnoreCase("Adept's Quarrier Garb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Quarrier Workboots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Quarrier Backpack")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lumberjack Cap")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lumberjack Garb")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lumberjack Workboots")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lumberjack Backpack")){ 

		}
		if(name.equalsIgnoreCase("Adept's Pickaxe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Stone Hammer")){ 

		}
		if(name.equalsIgnoreCase("Adept's Axe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Sickle")){ 

		}
		if(name.equalsIgnoreCase("Adept's Skinning Knife")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demolition Hammer")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Warbow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Longbow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Whispering Bow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Wailing Bow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bow of Badon")){ 

		}
		if(name.equalsIgnoreCase("Adept's Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Heavy Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Light Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Weeping Repeater")){ 

		}
		if(name.equalsIgnoreCase("Adept's Boltcasters")){ 

		}
		if(name.equalsIgnoreCase("Adept's Siegebow")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Demonic Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lifecurse Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Cursed Skull")){ 

		}
		if(name.equalsIgnoreCase("Adept's Damnation Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Wildfire Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Brimstone Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Blazing Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Glacial Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hoarfrost Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Icicle Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Permafrost Prism")){ 

		}
		if(name.equalsIgnoreCase("Adept's Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Enigmatic Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Witchwork Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Occult Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Adept's Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Divine Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Lifetouch Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Fallen Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Redemption Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Wild Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Druidic Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Blight Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Rampant Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Dagger")){ 

		}
		if(name.equalsIgnoreCase("Adept's Dagger Pair")){ 

		}
		if(name.equalsIgnoreCase("Adept's Claws")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bloodletter")){ 

		}
		if(name.equalsIgnoreCase("Adept's Black Hands")){ 

		}
		if(name.equalsIgnoreCase("Adept's Deathgivers")){ 

		}
		if(name.equalsIgnoreCase("Adept's Spear")){ 

		}
		if(name.equalsIgnoreCase("Adept's Pike")){ 

		}
		if(name.equalsIgnoreCase("Adept's Glaive")){ 

		}
		if(name.equalsIgnoreCase("Adept's Heron Spear")){ 

		}
		if(name.equalsIgnoreCase("Adept's Spirithunter")){ 

		}
		if(name.equalsIgnoreCase("Adept's Trinity Spear")){ 

		}
		if(name.equalsIgnoreCase("Adept's Battleaxe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Greataxe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Halberd")){ 

		}
		if(name.equalsIgnoreCase("Adept's Carrioncaller")){ 

		}
		if(name.equalsIgnoreCase("Adept's Infernal Scythe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bear Paws")){ 

		}
		if(name.equalsIgnoreCase("Adept's Broadsword")){ 

		}
		if(name.equalsIgnoreCase("Adept's Claymore")){ 

		}
		if(name.equalsIgnoreCase("Adept's Dual Swords")){ 

		}
		if(name.equalsIgnoreCase("Adept's Clarent Blade")){ 

		}
		if(name.equalsIgnoreCase("Adept's Carving Sword")){ 

		}
		if(name.equalsIgnoreCase("Adept's Galatine Pair")){ 

		}
		if(name.equalsIgnoreCase("Adept's Quarterstaff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Iron-clad Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Double Bladed Staff")){ 

		}
		if(name.equalsIgnoreCase("Adept's Black Monk Stave")){ 

		}
		if(name.equalsIgnoreCase("Adept's Soulscythe")){ 

		}
		if(name.equalsIgnoreCase("Adept's Staff of Balance")){ 

		}
		if(name.equalsIgnoreCase("Adept's Hammer")){ 

		}
		if(name.equalsIgnoreCase("Adept's Polehammer")){ 

		}
		if(name.equalsIgnoreCase("Adept's Great Hammer")){ 

		}
		if(name.equalsIgnoreCase("Adept's Tombhammer")){ 

		}
		if(name.equalsIgnoreCase("Adept's Forge Hammers")){ 

		}
		if(name.equalsIgnoreCase("Adept's Grovekeeper")){ 

		}
		if(name.equalsIgnoreCase("Adept's Mace")){ 

		}
		if(name.equalsIgnoreCase("Adept's Heavy Mace")){ 

		}
		if(name.equalsIgnoreCase("Adept's Morning Star")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bedrock Mace")){ 

		}
		if(name.equalsIgnoreCase("Adept's Incubus Mace")){ 

		}
		if(name.equalsIgnoreCase("Adept's Camlann Mace")){ 

		}
		if(name.equalsIgnoreCase("Adept's Riding Horse")){ 

		}
		if(name.equalsIgnoreCase("Adept's Transport Ox")){ 

		}
		if(name.equalsIgnoreCase("Adept's Giant Stag")){ 

		}
		if(name.equalsIgnoreCase("Adept's Repair Kit")){ 

		}
		if(name.equalsIgnoreCase("Guild Banner on fabric")){ 

		}
		if(name.equalsIgnoreCase("Guild Banner on shield")){ 

		}
		if(name.equalsIgnoreCase("Adept's Bed")){ 

		}
		if(name.equalsIgnoreCase("Adept's Chest")){ 

		}
		if(name.equalsIgnoreCase("Adept's Table")){ 

		}
		if(name.equalsIgnoreCase("Keeper Symbol")){ 

		}
		if(name.equalsIgnoreCase("Keeper Ceremonial Candle")){ 

		}
		if(name.equalsIgnoreCase("Keeper Shrine")){ 

		}
		if(name.equalsIgnoreCase("Keeper Campfire")){ 

		}
		if(name.equalsIgnoreCase("Keeper Altar")){ 

		}
		if(name.equalsIgnoreCase("Keeper Flag")){ 

		}
		if(name.equalsIgnoreCase("Keeper Symbol of Power")){ 

		}
		if(name.equalsIgnoreCase("Keeper Star of Power")){ 

		}
		if(name.equalsIgnoreCase("Heretic Food Stash")){ 

		}
		if(name.equalsIgnoreCase("Heretic Animal Cages")){ 

		}
		if(name.equalsIgnoreCase("Heretic Weapon Rack")){ 

		}
		if(name.equalsIgnoreCase("Heretic Training Dummy")){ 

		}
		if(name.equalsIgnoreCase("Heretic Pallisade")){ 

		}
		if(name.equalsIgnoreCase("Heretic Game Table")){ 

		}
		if(name.equalsIgnoreCase("Heretic Flag")){ 

		}
		if(name.equalsIgnoreCase("Heretic Chief's Table")){ 

		}
		if(name.equalsIgnoreCase("Heretic Tent")){ 

		}
		if(name.equalsIgnoreCase("Ancient Scripture")){ 

		}
		if(name.equalsIgnoreCase("Adept Mercenary's Trophy")){ 

		}
		if(name.equalsIgnoreCase("Stuffed Boar Head")){ 

		}
		if(name.equalsIgnoreCase("Adept Lumberjack's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Stonecutter's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Prospector's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Cropper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Gamekeeper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Blacksmith's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Fletcher's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Imbuer's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Tinker's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Mercenary's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept's Generalist Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Mercenary's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Adept Gamekeeper's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Cabbage Seed")){ 

		}
		if(name.equalsIgnoreCase("Dragon Teasel Seed")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ox Calf")){ 

		}
		if(name.equalsIgnoreCase("Expert's Foal")){ 

		}
		if(name.equalsIgnoreCase("Swiftclaw Cub")){ 

		}
		if(name.equalsIgnoreCase("Gosling")){ 

		}
		if(name.equalsIgnoreCase("Expert's Horse")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ox")){ 

		}
		if(name.equalsIgnoreCase("Tame Swiftclaw")){ 

		}
		if(name.equalsIgnoreCase("Goose")){ 

		}
		if(name.equalsIgnoreCase("Necromantic Elixir")){ 

		}
		if(name.equalsIgnoreCase("Warhorse Saddle")){ 

		}
		if(name.equalsIgnoreCase("Cabbage")){ 

		}
		if(name.equalsIgnoreCase("Dragon Teasel")){ 

		}
		if(name.equalsIgnoreCase("Goose Eggs")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Sigil")){ 

		}
		if(name.equalsIgnoreCase("Raw Goose")){ 

		}
		if(name.equalsIgnoreCase("Cedar Logs")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Cedar Logs")){ 

		}
		if(name.equalsIgnoreCase("Rare Cedar Logs")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Cedar Logs")){ 

		}
		if(name.equalsIgnoreCase("Granite")){ 

		}
		if(name.equalsIgnoreCase("Titanium Ore")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Titanium Ore")){ 

		}
		if(name.equalsIgnoreCase("Rare Titanium Ore")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Titanium Ore")){ 

		}
		if(name.equalsIgnoreCase("Heavy Hide")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Heavy Hide")){ 

		}
		if(name.equalsIgnoreCase("Rare Heavy Hide")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Heavy Hide")){ 

		}
		if(name.equalsIgnoreCase("Skyflower")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Skyflower")){ 

		}
		if(name.equalsIgnoreCase("Rare Skyflower")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Skyflower")){ 

		}
		if(name.equalsIgnoreCase("Cedar Planks")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Cedar Planks")){ 

		}
		if(name.equalsIgnoreCase("Rare Cedar Planks")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Cedar Planks")){ 

		}
		if(name.equalsIgnoreCase("Granite Block")){ 

		}
		if(name.equalsIgnoreCase("Titanium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Titanium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Rare Titanium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Titanium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Cured Leather")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Cured Leather")){ 

		}
		if(name.equalsIgnoreCase("Rare Cured Leather")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Cured Leather")){ 

		}
		if(name.equalsIgnoreCase("Ornate Cloth")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Ornate Cloth")){ 

		}
		if(name.equalsIgnoreCase("Rare Ornate Cloth")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Ornate Cloth")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bloodforged Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Expert's Occult Orb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Arrowheads")){ 

		}
		if(name.equalsIgnoreCase("Expert's Carved bone")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Blade")){ 

		}
		if(name.equalsIgnoreCase("Expert's Reinforced Morgana Pole")){ 

		}
		if(name.equalsIgnoreCase("Expert's Alluring Bolts")){ 

		}
		if(name.equalsIgnoreCase("Expert's Keeper Axeheads")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellish Bolts")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellish Hammer Heads")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cursed Blades")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Blades")){ 

		}
		if(name.equalsIgnoreCase("Expert's Possessed Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Expert's Burning Orb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Morgana Halberd Head")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ancient Hammer Head")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Harpoon Tip")){ 

		}
		if(name.equalsIgnoreCase("Expert's Possessed Scroll")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Scroll")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Scroll")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cursed Frozen Crystal")){ 

		}
		if(name.equalsIgnoreCase("Expert's Icicle Orb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Unholy Scroll")){ 

		}
		if(name.equalsIgnoreCase("Expert's Black Leather")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Arrows")){ 

		}
		if(name.equalsIgnoreCase("Expert's Imbued Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Expert's Symbol of Blight")){ 

		}
		if(name.equalsIgnoreCase("Expert's Preserved Log")){ 

		}
		if(name.equalsIgnoreCase("Expert's Engraved Log")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lost Crossbow Mechanism")){ 

		}
		if(name.equalsIgnoreCase("Expert's Preserved Rocks")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellish Sicklehead")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cursed Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cursed Barbs")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellish Sicklehead Pair")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lost Arcane Crystal")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lost Cursed Crystal")){ 

		}
		if(name.equalsIgnoreCase("Expert's Wildfire Orb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hoarfrost Orb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druidic Inscriptions")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hardened Debole")){ 

		}
		if(name.equalsIgnoreCase("Expert's Runed Rock")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bloodforged Blade")){ 

		}
		if(name.equalsIgnoreCase("Expert's Keeper Spearhead")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ancient Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bloodforged Spikes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Alluring Crystal")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Expert's Inscribed Stone")){ 

		}
		if(name.equalsIgnoreCase("Expert's Runed Horn")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellish Handle")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Candle")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ancient Padding")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ancient Chain Rings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ancient Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Scraps")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Plates")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Filling")){ 

		}
		if(name.equalsIgnoreCase("Expert's Carved Skull Padding")){ 

		}
		if(name.equalsIgnoreCase("Expert's Preserved Animal Fur")){ 

		}
		if(name.equalsIgnoreCase("Expert's Inscribed Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Imbued Visor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Imbued Leather Folds")){ 

		}
		if(name.equalsIgnoreCase("Expert's Imbued Soles")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonhide Padding")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonhide Leather")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonhide Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Visor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Leather")){ 

		}
		if(name.equalsIgnoreCase("Expert's Ghastly Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druidic Preserved Beak")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druidic Feathers")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druidic Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Cloth Visor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Cloth Folds")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Cloth Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Alluring Padding")){ 

		}
		if(name.equalsIgnoreCase("Expert's Alluring Amulet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Alluring Bindings")){ 

		}
		if(name.equalsIgnoreCase("Expert's Essence")){ 

		}
		if(name.equalsIgnoreCase("Expert's Rune")){ 

		}
		if(name.equalsIgnoreCase("Expert's Soul")){ 

		}
		if(name.equalsIgnoreCase("Expert's Relic")){ 

		}
		if(name.equalsIgnoreCase("Trash")){ 

		}
		if(name.equalsIgnoreCase("Gigantify Potion")){ 

		}
		if(name.equalsIgnoreCase("Resistance Potion")){ 

		}
		if(name.equalsIgnoreCase("Sticky Potion")){ 

		}
		if(name.equalsIgnoreCase("Cabbage Soup")){ 

		}
		if(name.equalsIgnoreCase("Goose Pie")){ 

		}
		if(name.equalsIgnoreCase("Goose Omelette")){ 

		}
		if(name.equalsIgnoreCase("Expert's Shield")){ 

		}
		if(name.equalsIgnoreCase("Expert's Sarcophagus")){ 

		}
		if(name.equalsIgnoreCase("Expert's Caitiff Shield")){ 

		}
		if(name.equalsIgnoreCase("Expert's Facebreaker")){ 

		}
		if(name.equalsIgnoreCase("Expert's Tome of Spells")){ 

		}
		if(name.equalsIgnoreCase("Expert's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Expert's Muisak")){ 

		}
		if(name.equalsIgnoreCase("Expert's Taproot")){ 

		}
		if(name.equalsIgnoreCase("Expert's Torch")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mistcaller")){ 

		}
		if(name.equalsIgnoreCase("Expert's Leering Cane")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cryptcandle")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cape")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bag")){ 

		}
		if(name.equalsIgnoreCase("Expert's Soldier Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Soldier Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Soldier Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Knight Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Knight Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Knight Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Guardian Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Guardian Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Guardian Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Graveguard Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Graveguard Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Graveguard Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demon Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demon Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demon Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Judicator Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Judicator Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Judicator Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mercenary Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mercenary Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mercenary Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hunter Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hunter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hunter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Assassin Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Assassin Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Assassin Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Stalker Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Stalker Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Stalker Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellion Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellion Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hellion Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Specter Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Specter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Specter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Scholar Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Scholar Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Scholar Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cleric Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cleric Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cleric Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mage Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mage Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mage Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druid Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druid Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druid Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Fiend Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Fiend Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Fiend Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cultist Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cultist Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cultist Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Cowl")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Robe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Sandals")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Hood")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Jacket")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Shoes")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Helmet")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Armor")){ 

		}
		if(name.equalsIgnoreCase("Expert's Royal Boots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Harvester Cap")){ 

		}
		if(name.equalsIgnoreCase("Expert's Harvester Garb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Harvester Workboots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Harvester Backpack")){ 

		}
		if(name.equalsIgnoreCase("Expert's Skinner Cap")){ 

		}
		if(name.equalsIgnoreCase("Expert's Skinner Garb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Skinner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Skinner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Expert's Miner Cap")){ 

		}
		if(name.equalsIgnoreCase("Expert's Miner Garb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Miner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Miner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Expert's Quarrier Cap")){ 

		}
		if(name.equalsIgnoreCase("Expert's Quarrier Garb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Quarrier Workboots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Quarrier Backpack")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lumberjack Cap")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lumberjack Garb")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lumberjack Workboots")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lumberjack Backpack")){ 

		}
		if(name.equalsIgnoreCase("Expert's Pickaxe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Stone Hammer")){ 

		}
		if(name.equalsIgnoreCase("Expert's Axe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Sickle")){ 

		}
		if(name.equalsIgnoreCase("Expert's Skinning Knife")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demolition Hammer")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Warbow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Longbow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Whispering Bow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Wailing Bow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bow of Badon")){ 

		}
		if(name.equalsIgnoreCase("Expert's Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Heavy Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Light Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Weeping Repeater")){ 

		}
		if(name.equalsIgnoreCase("Expert's Boltcasters")){ 

		}
		if(name.equalsIgnoreCase("Expert's Siegebow")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Demonic Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lifecurse Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Cursed Skull")){ 

		}
		if(name.equalsIgnoreCase("Expert's Damnation Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Wildfire Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Brimstone Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Blazing Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Glacial Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hoarfrost Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Icicle Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Permafrost Prism")){ 

		}
		if(name.equalsIgnoreCase("Expert's Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Enigmatic Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Witchwork Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Occult Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Expert's Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Divine Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Lifetouch Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Fallen Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Redemption Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Wild Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Druidic Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Blight Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Rampant Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Dagger")){ 

		}
		if(name.equalsIgnoreCase("Expert's Dagger Pair")){ 

		}
		if(name.equalsIgnoreCase("Expert's Claws")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bloodletter")){ 

		}
		if(name.equalsIgnoreCase("Expert's Black Hands")){ 

		}
		if(name.equalsIgnoreCase("Expert's Deathgivers")){ 

		}
		if(name.equalsIgnoreCase("Expert's Spear")){ 

		}
		if(name.equalsIgnoreCase("Expert's Pike")){ 

		}
		if(name.equalsIgnoreCase("Expert's Glaive")){ 

		}
		if(name.equalsIgnoreCase("Expert's Heron Spear")){ 

		}
		if(name.equalsIgnoreCase("Expert's Spirithunter")){ 

		}
		if(name.equalsIgnoreCase("Expert's Trinity Spear")){ 

		}
		if(name.equalsIgnoreCase("Expert's Battleaxe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Greataxe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Halberd")){ 

		}
		if(name.equalsIgnoreCase("Expert's Carrioncaller")){ 

		}
		if(name.equalsIgnoreCase("Expert's Infernal Scythe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bear Paws")){ 

		}
		if(name.equalsIgnoreCase("Expert's Broadsword")){ 

		}
		if(name.equalsIgnoreCase("Expert's Claymore")){ 

		}
		if(name.equalsIgnoreCase("Expert's Dual Swords")){ 

		}
		if(name.equalsIgnoreCase("Expert's Clarent Blade")){ 

		}
		if(name.equalsIgnoreCase("Expert's Carving Sword")){ 

		}
		if(name.equalsIgnoreCase("Expert's Galatine Pair")){ 

		}
		if(name.equalsIgnoreCase("Expert's Quarterstaff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Iron-clad Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Double Bladed Staff")){ 

		}
		if(name.equalsIgnoreCase("Expert's Black Monk Stave")){ 

		}
		if(name.equalsIgnoreCase("Expert's Soulscythe")){ 

		}
		if(name.equalsIgnoreCase("Expert's Staff of Balance")){ 

		}
		if(name.equalsIgnoreCase("Expert's Hammer")){ 

		}
		if(name.equalsIgnoreCase("Expert's Polehammer")){ 

		}
		if(name.equalsIgnoreCase("Expert's Great Hammer")){ 

		}
		if(name.equalsIgnoreCase("Expert's Tombhammer")){ 

		}
		if(name.equalsIgnoreCase("Expert's Forge Hammers")){ 

		}
		if(name.equalsIgnoreCase("Expert's Grovekeeper")){ 

		}
		if(name.equalsIgnoreCase("Expert's Mace")){ 

		}
		if(name.equalsIgnoreCase("Expert's Heavy Mace")){ 

		}
		if(name.equalsIgnoreCase("Expert's Morning Star")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bedrock Mace")){ 

		}
		if(name.equalsIgnoreCase("Expert's Incubus Mace")){ 

		}
		if(name.equalsIgnoreCase("Expert's Camlann Mace")){ 

		}
		if(name.equalsIgnoreCase("Expert's Riding Horse")){ 

		}
		if(name.equalsIgnoreCase("Expert's Armored Horse")){ 

		}
		if(name.equalsIgnoreCase("Expert's Transport Ox")){ 

		}
		if(name.equalsIgnoreCase("Bonehorse")){ 

		}
		if(name.equalsIgnoreCase("Swiftclaw")){ 

		}
		if(name.equalsIgnoreCase("Warhorse")){ 

		}
		if(name.equalsIgnoreCase("Expert's Repair Kit")){ 

		}
		if(name.equalsIgnoreCase("Guild Banner on fabric")){ 

		}
		if(name.equalsIgnoreCase("Guild Banner on shield")){ 

		}
		if(name.equalsIgnoreCase("Expert's Bed")){ 

		}
		if(name.equalsIgnoreCase("Expert's Chest")){ 

		}
		if(name.equalsIgnoreCase("Expert's Table")){ 

		}
		if(name.equalsIgnoreCase("Flambeau (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Raven Standard Flambeau (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Pentagram (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Simple Brazier (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Reinforced Brazier (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Cauldron (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Raven Standard Shrine (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Siege Ballista (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Raven Standard (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Army Crate (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Prisoner Cage (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Soldier's Tent (Disciples of Morgana)")){ 

		}
		if(name.equalsIgnoreCase("Tome of Knowledge")){ 

		}
		if(name.equalsIgnoreCase("Expert Mercenary's Trophy")){ 

		}
		if(name.equalsIgnoreCase("Stuffed Bear Head")){ 

		}
		if(name.equalsIgnoreCase("Expert Lumberjack's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Stonecutter's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Prospector's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Cropper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Gamekeeper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Blacksmith's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Fletcher's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Imbuer's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Tinker's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Mercenary's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert's Generalist Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Mercenary's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Expert Gamekeeper's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Potato Seeds")){ 

		}
		if(name.equalsIgnoreCase("Elusive Foxglove Seed")){ 

		}
		if(name.equalsIgnoreCase("Master's Ox Calf")){ 

		}
		if(name.equalsIgnoreCase("Master's Foal")){ 

		}
		if(name.equalsIgnoreCase("Direwolf Pup")){ 

		}
		if(name.equalsIgnoreCase("Master's Fawn")){ 

		}
		if(name.equalsIgnoreCase("Lamb")){ 

		}
		if(name.equalsIgnoreCase("Master's Horse")){ 

		}
		if(name.equalsIgnoreCase("Master's Ox")){ 

		}
		if(name.equalsIgnoreCase("Tame Direwolf")){ 

		}
		if(name.equalsIgnoreCase("Master's Tame Giant Stag")){ 

		}
		if(name.equalsIgnoreCase("Sheep")){ 

		}
		if(name.equalsIgnoreCase("Decorative Bridle")){ 

		}
		if(name.equalsIgnoreCase("Potatoes")){ 

		}
		if(name.equalsIgnoreCase("Elusive Foxglove")){ 

		}
		if(name.equalsIgnoreCase("Sheep's Milk")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Sigil")){ 

		}
		if(name.equalsIgnoreCase("Keeper Totem")){ 

		}
		if(name.equalsIgnoreCase("Morgana's Favour")){ 

		}
		if(name.equalsIgnoreCase("Undead Knucklebone")){ 

		}
		if(name.equalsIgnoreCase("Raw Mutton")){ 

		}
		if(name.equalsIgnoreCase("Sheep's Butter")){ 

		}
		if(name.equalsIgnoreCase("Potato Schnapps")){ 

		}
		if(name.equalsIgnoreCase("Bloodoak Logs")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Bloodoak Logs")){ 

		}
		if(name.equalsIgnoreCase("Rare Bloodoak Logs")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Bloodoak Logs")){ 

		}
		if(name.equalsIgnoreCase("Slate")){ 

		}
		if(name.equalsIgnoreCase("Runite Ore")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Runite Ore")){ 

		}
		if(name.equalsIgnoreCase("Rare Runite Ore")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Runite Ore")){ 

		}
		if(name.equalsIgnoreCase("Robust Hide")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Robust Hide")){ 

		}
		if(name.equalsIgnoreCase("Rare Robust Hide")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Robust Hide")){ 

		}
		if(name.equalsIgnoreCase("Redleaf Cotton")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Redleaf Cotton")){ 

		}
		if(name.equalsIgnoreCase("Rare Redleaf Cotton")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Redleaf Cotton")){ 

		}
		if(name.equalsIgnoreCase("Bloodoak Planks")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Bloodoak Planks")){ 

		}
		if(name.equalsIgnoreCase("Rare Bloodoak Planks")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Bloodoak Planks")){ 

		}
		if(name.equalsIgnoreCase("Slate Block")){ 

		}
		if(name.equalsIgnoreCase("Runite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Runite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Rare Runite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Runite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Hardened Leather")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Hardened Leather")){ 

		}
		if(name.equalsIgnoreCase("Rare Hardened Leather")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Hardened Leather")){ 

		}
		if(name.equalsIgnoreCase("Lavish Cloth")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Lavish Cloth")){ 

		}
		if(name.equalsIgnoreCase("Rare Lavish Cloth")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Lavish Cloth")){ 

		}
		if(name.equalsIgnoreCase("Master's Bloodforged Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellish Sicklehead")){ 

		}
		if(name.equalsIgnoreCase("Master's Occult Orb")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Arrowheads")){ 

		}
		if(name.equalsIgnoreCase("Master's Carved bone")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Blade")){ 

		}
		if(name.equalsIgnoreCase("Master's Reinforced Morgana Pole")){ 

		}
		if(name.equalsIgnoreCase("Master's Alluring Bolts")){ 

		}
		if(name.equalsIgnoreCase("Master's Keeper Axeheads")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellish Bolts")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellish Hammer Heads")){ 

		}
		if(name.equalsIgnoreCase("Master's Cursed Blades")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Blades")){ 

		}
		if(name.equalsIgnoreCase("Master's Possessed Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Master's Burning Orb")){ 

		}
		if(name.equalsIgnoreCase("Master's Morgana Halberd Head")){ 

		}
		if(name.equalsIgnoreCase("Master's Ancient Hammer Head")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Harpoon Tip")){ 

		}
		if(name.equalsIgnoreCase("Master's Possessed Scroll")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Scroll")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Scroll")){ 

		}
		if(name.equalsIgnoreCase("Master's Cursed Frozen Crystal")){ 

		}
		if(name.equalsIgnoreCase("Master's Icicle Orb")){ 

		}
		if(name.equalsIgnoreCase("Master's Unholy Scroll")){ 

		}
		if(name.equalsIgnoreCase("Master's Black Leather")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Arrows")){ 

		}
		if(name.equalsIgnoreCase("Master's Imbued Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Master's Symbol of Blight")){ 

		}
		if(name.equalsIgnoreCase("Master's Preserved Log")){ 

		}
		if(name.equalsIgnoreCase("Master's Engraved Log")){ 

		}
		if(name.equalsIgnoreCase("Master's Lost Crossbow Mechanism")){ 

		}
		if(name.equalsIgnoreCase("Master's Preserved Rocks")){ 

		}
		if(name.equalsIgnoreCase("Master's Cursed Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Master's Cursed Barbs")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellish Sicklehead Pair")){ 

		}
		if(name.equalsIgnoreCase("Master's Lost Arcane Crystal")){ 

		}
		if(name.equalsIgnoreCase("Master's Lost Cursed Crystal")){ 

		}
		if(name.equalsIgnoreCase("Master's Wildfire Orb")){ 

		}
		if(name.equalsIgnoreCase("Master's Hoarfrost Orb")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Master's Druidic Inscriptions")){ 

		}
		if(name.equalsIgnoreCase("Master's Hardened Debole")){ 

		}
		if(name.equalsIgnoreCase("Master's Runed Rock")){ 

		}
		if(name.equalsIgnoreCase("Master's Bloodforged Blade")){ 

		}
		if(name.equalsIgnoreCase("Master's Keeper Spearhead")){ 

		}
		if(name.equalsIgnoreCase("Master's Ancient Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Master's Bloodforged Spikes")){ 

		}
		if(name.equalsIgnoreCase("Master's Alluring Crystal")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Master's Inscribed Stone")){ 

		}
		if(name.equalsIgnoreCase("Master's Runed Horn")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellish Handle")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Candle")){ 

		}
		if(name.equalsIgnoreCase("Master's Ancient Padding")){ 

		}
		if(name.equalsIgnoreCase("Master's Ancient Chain Rings")){ 

		}
		if(name.equalsIgnoreCase("Master's Ancient Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Scraps")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Plates")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Filling")){ 

		}
		if(name.equalsIgnoreCase("Master's Carved Skull Padding")){ 

		}
		if(name.equalsIgnoreCase("Master's Preserved Animal Fur")){ 

		}
		if(name.equalsIgnoreCase("Master's Inscribed Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Imbued Visor")){ 

		}
		if(name.equalsIgnoreCase("Master's Imbued Leather Folds")){ 

		}
		if(name.equalsIgnoreCase("Master's Imbued Soles")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonhide Padding")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonhide Leather")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonhide Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Visor")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Leather")){ 

		}
		if(name.equalsIgnoreCase("Master's Ghastly Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Druidic Preserved Beak")){ 

		}
		if(name.equalsIgnoreCase("Master's Druidic Feathers")){ 

		}
		if(name.equalsIgnoreCase("Master's Druidic Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Cloth Visor")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Cloth Folds")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Cloth Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Alluring Padding")){ 

		}
		if(name.equalsIgnoreCase("Master's Alluring Amulet")){ 

		}
		if(name.equalsIgnoreCase("Master's Alluring Bindings")){ 

		}
		if(name.equalsIgnoreCase("Master's Essence")){ 

		}
		if(name.equalsIgnoreCase("Master's Rune")){ 

		}
		if(name.equalsIgnoreCase("Master's Soul")){ 

		}
		if(name.equalsIgnoreCase("Master's Relic")){ 

		}
		if(name.equalsIgnoreCase("Trash")){ 

		}
		if(name.equalsIgnoreCase("Major Healing Potion")){ 

		}
		if(name.equalsIgnoreCase("Major Energy Potion")){ 

		}
		if(name.equalsIgnoreCase("Poison Potion")){ 

		}
		if(name.equalsIgnoreCase("Potato Salad")){ 

		}
		if(name.equalsIgnoreCase("Mutton Stew")){ 

		}
		if(name.equalsIgnoreCase("Mutton Sandwich")){ 

		}
		if(name.equalsIgnoreCase("Master's Shield")){ 

		}
		if(name.equalsIgnoreCase("Master's Sarcophagus")){ 

		}
		if(name.equalsIgnoreCase("Master's Caitiff Shield")){ 

		}
		if(name.equalsIgnoreCase("Master's Facebreaker")){ 

		}
		if(name.equalsIgnoreCase("Master's Tome of Spells")){ 

		}
		if(name.equalsIgnoreCase("Master's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Master's Muisak")){ 

		}
		if(name.equalsIgnoreCase("Master's Taproot")){ 

		}
		if(name.equalsIgnoreCase("Master's Torch")){ 

		}
		if(name.equalsIgnoreCase("Master's Mistcaller")){ 

		}
		if(name.equalsIgnoreCase("Master's Leering Cane")){ 

		}
		if(name.equalsIgnoreCase("Master's Cryptcandle")){ 

		}
		if(name.equalsIgnoreCase("Master's Cape")){ 

		}
		if(name.equalsIgnoreCase("Master's Bag")){ 

		}
		if(name.equalsIgnoreCase("Undead Platemail Cape")){ 

		}
		if(name.equalsIgnoreCase("Undead Leather Cape")){ 

		}
		if(name.equalsIgnoreCase("Undead Cloth Cape")){ 

		}
		if(name.equalsIgnoreCase("Keeper Platemail Cape")){ 

		}
		if(name.equalsIgnoreCase("Keeper Leather Cape")){ 

		}
		if(name.equalsIgnoreCase("Keeper Cloth Cape")){ 

		}
		if(name.equalsIgnoreCase("Morgana Platemail Cape")){ 

		}
		if(name.equalsIgnoreCase("Morgana Leather Cape")){ 

		}
		if(name.equalsIgnoreCase("Morgana Cloth Cape")){ 

		}
		if(name.equalsIgnoreCase("Master's Soldier Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Soldier Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Soldier Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Knight Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Knight Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Knight Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Guardian Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Guardian Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Guardian Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Graveguard Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Graveguard Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Graveguard Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Demon Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Demon Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Demon Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Judicator Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Judicator Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Judicator Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Mercenary Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Mercenary Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Mercenary Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Hunter Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Hunter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Hunter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Assassin Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Assassin Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Assassin Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Stalker Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Stalker Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Stalker Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellion Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellion Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Hellion Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Specter Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Specter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Specter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Scholar Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Scholar Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Scholar Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Cleric Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Cleric Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Cleric Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Mage Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Mage Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Mage Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Druid Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Druid Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Druid Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Fiend Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Fiend Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Fiend Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Cultist Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Cultist Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Cultist Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Cowl")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Robe")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Sandals")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Hood")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Jacket")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Shoes")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Helmet")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Armor")){ 

		}
		if(name.equalsIgnoreCase("Master's Royal Boots")){ 

		}
		if(name.equalsIgnoreCase("Master's Harvester Cap")){ 

		}
		if(name.equalsIgnoreCase("Master's Harvester Garb")){ 

		}
		if(name.equalsIgnoreCase("Master's Harvester Workboots")){ 

		}
		if(name.equalsIgnoreCase("Master's Harvester Backpack")){ 

		}
		if(name.equalsIgnoreCase("Master's Skinner Cap")){ 

		}
		if(name.equalsIgnoreCase("Master's Skinner Garb")){ 

		}
		if(name.equalsIgnoreCase("Master's Skinner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Master's Skinner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Master's Miner Cap")){ 

		}
		if(name.equalsIgnoreCase("Master's Miner Garb")){ 

		}
		if(name.equalsIgnoreCase("Master's Miner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Master's Miner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Master's Quarrier Cap")){ 

		}
		if(name.equalsIgnoreCase("Master's Quarrier Garb")){ 

		}
		if(name.equalsIgnoreCase("Master's Quarrier Workboots")){ 

		}
		if(name.equalsIgnoreCase("Master's Quarrier Backpack")){ 

		}
		if(name.equalsIgnoreCase("Master's Lumberjack Cap")){ 

		}
		if(name.equalsIgnoreCase("Master's Lumberjack Garb")){ 

		}
		if(name.equalsIgnoreCase("Master's Lumberjack Workboots")){ 

		}
		if(name.equalsIgnoreCase("Master's Lumberjack Backpack")){ 

		}
		if(name.equalsIgnoreCase("Master's Pickaxe")){ 

		}
		if(name.equalsIgnoreCase("Master's Stone Hammer")){ 

		}
		if(name.equalsIgnoreCase("Master's Axe")){ 

		}
		if(name.equalsIgnoreCase("Master's Sickle")){ 

		}
		if(name.equalsIgnoreCase("Master's Skinning Knife")){ 

		}
		if(name.equalsIgnoreCase("Master's Demolition Hammer")){ 

		}
		if(name.equalsIgnoreCase("Master's Bow")){ 

		}
		if(name.equalsIgnoreCase("Master's Warbow")){ 

		}
		if(name.equalsIgnoreCase("Master's Longbow")){ 

		}
		if(name.equalsIgnoreCase("Master's Whispering Bow")){ 

		}
		if(name.equalsIgnoreCase("Master's Wailing Bow")){ 

		}
		if(name.equalsIgnoreCase("Master's Bow of Badon")){ 

		}
		if(name.equalsIgnoreCase("Master's Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Master's Heavy Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Master's Light Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Master's Weeping Repeater")){ 

		}
		if(name.equalsIgnoreCase("Master's Boltcasters")){ 

		}
		if(name.equalsIgnoreCase("Master's Siegebow")){ 

		}
		if(name.equalsIgnoreCase("Master's Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Demonic Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Lifecurse Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Cursed Skull")){ 

		}
		if(name.equalsIgnoreCase("Master's Damnation Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Wildfire Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Brimstone Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Blazing Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Glacial Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Hoarfrost Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Icicle Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Permafrost Prism")){ 

		}
		if(name.equalsIgnoreCase("Master's Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Enigmatic Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Witchwork Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Occult Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Master's Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Divine Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Lifetouch Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Fallen Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Redemption Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Wild Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Druidic Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Blight Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Rampant Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Dagger")){ 

		}
		if(name.equalsIgnoreCase("Master's Dagger Pair")){ 

		}
		if(name.equalsIgnoreCase("Master's Claws")){ 

		}
		if(name.equalsIgnoreCase("Master's Bloodletter")){ 

		}
		if(name.equalsIgnoreCase("Master's Black Hands")){ 

		}
		if(name.equalsIgnoreCase("Master's Deathgivers")){ 

		}
		if(name.equalsIgnoreCase("Master's Spear")){ 

		}
		if(name.equalsIgnoreCase("Master's Pike")){ 

		}
		if(name.equalsIgnoreCase("Master's Glaive")){ 

		}
		if(name.equalsIgnoreCase("Master's Heron Spear")){ 

		}
		if(name.equalsIgnoreCase("Master's Spirithunter")){ 

		}
		if(name.equalsIgnoreCase("Master's Trinity Spear")){ 

		}
		if(name.equalsIgnoreCase("Master's Battleaxe")){ 

		}
		if(name.equalsIgnoreCase("Master's Greataxe")){ 

		}
		if(name.equalsIgnoreCase("Master's Halberd")){ 

		}
		if(name.equalsIgnoreCase("Master's Carrioncaller")){ 

		}
		if(name.equalsIgnoreCase("Master's Infernal Scythe")){ 

		}
		if(name.equalsIgnoreCase("Master's Bear Paws")){ 

		}
		if(name.equalsIgnoreCase("Master's Broadsword")){ 

		}
		if(name.equalsIgnoreCase("Master's Claymore")){ 

		}
		if(name.equalsIgnoreCase("Master's Dual Swords")){ 

		}
		if(name.equalsIgnoreCase("Master's Clarent Blade")){ 

		}
		if(name.equalsIgnoreCase("Master's Carving Sword")){ 

		}
		if(name.equalsIgnoreCase("Master's Galatine Pair")){ 

		}
		if(name.equalsIgnoreCase("Master's Quarterstaff")){ 

		}
		if(name.equalsIgnoreCase("Master's Iron-clad Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Double Bladed Staff")){ 

		}
		if(name.equalsIgnoreCase("Master's Black Monk Stave")){ 

		}
		if(name.equalsIgnoreCase("Master's Soulscythe")){ 

		}
		if(name.equalsIgnoreCase("Master's Staff of Balance")){ 

		}
		if(name.equalsIgnoreCase("Master's Hammer")){ 

		}
		if(name.equalsIgnoreCase("Master's Polehammer")){ 

		}
		if(name.equalsIgnoreCase("Master's Great Hammer")){ 

		}
		if(name.equalsIgnoreCase("Master's Tombhammer")){ 

		}
		if(name.equalsIgnoreCase("Master's Forge Hammers")){ 

		}
		if(name.equalsIgnoreCase("Master's Grovekeeper")){ 

		}
		if(name.equalsIgnoreCase("Master's Mace")){ 

		}
		if(name.equalsIgnoreCase("Master's Heavy Mace")){ 

		}
		if(name.equalsIgnoreCase("Master's Morning Star")){ 

		}
		if(name.equalsIgnoreCase("Master's Bedrock Mace")){ 

		}
		if(name.equalsIgnoreCase("Master's Incubus Mace")){ 

		}
		if(name.equalsIgnoreCase("Master's Camlann Mace")){ 

		}
		if(name.equalsIgnoreCase("Master's Riding Horse")){ 

		}
		if(name.equalsIgnoreCase("Master's Armored Horse")){ 

		}
		if(name.equalsIgnoreCase("Master's Transport Ox")){ 

		}
		if(name.equalsIgnoreCase("Master's Giant Stag")){ 

		}
		if(name.equalsIgnoreCase("Yule Stag")){ 

		}
		if(name.equalsIgnoreCase("Direwolf")){ 

		}
		if(name.equalsIgnoreCase("Master's Repair Kit")){ 

		}
		if(name.equalsIgnoreCase("Master's Bed")){ 

		}
		if(name.equalsIgnoreCase("Master's Table")){ 

		}
		if(name.equalsIgnoreCase("Encyclopedia of Power")){ 

		}
		if(name.equalsIgnoreCase("Master Mercenary's Trophy")){ 

		}
		if(name.equalsIgnoreCase("Stuffed Direwolf Head")){ 

		}
		if(name.equalsIgnoreCase("Master Lumberjack's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Stonecutter's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Prospector's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Cropper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Gamekeeper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Blacksmith's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Fletcher's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Imbuer's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Tinker's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Mercenary's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master's Generalist Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Mercenary's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Master Gamekeeper's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Corn Seeds")){ 

		}
		if(name.equalsIgnoreCase("Firetouched Mullein Seed")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ox Calf")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Foal")){ 

		}
		if(name.equalsIgnoreCase("Direboar Piglet")){ 

		}
		if(name.equalsIgnoreCase("Piglet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Horse")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ox")){ 

		}
		if(name.equalsIgnoreCase("Tame Direboar")){ 

		}
		if(name.equalsIgnoreCase("Pig")){ 

		}
		if(name.equalsIgnoreCase("Bundle of Corn")){ 

		}
		if(name.equalsIgnoreCase("Firetouched Mullein")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Sigil")){ 

		}
		if(name.equalsIgnoreCase("Raw Pork")){ 

		}
		if(name.equalsIgnoreCase("Corn Hooch")){ 

		}
		if(name.equalsIgnoreCase("Ashenbark Logs")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Ashenbark Logs")){ 

		}
		if(name.equalsIgnoreCase("Rare Ashenbark Logs")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Ashenbark Logs")){ 

		}
		if(name.equalsIgnoreCase("Basalt")){ 

		}
		if(name.equalsIgnoreCase("Meteorite Ore")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Meteorite Ore")){ 

		}
		if(name.equalsIgnoreCase("Rare Meteorite Ore")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Meteorite Ore")){ 

		}
		if(name.equalsIgnoreCase("Thick Hide")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Thick Hide")){ 

		}
		if(name.equalsIgnoreCase("Rare Thick Hide")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Thick Hide")){ 

		}
		if(name.equalsIgnoreCase("Sunflax")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Sunflax")){ 

		}
		if(name.equalsIgnoreCase("Rare Sunflax")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Sunflax")){ 

		}
		if(name.equalsIgnoreCase("Ashenbark Planks")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Ashenbark Planks")){ 

		}
		if(name.equalsIgnoreCase("Rare Ashenbark Planks")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Ashenbark Planks")){ 

		}
		if(name.equalsIgnoreCase("Basalt Block")){ 

		}
		if(name.equalsIgnoreCase("Meteorite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Meteorite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Rare Meteorite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Meteorite Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Reinforced Leather")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Reinforced Leather")){ 

		}
		if(name.equalsIgnoreCase("Rare Reinforced Leather")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Reinforced Leather")){ 

		}
		if(name.equalsIgnoreCase("Opulent Cloth")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Opulent Cloth")){ 

		}
		if(name.equalsIgnoreCase("Rare Opulent Cloth")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Opulent Cloth")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bloodforged Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellish Sicklehead")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Occult Orb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Arrowheads")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Carved bone")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Blade")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Reinforced Morgana Pole")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Alluring Bolts")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Keeper Axeheads")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellish Bolts")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellish Hammer Heads")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cursed Blades")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Blades")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Possessed Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Burning Orb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Morgana Halberd Head")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ancient Hammer Head")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Harpoon Tip")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Possessed Scroll")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Scroll")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Scroll")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cursed Frozen Crystal")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Icicle Orb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Unholy Scroll")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Black Leather")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Arrows")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Imbued Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Symbol of Blight")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Preserved Log")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Engraved Log")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lost Crossbow Mechanism")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Preserved Rocks")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cursed Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cursed Barbs")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellish Sicklehead Pair")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lost Arcane Crystal")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lost Cursed Crystal")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Wildfire Orb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hoarfrost Orb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druidic Inscriptions")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hardened Debole")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Runed Rock")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bloodforged Blade")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Keeper Spearhead")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ancient Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bloodforged Spikes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Alluring Crystal")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Inscribed Stone")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Runed Horn")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellish Handle")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Candle")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ancient Padding")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ancient Chain Rings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ancient Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Scraps")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Plates")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Filling")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Carved Skull Padding")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Preserved Animal Fur")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Inscribed Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Imbued Visor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Imbued Leather Folds")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Imbued Soles")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonhide Padding")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonhide Leather")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonhide Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Visor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Leather")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Ghastly Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druidic Preserved Beak")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druidic Feathers")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druidic Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Cloth Visor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Cloth Folds")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Cloth Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Alluring Padding")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Alluring Amulet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Alluring Bindings")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Essence")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Rune")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Soul")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Relic")){ 

		}
		if(name.equalsIgnoreCase("Trash")){ 

		}
		if(name.equalsIgnoreCase("Major Gigantify Potion")){ 

		}
		if(name.equalsIgnoreCase("Major Resistance Potion")){ 

		}
		if(name.equalsIgnoreCase("Major Sticky Potion")){ 

		}
		if(name.equalsIgnoreCase("Pork Pie")){ 

		}
		if(name.equalsIgnoreCase("Pork Omelette")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Shield")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Sarcophagus")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Caitiff Shield")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Facebreaker")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Tome of Spells")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Muisak")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Taproot")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Torch")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mistcaller")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Leering Cane")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cryptcandle")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cape")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bag")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Soldier Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Soldier Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Soldier Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Knight Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Knight Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Knight Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Guardian Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Guardian Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Guardian Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Graveguard Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Graveguard Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Graveguard Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demon Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demon Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demon Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Judicator Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Judicator Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Judicator Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mercenary Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mercenary Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mercenary Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hunter Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hunter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hunter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Assassin Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Assassin Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Assassin Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Stalker Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Stalker Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Stalker Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellion Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellion Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hellion Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Specter Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Specter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Specter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Scholar Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Scholar Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Scholar Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cleric Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cleric Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cleric Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mage Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mage Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mage Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druid Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druid Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druid Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Fiend Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Fiend Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Fiend Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cultist Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cultist Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cultist Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Cowl")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Robe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Sandals")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Hood")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Jacket")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Shoes")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Helmet")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Armor")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Royal Boots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Harvester Cap")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Harvester Garb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Harvester Workboots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Harvester Backpack")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Skinner Cap")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Skinner Garb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Skinner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Skinner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Miner Cap")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Miner Garb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Miner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Miner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Quarrier Cap")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Quarrier Garb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Quarrier Workboots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Quarrier Backpack")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lumberjack Cap")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lumberjack Garb")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lumberjack Workboots")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lumberjack Backpack")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Pickaxe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Stone Hammer")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Axe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Sickle")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Skinning Knife")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demolition Hammer")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Warbow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Longbow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Whispering Bow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Wailing Bow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bow of Badon")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Heavy Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Light Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Weeping Repeater")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Boltcasters")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Siegebow")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Demonic Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lifecurse Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Cursed Skull")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Damnation Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Wildfire Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Brimstone Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Blazing Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Glacial Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hoarfrost Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Icicle Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Permafrost Prism")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Enigmatic Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Witchwork Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Occult Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Divine Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Lifetouch Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Fallen Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Redemption Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Wild Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Druidic Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Blight Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Rampant Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Dagger")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Dagger Pair")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Claws")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bloodletter")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Black Hands")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Deathgivers")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Spear")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Pike")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Glaive")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Heron Spear")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Spirithunter")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Trinity Spear")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Battleaxe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Greataxe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Halberd")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Carrioncaller")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Infernal Scythe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bear Paws")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Broadsword")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Claymore")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Dual Swords")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Clarent Blade")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Carving Sword")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Galatine Pair")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Quarterstaff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Iron-clad Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Double Bladed Staff")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Black Monk Stave")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Soulscythe")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Staff of Balance")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Hammer")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Polehammer")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Great Hammer")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Tombhammer")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Forge Hammers")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Grovekeeper")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Mace")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Heavy Mace")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Morning Star")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bedrock Mace")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Incubus Mace")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Camlann Mace")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Riding Horse")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Armored Horse")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Transport Ox")){ 

		}
		if(name.equalsIgnoreCase("Saddled Direboar")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Repair Kit")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Bed")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Table")){ 

		}
		if(name.equalsIgnoreCase("Occult Octavo")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Mercenary's Trophy")){ 

		}
		if(name.equalsIgnoreCase("Stuffed Direboar Head")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Lumberjack's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Stonecutter's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Prospector's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Cropper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Gamekeeper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Blacksmith's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Fletcher's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Imbuer's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Tinker's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Mercenary's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster's Generalist Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Mercenary's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Grandmaster Gamekeeper's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Pumpkin Seeds")){ 

		}
		if(name.equalsIgnoreCase("Ghoul Yarrow Seed")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ox Calf")){ 

		}
		if(name.equalsIgnoreCase("Elder's Foal")){ 

		}
		if(name.equalsIgnoreCase("Direbear Cub")){ 

		}
		if(name.equalsIgnoreCase("albion.ITEMS_T8_FARM_SWAMPDRAGON_BABY")){ 

		}
		if(name.equalsIgnoreCase("Mammoth Calf")){ 

		}
		if(name.equalsIgnoreCase("Ghostwolf Pup")){ 

		}
		if(name.equalsIgnoreCase("Calf")){ 

		}
		if(name.equalsIgnoreCase("Elder's Horse")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ox")){ 

		}
		if(name.equalsIgnoreCase("Tame Direbear")){ 

		}
		if(name.equalsIgnoreCase("albion.ITEMS_T8_FARM_SWAMPDRAGON_GROWN")){ 

		}
		if(name.equalsIgnoreCase("Tame Mammoth")){ 

		}
		if(name.equalsIgnoreCase("Tame Ghostwolf")){ 

		}
		if(name.equalsIgnoreCase("Cow")){ 

		}
		if(name.equalsIgnoreCase("Spectral Mask")){ 

		}
		if(name.equalsIgnoreCase("Sacred Bone Marrow")){ 

		}
		if(name.equalsIgnoreCase("Infernal Horseshoes")){ 

		}
		if(name.equalsIgnoreCase("albion.ITEMS_T8_MOUNTUPGRADE_COMMAND_MAMMOTH")){ 

		}
		if(name.equalsIgnoreCase("Pumpkin")){ 

		}
		if(name.equalsIgnoreCase("Ghoul Yarrow")){ 

		}
		if(name.equalsIgnoreCase("Cow's Milk")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Sigil")){ 

		}
		if(name.equalsIgnoreCase("Raw Beef")){ 

		}
		if(name.equalsIgnoreCase("Cow's Butter")){ 

		}
		if(name.equalsIgnoreCase("Pumpkin Moonshine")){ 

		}
		if(name.equalsIgnoreCase("Whitewood Logs")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Whitewood Logs")){ 

		}
		if(name.equalsIgnoreCase("Rare Whitewood Logs")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Whitewood Logs")){ 

		}
		if(name.equalsIgnoreCase("Marble")){ 

		}
		if(name.equalsIgnoreCase("Adamantium Ore")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Adamantium Ore")){ 

		}
		if(name.equalsIgnoreCase("Rare Adamantium Ore")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Adamantium Ore")){ 

		}
		if(name.equalsIgnoreCase("Resilient Hide")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Resilient Hide")){ 

		}
		if(name.equalsIgnoreCase("Rare Resilient Hide")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Resilient Hide")){ 

		}
		if(name.equalsIgnoreCase("Ghost Hemp")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Ghost Hemp")){ 

		}
		if(name.equalsIgnoreCase("Rare Ghost Hemp")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Ghost Hemp")){ 

		}
		if(name.equalsIgnoreCase("Whitewood Planks")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Whitewood Planks")){ 

		}
		if(name.equalsIgnoreCase("Rare Whitewood Planks")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Whitewood Planks")){ 

		}
		if(name.equalsIgnoreCase("Marble Block")){ 

		}
		if(name.equalsIgnoreCase("Adamantium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Adamantium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Rare Adamantium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Adamantium Steel Bar")){ 

		}
		if(name.equalsIgnoreCase("Fortified Leather")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Fortified Leather")){ 

		}
		if(name.equalsIgnoreCase("Rare Fortified Leather")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Fortified Leather")){ 

		}
		if(name.equalsIgnoreCase("Baroque Cloth")){ 

		}
		if(name.equalsIgnoreCase("Uncommon Baroque Cloth")){ 

		}
		if(name.equalsIgnoreCase("Rare Baroque Cloth")){ 

		}
		if(name.equalsIgnoreCase("Exceptional Baroque Cloth")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bloodforged Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellish Sicklehead")){ 

		}
		if(name.equalsIgnoreCase("Elder's Occult Orb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Arrowheads")){ 

		}
		if(name.equalsIgnoreCase("Elder's Carved bone")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Blade")){ 

		}
		if(name.equalsIgnoreCase("Elder's Reinforced Morgana Pole")){ 

		}
		if(name.equalsIgnoreCase("Elder's Alluring Bolts")){ 

		}
		if(name.equalsIgnoreCase("Elder's Keeper Axeheads")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellish Bolts")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellish Hammer Heads")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cursed Blades")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Blades")){ 

		}
		if(name.equalsIgnoreCase("Elder's Possessed Catalyst")){ 

		}
		if(name.equalsIgnoreCase("Elder's Burning Orb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Morgana Halberd Head")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ancient Hammer Head")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Harpoon Tip")){ 

		}
		if(name.equalsIgnoreCase("Elder's Possessed Scroll")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Scroll")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Scroll")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cursed Frozen Crystal")){ 

		}
		if(name.equalsIgnoreCase("Elder's Icicle Orb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Unholy Scroll")){ 

		}
		if(name.equalsIgnoreCase("Elder's Black Leather")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Arrows")){ 

		}
		if(name.equalsIgnoreCase("Elder's Imbued Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Elder's Symbol of Blight")){ 

		}
		if(name.equalsIgnoreCase("Elder's Preserved Log")){ 

		}
		if(name.equalsIgnoreCase("Elder's Engraved Log")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lost Crossbow Mechanism")){ 

		}
		if(name.equalsIgnoreCase("Elder's Preserved Rocks")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cursed Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cursed Barbs")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellish Sicklehead Pair")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lost Arcane Crystal")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lost Cursed Crystal")){ 

		}
		if(name.equalsIgnoreCase("Elder's Wildfire Orb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hoarfrost Orb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Mace Head")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druidic Inscriptions")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hardened Debole")){ 

		}
		if(name.equalsIgnoreCase("Elder's Runed Rock")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bloodforged Blade")){ 

		}
		if(name.equalsIgnoreCase("Elder's Keeper Spearhead")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ancient Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Shield Core")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bloodforged Spikes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Alluring Crystal")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Jawbone")){ 

		}
		if(name.equalsIgnoreCase("Elder's Inscribed Stone")){ 

		}
		if(name.equalsIgnoreCase("Elder's Runed Horn")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellish Handle")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Pimele")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ancient Padding")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ancient Chain Rings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ancient Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Scraps")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Plates")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Filling")){ 

		}
		if(name.equalsIgnoreCase("Elder's Carved Skull Padding")){ 

		}
		if(name.equalsIgnoreCase("Elder's Preserved Animal Fur")){ 

		}
		if(name.equalsIgnoreCase("Elder's Inscribed Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Imbued Visor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Imbued Leather Folds")){ 

		}
		if(name.equalsIgnoreCase("Elder's Imbued Soles")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonhide Padding")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonhide Leather")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonhide Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Visor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Leather")){ 

		}
		if(name.equalsIgnoreCase("Elder's Ghastly Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druidic Preserved Beak")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druidic Feathers")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druidic Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Cloth Visor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Cloth Folds")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Cloth Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Alluring Padding")){ 

		}
		if(name.equalsIgnoreCase("Elder's Alluring Amulet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Alluring Bindings")){ 

		}
		if(name.equalsIgnoreCase("Elder's Essence")){ 

		}
		if(name.equalsIgnoreCase("Elder's Rune")){ 

		}
		if(name.equalsIgnoreCase("Elder's Soul")){ 

		}
		if(name.equalsIgnoreCase("Elder's Relic")){ 

		}
		if(name.equalsIgnoreCase("Trash")){ 

		}
		if(name.equalsIgnoreCase("Major Poison Potion")){ 

		}
		if(name.equalsIgnoreCase("Invisibility Potion")){ 

		}
		if(name.equalsIgnoreCase("Beef Stew")){ 

		}
		if(name.equalsIgnoreCase("Beef Sandwich")){ 

		}
		if(name.equalsIgnoreCase("Elder's Shield")){ 

		}
		if(name.equalsIgnoreCase("Elder's Sarcophagus")){ 

		}
		if(name.equalsIgnoreCase("Elder's Caitiff Shield")){ 

		}
		if(name.equalsIgnoreCase("Elder's Facebreaker")){ 

		}
		if(name.equalsIgnoreCase("Elder's Tome of Spells")){ 

		}
		if(name.equalsIgnoreCase("Elder's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Elder's Muisak")){ 

		}
		if(name.equalsIgnoreCase("Elder's Taproot")){ 

		}
		if(name.equalsIgnoreCase("Elder's Torch")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mistcaller")){ 

		}
		if(name.equalsIgnoreCase("Elder's Leering Cane")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cryptcandle")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cape")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bag")){ 

		}
		if(name.equalsIgnoreCase("Elder's Soldier Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Soldier Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Soldier Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Knight Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Knight Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Knight Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Guardian Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Guardian Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Guardian Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Graveguard Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Graveguard Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Graveguard Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demon Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demon Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demon Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Judicator Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Judicator Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Judicator Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mercenary Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mercenary Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mercenary Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hunter Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hunter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hunter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Assassin Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Assassin Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Assassin Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Stalker Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Stalker Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Stalker Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellion Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellion Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hellion Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Specter Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Specter Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Specter Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Scholar Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Scholar Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Scholar Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cleric Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cleric Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cleric Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mage Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mage Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mage Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druid Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druid Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druid Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Fiend Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Fiend Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Fiend Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cultist Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cultist Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cultist Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Cowl")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Robe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Sandals")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Hood")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Jacket")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Shoes")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Helmet")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Armor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Royal Boots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Harvester Cap")){ 

		}
		if(name.equalsIgnoreCase("Elder's Harvester Garb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Harvester Workboots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Harvester Backpack")){ 

		}
		if(name.equalsIgnoreCase("Elder's Skinner Cap")){ 

		}
		if(name.equalsIgnoreCase("Elder's Skinner Garb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Skinner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Skinner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Elder's Miner Cap")){ 

		}
		if(name.equalsIgnoreCase("Elder's Miner Garb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Miner Workboots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Miner Backpack")){ 

		}
		if(name.equalsIgnoreCase("Elder's Quarrier Cap")){ 

		}
		if(name.equalsIgnoreCase("Elder's Quarrier Garb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Quarrier Workboots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Quarrier Backpack")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lumberjack Cap")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lumberjack Garb")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lumberjack Workboots")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lumberjack Backpack")){ 

		}
		if(name.equalsIgnoreCase("Elder's Pickaxe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Stone Hammer")){ 

		}
		if(name.equalsIgnoreCase("Elder's Axe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Sickle")){ 

		}
		if(name.equalsIgnoreCase("Elder's Skinning Knife")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demolition Hammer")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Warbow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Longbow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Whispering Bow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Wailing Bow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bow of Badon")){ 

		}
		if(name.equalsIgnoreCase("Elder's Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Heavy Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Light Crossbow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Weeping Repeater")){ 

		}
		if(name.equalsIgnoreCase("Elder's Boltcasters")){ 

		}
		if(name.equalsIgnoreCase("Elder's Siegebow")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Cursed Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Demonic Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lifecurse Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Cursed Skull")){ 

		}
		if(name.equalsIgnoreCase("Elder's Damnation Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Fire Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Wildfire Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Brimstone Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Blazing Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Frost Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Glacial Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hoarfrost Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Icicle Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Permafrost Prism")){ 

		}
		if(name.equalsIgnoreCase("Elder's Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Arcane Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Enigmatic Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Witchwork Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Occult Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Eye of Secrets")){ 

		}
		if(name.equalsIgnoreCase("Elder's Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Holy Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Divine Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Lifetouch Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Fallen Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Redemption Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Nature Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Wild Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Druidic Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Blight Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Rampant Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Dagger")){ 

		}
		if(name.equalsIgnoreCase("Elder's Dagger Pair")){ 

		}
		if(name.equalsIgnoreCase("Elder's Claws")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bloodletter")){ 

		}
		if(name.equalsIgnoreCase("Elder's Black Hands")){ 

		}
		if(name.equalsIgnoreCase("Elder's Deathgivers")){ 

		}
		if(name.equalsIgnoreCase("Elder's Spear")){ 

		}
		if(name.equalsIgnoreCase("Elder's Pike")){ 

		}
		if(name.equalsIgnoreCase("Elder's Glaive")){ 

		}
		if(name.equalsIgnoreCase("Elder's Heron Spear")){ 

		}
		if(name.equalsIgnoreCase("Elder's Spirithunter")){ 

		}
		if(name.equalsIgnoreCase("Elder's Trinity Spear")){ 

		}
		if(name.equalsIgnoreCase("Elder's Battleaxe")){ 

		}
		if(name.equalsIgnoreCase("The Hand of Khor")){ 

		}
		if(name.equalsIgnoreCase("Elder's Halberd")){ 

		}
		if(name.equalsIgnoreCase("Elder's Carrioncaller")){ 

		}
		if(name.equalsIgnoreCase("Elder's Infernal Scythe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bear Paws")){ 

		}
		if(name.equalsIgnoreCase("Elder's Broadsword")){ 

		}
		if(name.equalsIgnoreCase("Elder's Claymore")){ 

		}
		if(name.equalsIgnoreCase("Elder's Dual Swords")){ 

		}
		if(name.equalsIgnoreCase("Elder's Clarent Blade")){ 

		}
		if(name.equalsIgnoreCase("Elder's Carving Sword")){ 

		}
		if(name.equalsIgnoreCase("Elder's Galatine Pair")){ 

		}
		if(name.equalsIgnoreCase("Elder's Quarterstaff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Iron-clad Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Double Bladed Staff")){ 

		}
		if(name.equalsIgnoreCase("Elder's Black Monk Stave")){ 

		}
		if(name.equalsIgnoreCase("Elder's Soulscythe")){ 

		}
		if(name.equalsIgnoreCase("Elder's Staff of Balance")){ 

		}
		if(name.equalsIgnoreCase("Elder's Hammer")){ 

		}
		if(name.equalsIgnoreCase("Elder's Polehammer")){ 

		}
		if(name.equalsIgnoreCase("Elder's Great Hammer")){ 

		}
		if(name.equalsIgnoreCase("Elder's Tombhammer")){ 

		}
		if(name.equalsIgnoreCase("Elder's Forge Hammers")){ 

		}
		if(name.equalsIgnoreCase("Elder's Grovekeeper")){ 

		}
		if(name.equalsIgnoreCase("Elder's Mace")){ 

		}
		if(name.equalsIgnoreCase("Elder's Heavy Mace")){ 

		}
		if(name.equalsIgnoreCase("Elder's Morning Star")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bedrock Mace")){ 

		}
		if(name.equalsIgnoreCase("Elder's Incubus Mace")){ 

		}
		if(name.equalsIgnoreCase("Elder's Camlann Mace")){ 

		}
		if(name.equalsIgnoreCase("Elder's Riding Horse")){ 

		}
		if(name.equalsIgnoreCase("Elder's Armored Horse")){ 

		}
		if(name.equalsIgnoreCase("Elder's Transport Ox")){ 

		}
		if(name.equalsIgnoreCase("Ghostwolf")){ 

		}
		if(name.equalsIgnoreCase("Saddled Direbear")){ 

		}
		if(name.equalsIgnoreCase("Elder's Transport Mammoth")){ 

		}
		if(name.equalsIgnoreCase("Elder's Command Mammoth")){ 

		}
		if(name.equalsIgnoreCase("albion.ITEMS_T8_MOUNT_SWAMPDRAGON")){ 

		}
		if(name.equalsIgnoreCase("Spectral Bonehorse")){ 

		}
		if(name.equalsIgnoreCase("Rageclaw")){ 

		}
		if(name.equalsIgnoreCase("Nightmare")){ 

		}
		if(name.equalsIgnoreCase("Elder's Repair Kit")){ 

		}
		if(name.equalsIgnoreCase("Elder's Bed")){ 

		}
		if(name.equalsIgnoreCase("Elder's Table")){ 

		}
		if(name.equalsIgnoreCase("Ledger of Truths")){ 

		}
		if(name.equalsIgnoreCase("Elder Mercenary's Trophy")){ 

		}
		if(name.equalsIgnoreCase("Stuffed Direbear Head")){ 

		}
		if(name.equalsIgnoreCase("Elder Lumberjack's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Stonecutter's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Prospector's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Cropper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Gamekeeper's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Blacksmith's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Fletcher's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Imbuer's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Tinker's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Mercenary's Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder's Generalist Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Mercenary's Trophy Journal (Partially Full)")){ 

		}
		if(name.equalsIgnoreCase("Elder Gamekeeper's Trophy Journal (Partially Full)")){
			
		}
	}
}
