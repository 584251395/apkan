package com.apkanalysis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Permissionused entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "permissionused", catalog = "antivirus")
public class Permissionused implements java.io.Serializable {

	// Fields

	private Integer id;
	private String apkmd5;
	private String android99permission99accessFineLocation;
	private String android99permission99vibrate;
	private String android99permission99receiveBootCompleted;
	private String android99permission99internet;
	private String android99permission99accessWifiState;
	private String android99permission99accessNetworkState;
	private String android99permission99wakeLock;
	private String android99permission99getTasks;
	private String android99permission99camera;
	private String android99permission99readPhoneState;
	private String com99android99launcher99permission99installShortcut;
	private String com99android99browser99permission99readHistoryBookmarks;
	private String android99permission99broadcastSms;
	private String android99permission99sendSms;
	private String android99permission99bindDeviceAdmin;
	private String android99permission99modifyPhoneState;
	private String android99permission99callPhone;
	private String android99permission99writeSettings;
	private String android99permission99changeWifiState;
	private String android99permission99getAccounts;
	private String android99permission99recordAudio;
	private String android99permission99disableKeyguard;
	private String android99permission99useCredentials;
	private String android99permission99processOutgoingCalls;
	private String android99permission99callPrivileged;
	private String android99permission99modifyAudioSettings;
	private String android99permission99bluetoothAdmin;
	private String android99permission99masterClear;
	private String android99permission99broadcastWapPush;
	private String android99permission99killBackgroundProcesses;
	private String android99permission99readContacts;
	private String android99permission99shutdown;
	private String android99permission99bluetooth;
	private String android99permission99setWallpaper;
	private String android99permission99setWallpaperHints;
	private String android99permission99receiveSms;
	private String android99permission99bindVpnService;
	private String android99permission99broadcastSticky;
	private String android99permission99bindWallpaper;
	private String android99permission99changeWifiMulticastState;
	private String android99permission99bindInputMethod;
	private String android99permission99changeNetworkState;
	private String android99permission99readSyncSettings;
	private String android99permission99writeSyncSettings;
	private String android99permission99getPackageSize;
	private String android99permission99readSms;
	private String android99permission99clearAppCache;
	private String com99android99launcher99permission99uninstallShortcut;
	private String android99permission99batteryStats;
	private String android99permission99accessMockLocation;
	private String android99permission99expandStatusBar;

	// Constructors

	/** default constructor */
	public Permissionused() {
	}

