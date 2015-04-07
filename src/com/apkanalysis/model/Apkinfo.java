package com.apkanalysis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Apkinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "apkinfo", catalog = "antivirus")
public class Apkinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String apkmd5;
	private String smalifile;
	private String recvsactionprint;
	private String providers;
	private String dexmd5;
	private String dangerschineseinfo;
	private String mostdangeraffect;
	private String permissionused;
	private String javaurls;
	private String clsfcg;
	private String javaphones;
	private String smaliphone;
	private String appname;
	private String signmd5;
	private String apicallsrefper;
	private String isvalidapk;
	private String version;
	private String javaips;
	private String javanum;
	private Integer apksize;
	private String apicalls;
	private String analysistime;
	private String icondir;
	private String activities;
	private String activitiesprint;
	private String signauthor;
	private String receivers;
	private String behaviorsinfo;
	private String smalidatabase;
	private String classeshierarchyprint;
	private String services;
	private String smalinet;
	private String smalisysservice;
	private String package_;
	private String signSha1;
	private String signserialnum;
	private String javaemails;
	private String signversion;
	private String permissiondeclared;
	private String os;

	// Constructors

	/** default constructor */
	public Apkinfo() {
	}

	/** full constructor */
	public Apkinfo(String apkmd5, String smalifile, String recvsactionprint,
			String providers, String dexmd5, String dangerschineseinfo,
			String mostdangeraffect, String permissionused, String javaurls,
			String clsfcg, String javaphones, String smaliphone,
			String appname, String signmd5, String apicallsrefper,
			String isvalidapk, String version, String javaips, String javanum,
			Integer apksize, String apicalls, String analysistime,
			String icondir, String activities, String activitiesprint,
			String signauthor, String receivers, String behaviorsinfo,
			String smalidatabase, String classeshierarchyprint,
			String services, String smalinet, String smalisysservice,
			String package_, String signSha1, String signserialnum,
			String javaemails, String signversion, String permissiondeclared,
			String os) {
		this.apkmd5 = apkmd5;
		this.smalifile = smalifile;
		this.recvsactionprint = recvsactionprint;
		this.providers = providers;
		this.dexmd5 = dexmd5;
		this.dangerschineseinfo = dangerschineseinfo;
		this.mostdangeraffect = mostdangeraffect;
		this.permissionused = permissionused;
		this.javaurls = javaurls;
		this.clsfcg = clsfcg;
		this.javaphones = javaphones;
		this.smaliphone = smaliphone;
		this.appname = appname;
		this.signmd5 = signmd5;
		this.apicallsrefper = apicallsrefper;
		this.isvalidapk = isvalidapk;
		this.version = version;
		this.javaips = javaips;
		this.javanum = javanum;
		this.apksize = apksize;
		this.apicalls = apicalls;
		this.analysistime = analysistime;
		this.icondir = icondir;
		this.activities = activities;
		this.activitiesprint = activitiesprint;
		this.signauthor = signauthor;
		this.receivers = receivers;
		this.behaviorsinfo = behaviorsinfo;
		this.smalidatabase = smalidatabase;
		this.classeshierarchyprint = classeshierarchyprint;
		this.services = services;
		this.smalinet = smalinet;
		this.smalisysservice = smalisysservice;
		this.package_ = package_;
		this.signSha1 = signSha1;
		this.signserialnum = signserialnum;
		this.javaemails = javaemails;
		this.signversion = signversion;
		this.permissiondeclared = permissiondeclared;
		this.os = os;
	}

	// Property accessors
	@Id
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

	@Column(name = "smalifile")
	public String getSmalifile() {
		return this.smalifile;
	}

	public void setSmalifile(String smalifile) {
		this.smalifile = smalifile;
	}

	@Column(name = "recvsactionprint")
	public String getRecvsactionprint() {
		return this.recvsactionprint;
	}

	public void setRecvsactionprint(String recvsactionprint) {
		this.recvsactionprint = recvsactionprint;
	}

	@Column(name = "providers")
	public String getProviders() {
		return this.providers;
	}

	public void setProviders(String providers) {
		this.providers = providers;
	}

	@Column(name = "dexmd5")
	public String getDexmd5() {
		return this.dexmd5;
	}

	public void setDexmd5(String dexmd5) {
		this.dexmd5 = dexmd5;
	}

	@Column(name = "dangerschineseinfo")
	public String getDangerschineseinfo() {
		return this.dangerschineseinfo;
	}

	public void setDangerschineseinfo(String dangerschineseinfo) {
		this.dangerschineseinfo = dangerschineseinfo;
	}

	@Column(name = "mostdangeraffect")
	public String getMostdangeraffect() {
		return this.mostdangeraffect;
	}

	public void setMostdangeraffect(String mostdangeraffect) {
		this.mostdangeraffect = mostdangeraffect;
	}

	@Column(name = "permissionused")
	public String getPermissionused() {
		return this.permissionused;
	}

	public void setPermissionused(String permissionused) {
		this.permissionused = permissionused;
	}

	@Column(name = "javaurls")
	public String getJavaurls() {
		return this.javaurls;
	}

	public void setJavaurls(String javaurls) {
		this.javaurls = javaurls;
	}

	@Column(name = "clsfcg")
	public String getClsfcg() {
		return this.clsfcg;
	}

	public void setClsfcg(String clsfcg) {
		this.clsfcg = clsfcg;
	}

	@Column(name = "javaphones")
	public String getJavaphones() {
		return this.javaphones;
	}

	public void setJavaphones(String javaphones) {
		this.javaphones = javaphones;
	}

	@Column(name = "smaliphone")
	public String getSmaliphone() {
		return this.smaliphone;
	}

	public void setSmaliphone(String smaliphone) {
		this.smaliphone = smaliphone;
	}

	@Column(name = "appname")
	public String getAppname() {
		return this.appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}

	@Column(name = "signmd5")
	public String getSignmd5() {
		return this.signmd5;
	}

	public void setSignmd5(String signmd5) {
		this.signmd5 = signmd5;
	}

	@Column(name = "apicallsrefper")
	public String getApicallsrefper() {
		return this.apicallsrefper;
	}

	public void setApicallsrefper(String apicallsrefper) {
		this.apicallsrefper = apicallsrefper;
	}

	@Column(name = "isvalidapk", length = 11)
	public String getIsvalidapk() {
		return this.isvalidapk;
	}

	public void setIsvalidapk(String isvalidapk) {
		this.isvalidapk = isvalidapk;
	}

	@Column(name = "version")
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "javaips")
	public String getJavaips() {
		return this.javaips;
	}

	public void setJavaips(String javaips) {
		this.javaips = javaips;
	}

	@Column(name = "javanum")
	public String getJavanum() {
		return this.javanum;
	}

	public void setJavanum(String javanum) {
		this.javanum = javanum;
	}

	@Column(name = "apksize")
	public Integer getApksize() {
		return this.apksize;
	}

	public void setApksize(Integer apksize) {
		this.apksize = apksize;
	}

	@Column(name = "apicalls")
	public String getApicalls() {
		return this.apicalls;
	}

	public void setApicalls(String apicalls) {
		this.apicalls = apicalls;
	}

	@Column(name = "analysistime")
	public String getAnalysistime() {
		return this.analysistime;
	}

	public void setAnalysistime(String analysistime) {
		this.analysistime = analysistime;
	}

	@Column(name = "icondir")
	public String getIcondir() {
		return this.icondir;
	}

	public void setIcondir(String icondir) {
		this.icondir = icondir;
	}

	@Column(name = "activities")
	public String getActivities() {
		return this.activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	@Column(name = "activitiesprint")
	public String getActivitiesprint() {
		return this.activitiesprint;
	}

	public void setActivitiesprint(String activitiesprint) {
		this.activitiesprint = activitiesprint;
	}

	@Column(name = "signauthor")
	public String getSignauthor() {
		return this.signauthor;
	}

	public void setSignauthor(String signauthor) {
		this.signauthor = signauthor;
	}

	@Column(name = "receivers")
	public String getReceivers() {
		return this.receivers;
	}

	public void setReceivers(String receivers) {
		this.receivers = receivers;
	}

	@Column(name = "behaviorsinfo")
	public String getBehaviorsinfo() {
		return this.behaviorsinfo;
	}

	public void setBehaviorsinfo(String behaviorsinfo) {
		this.behaviorsinfo = behaviorsinfo;
	}

	@Column(name = "smalidatabase")
	public String getSmalidatabase() {
		return this.smalidatabase;
	}

	public void setSmalidatabase(String smalidatabase) {
		this.smalidatabase = smalidatabase;
	}

	@Column(name = "classeshierarchyprint")
	public String getClasseshierarchyprint() {
		return this.classeshierarchyprint;
	}

	public void setClasseshierarchyprint(String classeshierarchyprint) {
		this.classeshierarchyprint = classeshierarchyprint;
	}

	@Column(name = "services")
	public String getServices() {
		return this.services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	@Column(name = "smalinet")
	public String getSmalinet() {
		return this.smalinet;
	}

	public void setSmalinet(String smalinet) {
		this.smalinet = smalinet;
	}

	@Column(name = "smalisysservice")
	public String getSmalisysservice() {
		return this.smalisysservice;
	}

	public void setSmalisysservice(String smalisysservice) {
		this.smalisysservice = smalisysservice;
	}

	@Column(name = "package")
	public String getPackage_() {
		return this.package_;
	}

	public void setPackage_(String package_) {
		this.package_ = package_;
	}

	@Column(name = "signSHA1")
	public String getSignSha1() {
		return this.signSha1;
	}

	public void setSignSha1(String signSha1) {
		this.signSha1 = signSha1;
	}

	@Column(name = "signserialnum")
	public String getSignserialnum() {
		return this.signserialnum;
	}

	public void setSignserialnum(String signserialnum) {
		this.signserialnum = signserialnum;
	}

	@Column(name = "javaemails")
	public String getJavaemails() {
		return this.javaemails;
	}

	public void setJavaemails(String javaemails) {
		this.javaemails = javaemails;
	}

	@Column(name = "signversion")
	public String getSignversion() {
		return this.signversion;
	}

	public void setSignversion(String signversion) {
		this.signversion = signversion;
	}

	@Column(name = "permissiondeclared")
	public String getPermissiondeclared() {
		return this.permissiondeclared;
	}

	public void setPermissiondeclared(String permissiondeclared) {
		this.permissiondeclared = permissiondeclared;
	}

	@Column(name = "os")
	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}