package ca.tweetzy.auctionhouse.settings;

import ca.tweetzy.auctionhouse.AuctionHouse;
import ca.tweetzy.core.compatibility.XSound;
import ca.tweetzy.core.configuration.Config;
import ca.tweetzy.core.configuration.ConfigSetting;

import java.util.Arrays;
import java.util.Collections;

/**
 * The current file has been created by Kiran Hart
 * Date Created: January 12 2021
 * Time Created: 6:36 p.m.
 * Usage of any code found within this class is prohibited unless given explicit permission otherwise
 */
public class Settings {

    static final Config config = AuctionHouse.getInstance().getCoreConfig();

    public static final ConfigSetting LANG = new ConfigSetting(config, "lang", "en_US", "Default language file");
    public static final ConfigSetting UPDATE_CHECKER = new ConfigSetting(config, "update checker", true, "Should auction house check for updates?");
    public static final ConfigSetting METRICS = new ConfigSetting(config, "metrics", true, "Should the plugin use metrics?", "It simply allows me to see how many servers", "are currently using the auction house plugin.");

    /*  ===============================
     *          BASIC SETTINGS
     *  ===============================*/
    public static final ConfigSetting DEFAULT_AUCTION_TIME = new ConfigSetting(config, "auction setting.default auction house", 900, "The default auction time before an item expires (in seconds)");
    public static final ConfigSetting MAX_AUCTION_PRICE = new ConfigSetting(config, "auction setting.pricing.max auction price", 1000000000, "The max price for buy only / buy now items");
    public static final ConfigSetting MAX_AUCTION_START_PRICE = new ConfigSetting(config, "auction setting.max auction start price", 1000000000, "The max price starting a bidding auction");
    public static final ConfigSetting MAX_AUCTION_INCREMENT_PRICE = new ConfigSetting(config, "auction setting.pricing.max auction increment price", 1000000000, "The max amount for incrementing a bid.");
    public static final ConfigSetting MIN_AUCTION_PRICE = new ConfigSetting(config, "auction setting.pricing.min auction price", 1, "The min price for buy only / buy now items");
    public static final ConfigSetting MIN_AUCTION_START_PRICE = new ConfigSetting(config, "auction setting.min auction start price", 1, "The min price starting a bidding auction");
    public static final ConfigSetting MIN_AUCTION_INCREMENT_PRICE = new ConfigSetting(config, "auction setting.pricing.min auction increment price", 1, "The min amount for incrementing a bid.");
    public static final ConfigSetting OWNER_CAN_PURCHASE_OWN_ITEM = new ConfigSetting(config, "auction setting.purchase.owner can purchase own item", false, "Should the owner of an auction be able to purchase it?", "This probably should be set to false...");
    public static final ConfigSetting OWNER_CAN_BID_OWN_ITEM = new ConfigSetting(config, "auction setting.purchase.owner can bid on own item", false, "Should the owner of an auction be able to bid on it?", "This probably should be set to false...");
    public static final ConfigSetting AUTO_REFRESH_AUCTION_PAGES = new ConfigSetting(config, "auction setting.auto refresh auction pages", true, "Should auction pages auto refresh?");
    public static final ConfigSetting USE_SHORT_NUMBERS_ON_ITEMS = new ConfigSetting(config, "auction setting.use short numbers", false, "Should numbers be shortened into a prefixed form?");
    public static final ConfigSetting INCREASE_TIME_ON_BID = new ConfigSetting(config, "auction setting.increase time on bid", true, "Should the remaining time be increased when a bid is placed?");
    public static final ConfigSetting TIME_TO_INCREASE_BY_ON_BID = new ConfigSetting(config, "auction setting.time to increase by on the bid", 20, "How much ticks should be added to the bid? 20 == 1 second");
    public static final ConfigSetting TIME_TO_DECREASE_BY = new ConfigSetting(config, "auction setting.decrease time by", 5, "How much ticks to decrease auction times by each run. 20 == 1 second");

    /*  ===============================
     *         BLOCKED ITEMS
     *  ===============================*/
    public static final ConfigSetting BLOCKED_ITEMS = new ConfigSetting(config, "blocked items", Collections.singletonList("ENDER_CHEST"), "Materials that should be blocked (not allowed to sell)");

    /*  ===============================
     *         MAX AUCTION TIME
     *  ===============================*/
    public static final ConfigSetting AUCTION_TIME = new ConfigSetting(config, "auction time", Collections.singletonList("rankone:1200"), "Special time permissions for users.", "If they have the following permission in this format:", "auctionhouse.time.rankone", "rankone refers to the list item under auction time, they will get the time specified (in seconds)");