	/** full constructor */
	public Permissionused(String apkmd5,
			String android99permission99accessFineLocation,
			String android99permission99vibrate,
			String android99permission99receiveBootCompleted,
			String android99permission99internet,
			String android99permission99accessWifiState,
			String android99permission99accessNetworkState,
			String android99permission99wakeLock,
			String android99permission99getTasks,
			String android99permission99camera,
			String android99permission99readPhoneState,
			String com99android99launcher99permission99installShortcut,
			String com99android99browser99permission99readHistoryBookmarks,
			String android99permission99broadcastSms,
			String android99permission99sendSms,
			String android99permission99bindDeviceAdmin,
			String android99permission99modifyPhoneState,
			String android99permission99callPhone,
			String android99permission99writeSettings,
			String android99permission99changeWifiState,
			String android99permission99getAccounts,
			String android99permission99recordAudio,
			String android99permission99disableKeyguard,
			String android99permission99useCredentials,
			String android99permission99processOutgoingCalls,
			String android99permission99callPrivileged,
			String android99permission99modifyAudioSettings,
			String android99permission99bluetoothAdmin,
			String android99permission99masterClear,
			String android99permission99broadcastWapPush,
			String android99permission99killBackgroundProcesses,
			String android99permission99readContacts,
			String android99permission99shutdown,
			String android99permission99bluetooth,
			String android99permission99setWallpaper,
			String android99permission99setWallpaperHints,
			String android99permission99receiveSms,
			String android99permission99bindVpnService,
			String android99permission99broadcastSticky,
			String android99permission99bindWallpaper,
			String android99permission99changeWifiMulticastState,
			String android99permission99bindInputMethod,
			String android99permission99changeNetworkState,
			String android99permission99readSyncSettings,
			String android99permission99writeSyncSettings,
			String android99permission99getPackageSize,
			String android99permission99readSms,
			String android99permission99clearAppCache,
			String com99android99launcher99permission99uninstallShortcut,
			String android99permission99batteryStats,
			String android99permission99accessMockLocation,
			String android99permission99expandStatusBar) {
		this.apkmd5 = apkmd5;
		this.android99permission99accessFineLocation = android99permission99accessFineLocation;
		this.android99permission99vibrate = android99permission99vibrate;
		this.android99permission99receiveBootCompleted = android99permission99receiveBootCompleted;
		this.android99permission99internet = android99permission99internet;
		this.android99permission99accessWifiState = android99permission99accessWifiState;
		this.android99permission99accessNetworkState = android99permission99accessNetworkState;
		this.android99permission99wakeLock = android99permission99wakeLock;
		this.android99permission99getTasks = android99permission99getTasks;
		this.android99permission99camera = android99permission99camera;
		this.android99permission99readPhoneState = android99permission99readPhoneState;
		this.com99android99launcher99permission99installShortcut = com99android99launcher99permission99installShortcut;
		this.com99android99browser99permission99readHistoryBookmarks = com99android99browser99permission99readHistoryBookmarks;
		this.android99permission99broadcastSms = android99permission99broadcastSms;
		this.android99permission99sendSms = android99permission99sendSms;
		this.android99permission99bindDeviceAdmin = android99permission99bindDeviceAdmin;
		this.android99permission99modifyPhoneState = android99permission99modifyPhoneState;
		this.android99permission99callPhone = android99permission99callPhone;
		this.android99permission99writeSettings = android99permission99writeSettings;
		this.android99permission99changeWifiState = android99permission99changeWifiState;
		this.android99permission99getAccounts = android99permission99getAccounts;
		this.android99permission99recordAudio = android99permission99recordAudio;
		this.android99permission99disableKeyguard = android99permission99disableKeyguard;
		this.android99permission99useCredentials = android99permission99useCredentials;
		this.android99permission99processOutgoingCalls = android99permission99processOutgoingCalls;
		this.android99permission99callPrivileged = android99permission99callPrivileged;
		this.android99permission99modifyAudioSettings = android99permission99modifyAudioSettings;
		this.android99permission99bluetoothAdmin = android99permission99bluetoothAdmin;
		this.android99permission99masterClear = android99permission99masterClear;
		this.android99permission99broadcastWapPush = android99permission99broadcastWapPush;
		this.android99permission99killBackgroundProcesses = android99permission99killBackgroundProcesses;
		this.android99permission99readContacts = android99permission99readContacts;
		this.android99permission99shutdown = android99permission99shutdown;
		this.android99permission99bluetooth = android99permission99bluetooth;
		this.android99permission99setWallpaper = android99permission99setWallpaper;
		this.android99permission99setWallpaperHints = android99permission99setWallpaperHints;
		this.android99permission99receiveSms = android99permission99receiveSms;
		this.android99permission99bindVpnService = android99permission99bindVpnService;
		this.android99permission99broadcastSticky = android99permission99broadcastSticky;
		this.android99permission99bindWallpaper = android99permission99bindWallpaper;
		this.android99permission99changeWifiMulticastState = android99permission99changeWifiMulticastState;
		this.android99permission99bindInputMethod = android99permission99bindInputMethod;
		this.android99permission99changeNetworkState = android99permission99changeNetworkState;
		this.android99permission99readSyncSettings = android99permission99readSyncSettings;
		this.android99permission99writeSyncSettings = android99permission99writeSyncSettings;
		this.android99permission99getPackageSize = android99permission99getPackageSize;
		this.android99permission99readSms = android99permission99readSms;
		this.android99permission99clearAppCache = android99permission99clearAppCache;
		this.com99android99launcher99permission99uninstallShortcut = com99android99launcher99permission99uninstallShortcut;
		this.android99permission99batteryStats = android99permission99batteryStats;
		this.android99permission99accessMockLocation = android99permission99accessMockLocation;
		this.android99permission99expandStatusBar = android99permission99expandStatusBar;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "apkmd5")
	public String getApkmd5() {
		return this.apkmd5;
	}

	public void setApkmd5(String apkmd5) {
		this.apkmd5 = apkmd5;
	}

	@Column(name = "android99permission99ACCESS_FINE_LOCATION", length = 11)
	public String getAndroid99permission99accessFineLocation() {
		return this.android99permission99accessFineLocation;
	}

	public void setAndroid99permission99accessFineLocation(
			String android99permission99accessFineLocation) {
		this.android99permission99accessFineLocation = android99permission99accessFineLocation;
	}

	@Column(name = "android99permission99VIBRATE", length = 11)
	public String getAndroid99permission99vibrate() {
		return this.android99permission99vibrate;
	}

