package de.og.batterycreator.cfg;

import java.util.Vector;

public class RomPreset {

	// Konstanten Filenames
	public static final String LOCKHANDLE_FILENAME_DEFAULT = "ic_lockscreen_handle_normal.png";
	public static final String FOLDER_SYSTEMUI = "MORPH/system/app/SystemUI.apk/res/";
	public static final String FOLDER_FRAMEWORK = "MORPH/system/framework/framework-res.apk/res/";
	public static final String FOLDER_LIDROID = "MORPH/system/framework/lidroid-res.apk/res/";
	public static final String WIFI_ICON_NAME = "stat_sys_wifi_signal_";
	public static final String WIFI_ICON_EXTENSION_FULLY = "_fully";
	public static final String WIFI_ICON_NAME_IN = "stat_sys_wifi_in.png";
	public static final String WIFI_ICON_NAME_OUT = "stat_sys_wifi_out.png";
	public static final String WIFI_ICON_NAME_INOUT = "stat_sys_wifi_inout.png";
	public static final String SIGNAL_ICON_NAME = "stat_sys_signal_";
	public static final String SIGNAL_ICON_EXTENSION_FULLY = "_fully";
	public static final String SIGNAL_ICON_NAME_IN = "stat_sys_signal_in.png";
	public static final String SIGNAL_ICON_NAME_OUT = "stat_sys_signal_out.png";
	public static final String SIGNAL_ICON_NAME_INOUT = "stat_sys_signal_inout.png";
	public static final String NOTIFICATION_BG_FILENME = "notification_panel_bg.9.png";
	public static final String BATT_ICON_CHARGE_NAME_AOKP = "stat_sys_battery_circle_charge_anim";
	public static final String BATT_ICON_NAME_AOKP = "stat_sys_battery_circle_";
	public static final String BATT_ICON_CHARGE_NAME_STOCK_ICS_JKAY = "stat_sys_battery_charge_anim";
	public static final String BATT_ICON_NAME_STOCK_ICS_JKAY = "stat_sys_battery_";

	// is in frameworkres...
	public static final int WEATHER_XHDPI = 162;
	public static final int WEATHER_HDPI = 144;
	public static final int LOCK_XHDPI = 216;
	public static final int LOCK_HDPI = 162;

	// in systemUI
	public static final int TOGGLE_720DP = 96;
	public static final int TOGGLE_600DP = 84;
	public static final int TOGGLE_XHDPI = 64;
	public static final int TOGGLE_HDPI = 48;
	public static final int TOGGLE_XHDPI_S3 = 72;

	public static final int NOTIFICATION_HDPI = 3;
	public static final int NOTIFICATION_XHDPI = 4;

	public static final int BATT_ICON_HEIGHT_XHDPI = 36;
	public static final int BATT_ICON_HEIGHT_HDPI = 27;
	public static final int BATT_ICON_HEIGHT_HDPI_S3 = 38;
	public static final int BATT_ICON_HEIGHT_720DP = 48;
	public static final int BATT_ICON_HEIGHT_600DP = 43;

	public static final String DRAWABLE_XHDPI = "drawable-xhdpi";
	public static final String DRAWABLE_HDPI = "drawable-hdpi";
	public static final String DRAWABLE_HDPI_S3 = "drawable-hdpi";
	public static final String DRAWABLE_720DP = "drawable-sw720dp-xhdpi";
	public static final String DRAWABLE_600DP = "drawable-sw600dp-xhdpi";

	public static final String APPLY = "Apply Settings for Rom...";
	private static Vector<RomPreset> presets = new Vector<RomPreset>();