    /*  ===============================
     *           GLOBAL ITEMS
     *  ===============================*/
    public static final ConfigSetting GUI_BACK_BTN_ITEM = new ConfigSetting(config, "gui.global items.back button.item", "ARROW", "Settings for the back button");
    public static final ConfigSetting GUI_BACK_BTN_NAME = new ConfigSetting(config, "gui.global items.back button.name", "&e<< Back");
    public static final ConfigSetting GUI_BACK_BTN_LORE = new ConfigSetting(config, "gui.global items.back button.lore", Arrays.asList("&7Click the button to go", "&7back to the previous page."));

    public static final ConfigSetting GUI_CLOSE_BTN_ITEM = new ConfigSetting(config, "gui.global items.close button.item", "BARRIER", "Settings for the close button");
    public static final ConfigSetting GUI_CLOSE_BTN_NAME = new ConfigSetting(config, "gui.global items.close button.name", "&cClose");
    public static final ConfigSetting GUI_CLOSE_BTN_LORE = new ConfigSetting(config, "gui.global items.close button.lore", Collections.singletonList("&7Click to close this menu."));

    public static final ConfigSetting GUI_NEXT_BTN_ITEM = new ConfigSetting(config, "gui.global items.next button.item", "ARROW", "Settings for the next button");
    public static final ConfigSetting GUI_NEXT_BTN_NAME = new ConfigSetting(config, "gui.global items.next button.name", "&eNext >>");
    public static final ConfigSetting GUI_NEXT_BTN_LORE = new ConfigSetting(config, "gui.global items.next button.lore", Arrays.asList("&7Click the button to go", "&7to the next page."));

    public static final ConfigSetting GUI_REFRESH_BTN_ITEM = new ConfigSetting(config, "gui.global items.refresh button.item", "CHEST", "Settings for the refresh page");
    public static final ConfigSetting GUI_REFRESH_BTN_NAME = new ConfigSetting(config, "gui.global items.refresh button.name", "&6&LRefresh Page");
    public static final ConfigSetting GUI_REFRESH_BTN_LORE = new ConfigSetting(config, "gui.global items.refresh button.lore", Arrays.asList("&7Click to refresh the currently", "&7available auction listings."));


    /*  ===============================
     *         MAIN AUCTION GUI
     *  ===============================*/
    public static final ConfigSetting GUI_AUCTION_HOUSE_TITLE = new ConfigSetting(config, "gui.auction house.title", "&7Auction House");

    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_GUIDE_ITEM = new ConfigSetting(config, "gui.auction house.items.guide.item", "BOOK");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_GUIDE_NAME = new ConfigSetting(config, "gui.auction house.items.guide.name", "&e&lGuide");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_GUIDE_LORE = new ConfigSetting(config, "gui.auction house.items.guide.lore", Arrays.asList(
            "&7This is the auction house, here you can",
            "&7list items for sale and purchase items",
            "&7that others have listed for sale.",
            "",
            "&7The auction is also a great way to make",
            "&7money by selling farmable items other",
            "&7players may be interested in buying.",
            "",
            "&7All sell listings last for a max of &e60 minutes",
            "&7unsold items are sent to your collection bin.",
            "",
            "&7Each item is listed as a auction, so",
            "&7players can out bid each other, or simply",
            "&7purchase it right away with a set price.",
            "",
            "&7For more help, use &e/ah help!"
    ));

    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_TRANSACTIONS_ITEM = new ConfigSetting(config, "gui.auction house.items.transactions.item", "PAPER");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_TRANSACTIONS_NAME = new ConfigSetting(config, "gui.auction house.items.transactions.name", "&e&lTransactions");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_TRANSACTIONS_LORE = new ConfigSetting(config, "gui.auction house.items.transactions.lore", Collections.singletonList(
            "&7Click to view transaction history"
    ));

    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_HOW_TO_SELL_ITEM = new ConfigSetting(config, "gui.auction house.items.how to sell.item", "GOLD_INGOT");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_HOW_TO_SELL_NAME = new ConfigSetting(config, "gui.auction house.items.how to sell.name", "&e&lHow to Sell");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_HOW_TO_SELL_LORE = new ConfigSetting(config, "gui.auction house.items.how to sell.lore", Arrays.asList(
            "&7To list an item on the auction house, just hold",
            "&7the item in your hand and type the following command.",
            "&e/ah sell <buyNowPrice> [startPrice] [bidIncrement]"
    ));

    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_YOUR_AUCTIONS_ITEM = new ConfigSetting(config, "gui.auction house.items.your auctions.item", "DIAMOND");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_YOUR_AUCTIONS_NAME = new ConfigSetting(config, "gui.auction house.items.your auctions.name", "&e&lYour Auctions");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_YOUR_AUCTIONS_LORE = new ConfigSetting(config, "gui.auction house.items.your auctions.lore", Arrays.asList(
            "&7Click here to view all of the items you",
            "&7are currently selling on the auction.",
            "",
            "&e&l%active_player_auctions% Item(s)"
    ));

    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_COLLECTION_BIN_ITEM = new ConfigSetting(config, "gui.auction house.items.collection bin.item", "ENDER_CHEST");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_COLLECTION_BIN_NAME = new ConfigSetting(config, "gui.auction house.items.collection bin.name", "&e&lCollection Bin");
    public static final ConfigSetting GUI_AUCTION_HOUSE_ITEMS_COLLECTION_BIN_LORE = new ConfigSetting(config, "gui.auction house.items.collection bin.lore", Arrays.asList(
            "&7Click here to view and collect all of the",
            "&7items you have cancelled or have expired.",
            "",
            "&e&l%expired_player_auctions% Item(s)"
    ));