	public void setAndroid99permission99vibrate(
			String android99permission99vibrate) {
		this.android99permission99vibrate = android99permission99vibrate;
	}

	@Column(name = "android99permission99RECEIVE_BOOT_COMPLETED", length = 11)
	public String getAndroid99permission99receiveBootCompleted() {
		return this.android99permission99receiveBootCompleted;
	}

	public void setAndroid99permission99receiveBootCompleted(
			String android99permission99receiveBootCompleted) {
		this.android99permission99receiveBootCompleted = android99permission99receiveBootCompleted;
	}

	@Column(name = "android99permission99INTERNET", length = 11)
	public String getAndroid99permission99internet() {
		return this.android99permission99internet;
	}

	public void setAndroid99permission99internet(
			String android99permission99internet) {
		this.android99permission99internet = android99permission99internet;
	}

	@Column(name = "android99permission99ACCESS_WIFI_STATE", length = 11)
	public String getAndroid99permission99accessWifiState() {
		return this.android99permission99accessWifiState;
	}

	public void setAndroid99permission99accessWifiState(
			String android99permission99accessWifiState) {
		this.android99permission99accessWifiState = android99permission99accessWifiState;
	}

	@Column(name = "android99permission99ACCESS_NETWORK_STATE", length = 11)
	public String getAndroid99permission99accessNetworkState() {
		return this.android99permission99accessNetworkState;
	}

	public void setAndroid99permission99accessNetworkState(
			String android99permission99accessNetworkState) {
		this.android99permission99accessNetworkState = android99permission99accessNetworkState;
	}

	@Column(name = "android99permission99WAKE_LOCK", length = 11)
	public String getAndroid99permission99wakeLock() {
		return this.android99permission99wakeLock;
	}

	public void setAndroid99permission99wakeLock(
			String android99permission99wakeLock) {
		this.android99permission99wakeLock = android99permission99wakeLock;
	}

	@Column(name = "android99permission99GET_TASKS", length = 11)
	public String getAndroid99permission99getTasks() {
		return this.android99permission99getTasks;
	}

	public void setAndroid99permission99getTasks(
			String android99permission99getTasks) {
		this.android99permission99getTasks = android99permission99getTasks;
	}

	@Column(name = "android99permission99CAMERA", length = 11)
	public String getAndroid99permission99camera() {
		return this.android99permission99camera;
	}

	public void setAndroid99permission99camera(
			String android99permission99camera) {
		this.android99permission99camera = android99permission99camera;
	}

	@Column(name = "android99permission99READ_PHONE_STATE", length = 11)
	public String getAndroid99permission99readPhoneState() {
		return this.android99permission99readPhoneState;
	}

	public void setAndroid99permission99readPhoneState(
			String android99permission99readPhoneState) {
		this.android99permission99readPhoneState = android99permission99readPhoneState;
	}

	@Column(name = "com99android99launcher99permission99INSTALL_SHORTCUT", length = 11)
	public String getCom99android99launcher99permission99installShortcut() {
		return this.com99android99launcher99permission99installShortcut;
	}

	public void setCom99android99launcher99permission99installShortcut(
			String com99android99launcher99permission99installShortcut) {
		this.com99android99launcher99permission99installShortcut = com99android99launcher99permission99installShortcut;
	}

	@Column(name = "com99android99browser99permission99READ_HISTORY_BOOKMARKS", length = 11)
	public String getCom99android99browser99permission99readHistoryBookmarks() {
		return this.com99android99browser99permission99readHistoryBookmarks;
	}

	public void setCom99android99browser99permission99readHistoryBookmarks(
			String com99android99browser99permission99readHistoryBookmarks) {
		this.com99android99browser99permission99readHistoryBookmarks = com99android99browser99permission99readHistoryBookmarks;
	}

	@Column(name = "android99permission99BROADCAST_SMS", length = 11)
	public String getAndroid99permission99broadcastSms() {
		return this.android99permission99broadcastSms;
	}

	public void setAndroid99permission99broadcastSms(
			String android99permission99broadcastSms) {
		this.android99permission99broadcastSms = android99permission99broadcastSms;
	}

	@Column(name = "android99permission99SEND_SMS", length = 11)
	public String getAndroid99permission99sendSms() {
		return this.android99permission99sendSms;
	}

	public void setAndroid99permission99sendSms(
			String android99permission99sendSms) {
		this.android99permission99sendSms = android99permission99sendSms;
	}