	static {
		presets.add(new RomPreset(APPLY, DRAWABLE_XHDPI, BATT_ICON_HEIGHT_XHDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP, BATT_ICON_CHARGE_NAME_AOKP, LOCK_HDPI,
				NOTIFICATION_XHDPI, TOGGLE_XHDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Default", DRAWABLE_XHDPI, BATT_ICON_HEIGHT_XHDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP, BATT_ICON_CHARGE_NAME_AOKP, LOCK_HDPI,
				NOTIFICATION_XHDPI, TOGGLE_XHDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Resurrection Remix JB 3.1.2 and above", DRAWABLE_XHDPI, BATT_ICON_HEIGHT_XHDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP,
				BATT_ICON_CHARGE_NAME_AOKP, LOCK_HDPI, NOTIFICATION_XHDPI, TOGGLE_XHDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Resurrection Remix JB 3.x.x-3.1.1", DRAWABLE_XHDPI, BATT_ICON_HEIGHT_XHDPI, DRAWABLE_XHDPI, BATT_ICON_NAME_AOKP,
				BATT_ICON_CHARGE_NAME_AOKP, LOCK_XHDPI, NOTIFICATION_XHDPI, TOGGLE_XHDPI, false, WEATHER_XHDPI));

		presets.add(new RomPreset("Resurrection Remix ICS 2.6-2.7", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP,
				BATT_ICON_CHARGE_NAME_AOKP, LOCK_HDPI, NOTIFICATION_HDPI, TOGGLE_HDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("RootBox JB 2.x - 3.x", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP, BATT_ICON_CHARGE_NAME_AOKP,
				LOCK_HDPI, NOTIFICATION_HDPI, TOGGLE_HDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("[MORPHOLOGY SOCIETY] Galaxy S3", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI_S3, DRAWABLE_HDPI, BATT_ICON_NAME_STOCK_ICS_JKAY,
				BATT_ICON_CHARGE_NAME_STOCK_ICS_JKAY, LOCK_XHDPI, NOTIFICATION_XHDPI, TOGGLE_XHDPI_S3, true, WEATHER_XHDPI));

		presets.add(new RomPreset("HydraH2O ICS 1.x", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP, BATT_ICON_CHARGE_NAME_AOKP,
				LOCK_HDPI, NOTIFICATION_HDPI, TOGGLE_HDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Original AOKP JB", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP, BATT_ICON_CHARGE_NAME_AOKP,
				LOCK_HDPI, NOTIFICATION_HDPI, TOGGLE_HDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Original CM9/CM10 + 1%-Mod!!!", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI, DRAWABLE_HDPI, BATT_ICON_NAME_AOKP,
				BATT_ICON_CHARGE_NAME_AOKP, LOCK_HDPI, NOTIFICATION_HDPI, TOGGLE_HDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Stock ROM ICS incl. JKay", DRAWABLE_HDPI, BATT_ICON_HEIGHT_HDPI, DRAWABLE_HDPI, BATT_ICON_NAME_STOCK_ICS_JKAY,
				BATT_ICON_CHARGE_NAME_STOCK_ICS_JKAY, LOCK_HDPI, NOTIFICATION_HDPI, TOGGLE_HDPI, false, WEATHER_HDPI));

		presets.add(new RomPreset("Full xhdpi AOKP ROM", DRAWABLE_XHDPI, BATT_ICON_HEIGHT_XHDPI, DRAWABLE_XHDPI, BATT_ICON_NAME_AOKP,
				BATT_ICON_CHARGE_NAME_AOKP, LOCK_XHDPI, NOTIFICATION_XHDPI, TOGGLE_XHDPI, false, WEATHER_XHDPI));

	}

	private final String romName;
	private final String systemUIDrawableFolder;
	private final String frameworkDrawableFolder;
	private final String filePattern;
	private final String filePatternCharge;
	private final int weatherSize;
	private final int toggleSize;
	private final int lockHandleSize;
	private final int notificationHeight;
	private final int battsize;
	private final boolean useLidroid;

	public RomPreset(final String romName, final String systemUIDrawableFolder, final int battsize, final String frameworkDrawableFolder,
			final String filePattern, final String filePatternCharge, final int lockHandleSize, final int notificationHeight, final int toggleSize,
			final boolean useLidroid, final int weatherSize) {
		super();
		this.romName = romName;
		this.systemUIDrawableFolder = systemUIDrawableFolder;
		this.battsize = battsize;
		this.frameworkDrawableFolder = frameworkDrawableFolder;
		this.filePattern = filePattern;
		this.filePatternCharge = filePatternCharge;
		this.lockHandleSize = lockHandleSize;
		this.notificationHeight = notificationHeight;
		this.toggleSize = toggleSize;
		this.useLidroid = useLidroid;
		this.weatherSize = weatherSize;
	}

	public static Vector<RomPreset> getPresets() {
		return presets;
	}

	public String getRomName() {
		return romName;
	}

	public String getSystemUIDrawableFolder() {
		return systemUIDrawableFolder;
	}

	public String getFilePattern() {
		return filePattern;
	}

	public String getFilePatternCharge() {
		return filePatternCharge;
	}

	@Override
	public String toString() {
		return romName;
	}

	public int getLockHandleSize() {
		return lockHandleSize;
	}

	public int getNotificationHeight() {
		return notificationHeight;
	}

	/**
	 * @return the toggleSize
	 */
	public int getToggleSize() {
		return toggleSize;
	}

	/**
	 * @return the weatherSize
	 */
	public int getWeatherSize() {
		return weatherSize;
	}

	/**
	 * @return the frameworkDrawableFolder
	 */
	public String getFrameworkDrawableFolder() {
		return frameworkDrawableFolder;
	}

	/**
	 * @return the battsize
	 */
	public int getBattsize() {
		return battsize;
	}

	/**
	 * @return the useLidroid
	 */
	public boolean isUseLidroid() {
		return useLidroid;
	}
}