    /*  ===============================
     *         AUCTION STACKS
     *  ===============================*/
    public static final ConfigSetting AUCTION_ITEM_AUCTION_STACK = new ConfigSetting(config, "auction items.auction stack", Arrays.asList(
            "&7-------------------------",
            "&eSeller&f: &b%seller%",
            "",
            "&eBuy Now: &a$%buynowprice%",
            "",
            "&eTime Left: &b%remaining_days%&f days &b%remaining_hours%&f hours &b%remaining_minutes%&f minutes &b%remaining_seconds% seconds"
    ), "This the item stack lore that will be appended to", "auction items in /ah (lore will be applied first, then these)");

    public static final ConfigSetting AUCTION_ITEM_LISTING_STACK = new ConfigSetting(config, "auction items.listing stack", Arrays.asList(
            "&7-------------------------",
            "&eBuy Now: &a$%buynowprice%",
            "&eTime Left: &b%remaining_days%&f:&b%remaining_hours%&f:&b%remaining_minutes%&f:&b%remaining_seconds%"
    ), "This the item stack lore that will be appended to", "auction items in /ah listings (lore will be applied first, then these)");

    public static final ConfigSetting AUCTION_ITEM_AUCTION_STACK_WITH_BID = new ConfigSetting(config, "auction items.auction stack with bid", Arrays.asList(
            "&7-------------------------",
            "&eSeller&f: &b%seller%",
            "",
            "&eBuy Now: &a$%buynowprice%",
            "&eCurrent Price: &a$%currentprice%",
            "&eBid Increment: &a$%bidincrement%",
            "&eHighest Bidder: &a$%highestbidder%",
            "",
            "&eTime Left: &b%remaining_days%&f days &b%remaining_hours%&f hours &b%remaining_minutes%&f minutes &b%remaining_seconds% seconds"
    ), "This the item stack lore that will be appended to", "auction items in /ah (lore will be applied first, then these)");

    public static final ConfigSetting AUCTION_ITEM_LISTING_STACK_WITH_BID = new ConfigSetting(config, "auction items.listing stack with bid", Arrays.asList(
            "&7-------------------------",
            "&eBuy Now: &a$%buynowprice%",
            "&eCurrent Price: &a$%currentprice%",
            "&eBid Increment: &a$%bidincrement%",
            "&eHighest Bidder: &a$%highestbidder%",
            "&eTime Left: &b%remaining_days%&f:&b%remaining_hours%&f:&b%remaining_minutes%&f:&b%remaining_seconds%"
    ), "This the item stack lore that will be appended to", "auction items in /ah listings (lore will be applied first, then these)");

    public static final ConfigSetting AUCTION_PURCHASE_CONTROLS_BID_ON = new ConfigSetting(config, "auction items.controls.using bid", Arrays.asList(
            "&7-------------------------",
            "&eLeft-Click&f: &bBid",
            "&eRight-Click&f: &bBuy Now",
            "&7-------------------------"
    ), "This will be appended at the end of the lore", "If the auction item is using a bid, this will show");

    public static final ConfigSetting AUCTION_PURCHASE_CONTROLS_BID_OFF = new ConfigSetting(config, "auction items.controls.not using bid", Arrays.asList(
            "&7-------------------------",
            "&eLeft-Click&f: &bBuy Now",
            "&7-------------------------"
    ), "This will be appended at the end of the lore", "If the auction item is not using a bid, this will show");

    /*  ===============================
     *         AUCTION STACKS
     *  ===============================*/
    public static final ConfigSetting SOUNDS_LISTED_ITEM_ON_AUCTION_HOUSE = new ConfigSetting(config, "sounds.listed item on the auction house", XSound.ENTITY_EXPERIENCE_ORB_PICKUP.parseSound().name());
    public static final ConfigSetting SOUNDS_NAVIGATE_GUI_PAGES = new ConfigSetting(config, "sounds.navigated between gui pages", XSound.ENTITY_BAT_TAKEOFF.parseSound().name());
    public static final ConfigSetting SOUNDS_NOT_ENOUGH_MONEY = new ConfigSetting(config, "sounds.not enough money", XSound.ENTITY_ITEM_BREAK.parseSound().name());

    public static void setup() {
        config.load();
        config.setAutoremove(true).setAutosave(true);
        config.saveChanges();
    }
}