	@Column(name = "android99permission99BIND_DEVICE_ADMIN", length = 11)
	public String getAndroid99permission99bindDeviceAdmin() {
		return this.android99permission99bindDeviceAdmin;
	}

	public void setAndroid99permission99bindDeviceAdmin(
			String android99permission99bindDeviceAdmin) {
		this.android99permission99bindDeviceAdmin = android99permission99bindDeviceAdmin;
	}

	@Column(name = "android99permission99MODIFY_PHONE_STATE", length = 11)
	public String getAndroid99permission99modifyPhoneState() {
		return this.android99permission99modifyPhoneState;
	}

	public void setAndroid99permission99modifyPhoneState(
			String android99permission99modifyPhoneState) {
		this.android99permission99modifyPhoneState = android99permission99modifyPhoneState;
	}

	@Column(name = "android99permission99CALL_PHONE", length = 11)
	public String getAndroid99permission99callPhone() {
		return this.android99permission99callPhone;
	}

	public void setAndroid99permission99callPhone(
			String android99permission99callPhone) {
		this.android99permission99callPhone = android99permission99callPhone;
	}

	@Column(name = "android99permission99WRITE_SETTINGS", length = 11)
	public String getAndroid99permission99writeSettings() {
		return this.android99permission99writeSettings;
	}

	public void setAndroid99permission99writeSettings(
			String android99permission99writeSettings) {
		this.android99permission99writeSettings = android99permission99writeSettings;
	}

	@Column(name = "android99permission99CHANGE_WIFI_STATE", length = 11)
	public String getAndroid99permission99changeWifiState() {
		return this.android99permission99changeWifiState;
	}

	public void setAndroid99permission99changeWifiState(
			String android99permission99changeWifiState) {
		this.android99permission99changeWifiState = android99permission99changeWifiState;
	}

	@Column(name = "android99permission99GET_ACCOUNTS", length = 11)
	public String getAndroid99permission99getAccounts() {
		return this.android99permission99getAccounts;
	}

	public void setAndroid99permission99getAccounts(
			String android99permission99getAccounts) {
		this.android99permission99getAccounts = android99permission99getAccounts;
	}

	@Column(name = "android99permission99RECORD_AUDIO", length = 11)
	public String getAndroid99permission99recordAudio() {
		return this.android99permission99recordAudio;
	}

	public void setAndroid99permission99recordAudio(
			String android99permission99recordAudio) {
		this.android99permission99recordAudio = android99permission99recordAudio;
	}

	@Column(name = "android99permission99DISABLE_KEYGUARD", length = 11)
	public String getAndroid99permission99disableKeyguard() {
		return this.android99permission99disableKeyguard;
	}

	public void setAndroid99permission99disableKeyguard(
			String android99permission99disableKeyguard) {
		this.android99permission99disableKeyguard = android99permission99disableKeyguard;
	}

	@Column(name = "android99permission99USE_CREDENTIALS", length = 11)
	public String getAndroid99permission99useCredentials() {
		return this.android99permission99useCredentials;
	}

	public void setAndroid99permission99useCredentials(
			String android99permission99useCredentials) {
		this.android99permission99useCredentials = android99permission99useCredentials;
	}

	@Column(name = "android99permission99PROCESS_OUTGOING_CALLS", length = 11)
	public String getAndroid99permission99processOutgoingCalls() {
		return this.android99permission99processOutgoingCalls;
	}

	public void setAndroid99permission99processOutgoingCalls(
			String android99permission99processOutgoingCalls) {
		this.android99permission99processOutgoingCalls = android99permission99processOutgoingCalls;
	}

	@Column(name = "android99permission99CALL_PRIVILEGED", length = 11)
	public String getAndroid99permission99callPrivileged() {
		return this.android99permission99callPrivileged;
	}

	public void setAndroid99permission99callPrivileged(
			String android99permission99callPrivileged) {
		this.android99permission99callPrivileged = android99permission99callPrivileged;
	}

	@Column(name = "android99permission99MODIFY_AUDIO_SETTINGS", length = 11)
	public String getAndroid99permission99modifyAudioSettings() {
		return this.android99permission99modifyAudioSettings;
	}

	public void setAndroid99permission99modifyAudioSettings(
			String android99permission99modifyAudioSettings) {
		this.android99permission99modifyAudioSettings = android99permission99modifyAudioSettings;
	}

	@Column(name = "android99permission99BLUETOOTH_ADMIN", length = 11)
	public String getAndroid99permission99bluetoothAdmin() {
		return this.android99permission99bluetoothAdmin;
	}

	public void setAndroid99permission99bluetoothAdmin(
			String android99permission99bluetoothAdmin) {
		this.android99permission99bluetoothAdmin = android99permission99bluetoothAdmin;
	}

	@Column(name = "android99permission99MASTER_CLEAR", length = 11)
	public String getAndroid99permission99masterClear() {
		return this.android99permission99masterClear;
	}

	public void setAndroid99permission99masterClear(
			String android99permission99masterClear) {
		this.android99permission99masterClear = android99permission99masterClear;
	}

	@Column(name = "android99permission99BROADCAST_WAP_PUSH", length = 11)
	public String getAndroid99permission99broadcastWapPush() {
		return this.android99permission99broadcastWapPush;
	}

	public void setAndroid99permission99broadcastWapPush(
			String android99permission99broadcastWapPush) {
		this.android99permission99broadcastWapPush = android99permission99broadcastWapPush;
	}

	@Column(name = "android99permission99KILL_BACKGROUND_PROCESSES", length = 11)
	public String getAndroid99permission99killBackgroundProcesses() {
		return this.android99permission99killBackgroundProcesses;
	}

	public void setAndroid99permission99killBackgroundProcesses(
			String android99permission99killBackgroundProcesses) {
		this.android99permission99killBackgroundProcesses = android99permission99killBackgroundProcesses;
	}

	@Column(name = "android99permission99READ_CONTACTS", length = 11)
	public String getAndroid99permission99readContacts() {
		return this.android99permission99readContacts;
	}

	public void setAndroid99permission99readContacts(
			String android99permission99readContacts) {
		this.android99permission99readContacts = android99permission99readContacts;
	}

	@Column(name = "android99permission99SHUTDOWN", length = 11)
	public String getAndroid99permission99shutdown() {
		return this.android99permission99shutdown;
	}

	public void setAndroid99permission99shutdown(
			String android99permission99shutdown) {
		this.android99permission99shutdown = android99permission99shutdown;
	}

	@Column(name = "android99permission99BLUETOOTH", length = 11)
	public String getAndroid99permission99bluetooth() {
		return this.android99permission99bluetooth;
	}

	public void setAndroid99permission99bluetooth(
			String android99permission99bluetooth) {
		this.android99permission99bluetooth = android99permission99bluetooth;
	}

	@Column(name = "android99permission99SET_WALLPAPER", length = 11)
	public String getAndroid99permission99setWallpaper() {
		return this.android99permission99setWallpaper;
	}

	public void setAndroid99permission99setWallpaper(
			String android99permission99setWallpaper) {
		this.android99permission99setWallpaper = android99permission99setWallpaper;
	}

	@Column(name = "android99permission99SET_WALLPAPER_HINTS", length = 11)
	public String getAndroid99permission99setWallpaperHints() {
		return this.android99permission99setWallpaperHints;
	}

	public void setAndroid99permission99setWallpaperHints(
			String android99permission99setWallpaperHints) {
		this.android99permission99setWallpaperHints = android99permission99setWallpaperHints;
	}

	@Column(name = "android99permission99RECEIVE_SMS", length = 11)
	public String getAndroid99permission99receiveSms() {
		return this.android99permission99receiveSms;
	}

	public void setAndroid99permission99receiveSms(
			String android99permission99receiveSms) {
		this.android99permission99receiveSms = android99permission99receiveSms;
	}

	@Column(name = "android99permission99BIND_VPN_SERVICE", length = 11)
	public String getAndroid99permission99bindVpnService() {
		return this.android99permission99bindVpnService;
	}

	public void setAndroid99permission99bindVpnService(
			String android99permission99bindVpnService) {
		this.android99permission99bindVpnService = android99permission99bindVpnService;
	}

	@Column(name = "android99permission99BROADCAST_STICKY", length = 11)
	public String getAndroid99permission99broadcastSticky() {
		return this.android99permission99broadcastSticky;
	}

	public void setAndroid99permission99broadcastSticky(
			String android99permission99broadcastSticky) {
		this.android99permission99broadcastSticky = android99permission99broadcastSticky;
	}

	@Column(name = "android99permission99BIND_WALLPAPER", length = 11)
	public String getAndroid99permission99bindWallpaper() {
		return this.android99permission99bindWallpaper;
	}

	public void setAndroid99permission99bindWallpaper(
			String android99permission99bindWallpaper) {
		this.android99permission99bindWallpaper = android99permission99bindWallpaper;
	}

	@Column(name = "android99permission99CHANGE_WIFI_MULTICAST_STATE", length = 11)
	public String getAndroid99permission99changeWifiMulticastState() {
		return this.android99permission99changeWifiMulticastState;
	}

	public void setAndroid99permission99changeWifiMulticastState(
			String android99permission99changeWifiMulticastState) {
		this.android99permission99changeWifiMulticastState = android99permission99changeWifiMulticastState;
	}

	@Column(name = "android99permission99BIND_INPUT_METHOD", length = 11)
	public String getAndroid99permission99bindInputMethod() {
		return this.android99permission99bindInputMethod;
	}

	public void setAndroid99permission99bindInputMethod(
			String android99permission99bindInputMethod) {
		this.android99permission99bindInputMethod = android99permission99bindInputMethod;
	}

	@Column(name = "android99permission99CHANGE_NETWORK_STATE", length = 11)
	public String getAndroid99permission99changeNetworkState() {
		return this.android99permission99changeNetworkState;
	}

	public void setAndroid99permission99changeNetworkState(
			String android99permission99changeNetworkState) {
		this.android99permission99changeNetworkState = android99permission99changeNetworkState;
	}

	@Column(name = "android99permission99READ_SYNC_SETTINGS", length = 11)
	public String getAndroid99permission99readSyncSettings() {
		return this.android99permission99readSyncSettings;
	}

	public void setAndroid99permission99readSyncSettings(
			String android99permission99readSyncSettings) {
		this.android99permission99readSyncSettings = android99permission99readSyncSettings;
	}

	@Column(name = "android99permission99WRITE_SYNC_SETTINGS", length = 11)
	public String getAndroid99permission99writeSyncSettings() {
		return this.android99permission99writeSyncSettings;
	}

	public void setAndroid99permission99writeSyncSettings(
			String android99permission99writeSyncSettings) {
		this.android99permission99writeSyncSettings = android99permission99writeSyncSettings;
	}

	@Column(name = "android99permission99GET_PACKAGE_SIZE", length = 11)
	public String getAndroid99permission99getPackageSize() {
		return this.android99permission99getPackageSize;
	}

	public void setAndroid99permission99getPackageSize(
			String android99permission99getPackageSize) {
		this.android99permission99getPackageSize = android99permission99getPackageSize;
	}

	@Column(name = "android99permission99READ_SMS", length = 11)
	public String getAndroid99permission99readSms() {
		return this.android99permission99readSms;
	}

	public void setAndroid99permission99readSms(
			String android99permission99readSms) {
		this.android99permission99readSms = android99permission99readSms;
	}

	@Column(name = "android99permission99CLEAR_APP_CACHE", length = 11)
	public String getAndroid99permission99clearAppCache() {
		return this.android99permission99clearAppCache;
	}

	public void setAndroid99permission99clearAppCache(
			String android99permission99clearAppCache) {
		this.android99permission99clearAppCache = android99permission99clearAppCache;
	}

	@Column(name = "com99android99launcher99permission99UNINSTALL_SHORTCUT", length = 11)
	public String getCom99android99launcher99permission99uninstallShortcut() {
		return this.com99android99launcher99permission99uninstallShortcut;
	}

	public void setCom99android99launcher99permission99uninstallShortcut(
			String com99android99launcher99permission99uninstallShortcut) {
		this.com99android99launcher99permission99uninstallShortcut = com99android99launcher99permission99uninstallShortcut;
	}

	@Column(name = "android99permission99BATTERY_STATS", length = 11)
	public String getAndroid99permission99batteryStats() {
		return this.android99permission99batteryStats;
	}

	public void setAndroid99permission99batteryStats(
			String android99permission99batteryStats) {
		this.android99permission99batteryStats = android99permission99batteryStats;
	}

	@Column(name = "android99permission99ACCESS_MOCK_LOCATION", length = 11)
	public String getAndroid99permission99accessMockLocation() {
		return this.android99permission99accessMockLocation;
	}

	public void setAndroid99permission99accessMockLocation(
			String android99permission99accessMockLocation) {
		this.android99permission99accessMockLocation = android99permission99accessMockLocation;
	}

	@Column(name = "android99permission99EXPAND_STATUS_BAR", length = 11)
	public String getAndroid99permission99expandStatusBar() {
		return this.android99permission99expandStatusBar;
	}

	public void setAndroid99permission99expandStatusBar(
			String android99permission99expandStatusBar) {
		this.android99permission99expandStatusBar = android99permission99expandStatusBar;
	}

}