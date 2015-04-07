package com.apkanalysis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vtscan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "vtscan", catalog = "antivirus")
public class Vtscan implements java.io.Serializable {

	// Fields

	private Integer id;
	private String apkmd5;
	private String adAware;
	private String trendMicroHouseCall;
	private String esetNod32;
	private String mcAfee;
	private String microWorldEScan;
	private String baiduInternational;
	private String bitDefender;
	private String k7gw;
	private String updateDate;
	private String symantec;
	private String avast;
	private String clamAv;
	private String kaspersky;
	private String alibaba;
	private String FSecure;
	private String catQuickHeal;
	private String sophos;
	private String comodo;
	private String drWeb;
	private String vipre;
	private String trendMicro;
	private String emsisoft;
	private String FProt;
	private String cyren;
	private String avira;
	private String kingsoft;
	private String microsoft;
	private String aegisLab;
	private String gdata;
	private String resource;
	private String qihoo360;
	private String nanoAntivirus;
	private String vba32;
	private String avware;
	private String isscan;
	private String tencent;
	private String ikarus;
	private String fortinet;
	private String avg;
	private String ahnLabV3;
	private String jiangmin;
	private String zoner;
	private String rising;
	private String zillya;
	private String agnitum;
	private String totalDefense;
	private String mcAfeeGwEdition;
	private String alyac;
	private String antiyAvl;
	private String panda;
	private String commtouch;
	private String antiVir;
	private String norman;
	private String k7antiVirus;
	private String viRobot;

	// Constructors

	/** default constructor */
	public Vtscan() {
	}

	/** full constructor */
	public Vtscan(String apkmd5, String adAware, String trendMicroHouseCall,
			String esetNod32, String mcAfee, String microWorldEScan,
			String baiduInternational, String bitDefender, String k7gw,
			String updateDate, String symantec, String avast, String clamAv,
			String kaspersky, String alibaba, String FSecure,
			String catQuickHeal, String sophos, String comodo, String drWeb,
			String vipre, String trendMicro, String emsisoft, String FProt,
			String cyren, String avira, String kingsoft, String microsoft,
			String aegisLab, String gdata, String resource, String qihoo360,
			String nanoAntivirus, String vba32, String avware, String isscan,
			String tencent, String ikarus, String fortinet, String avg,
			String ahnLabV3, String jiangmin, String zoner, String rising,
			String zillya, String agnitum, String totalDefense,
			String mcAfeeGwEdition, String alyac, String antiyAvl,
			String panda, String commtouch, String antiVir, String norman,
			String k7antiVirus, String viRobot) {
		this.apkmd5 = apkmd5;
		this.adAware = adAware;
		this.trendMicroHouseCall = trendMicroHouseCall;
		this.esetNod32 = esetNod32;
		this.mcAfee = mcAfee;
		this.microWorldEScan = microWorldEScan;
		this.baiduInternational = baiduInternational;
		this.bitDefender = bitDefender;
		this.k7gw = k7gw;
		this.updateDate = updateDate;
		this.symantec = symantec;
		this.avast = avast;
		this.clamAv = clamAv;
		this.kaspersky = kaspersky;
		this.alibaba = alibaba;
		this.FSecure = FSecure;
		this.catQuickHeal = catQuickHeal;
		this.sophos = sophos;
		this.comodo = comodo;
		this.drWeb = drWeb;
		this.vipre = vipre;
		this.trendMicro = trendMicro;
		this.emsisoft = emsisoft;
		this.FProt = FProt;
		this.cyren = cyren;
		this.avira = avira;
		this.kingsoft = kingsoft;
		this.microsoft = microsoft;
		this.aegisLab = aegisLab;
		this.gdata = gdata;
		this.resource = resource;
		this.qihoo360 = qihoo360;
		this.nanoAntivirus = nanoAntivirus;
		this.vba32 = vba32;
		this.avware = avware;
		this.isscan = isscan;
		this.tencent = tencent;
		this.ikarus = ikarus;
		this.fortinet = fortinet;
		this.avg = avg;
		this.ahnLabV3 = ahnLabV3;
		this.jiangmin = jiangmin;
		this.zoner = zoner;
		this.rising = rising;
		this.zillya = zillya;
		this.agnitum = agnitum;
		this.totalDefense = totalDefense;
		this.mcAfeeGwEdition = mcAfeeGwEdition;
		this.alyac = alyac;
		this.antiyAvl = antiyAvl;
		this.panda = panda;
		this.commtouch = commtouch;
		this.antiVir = antiVir;
		this.norman = norman;
		this.k7antiVirus = k7antiVirus;
		this.viRobot = viRobot;
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

	@Column(name = "Ad_Aware")
	public String getAdAware() {
		return this.adAware;
	}

	public void setAdAware(String adAware) {
		this.adAware = adAware;
	}

	@Column(name = "TrendMicro_HouseCall")
	public String getTrendMicroHouseCall() {
		return this.trendMicroHouseCall;
	}

	public void setTrendMicroHouseCall(String trendMicroHouseCall) {
		this.trendMicroHouseCall = trendMicroHouseCall;
	}

	@Column(name = "ESET_NOD32")
	public String getEsetNod32() {
		return this.esetNod32;
	}

	public void setEsetNod32(String esetNod32) {
		this.esetNod32 = esetNod32;
	}

	@Column(name = "McAfee")
	public String getMcAfee() {
		return this.mcAfee;
	}

	public void setMcAfee(String mcAfee) {
		this.mcAfee = mcAfee;
	}

	@Column(name = "MicroWorld_eScan")
	public String getMicroWorldEScan() {
		return this.microWorldEScan;
	}

	public void setMicroWorldEScan(String microWorldEScan) {
		this.microWorldEScan = microWorldEScan;
	}

	@Column(name = "Baidu_International")
	public String getBaiduInternational() {
		return this.baiduInternational;
	}

	public void setBaiduInternational(String baiduInternational) {
		this.baiduInternational = baiduInternational;
	}

	@Column(name = "BitDefender")
	public String getBitDefender() {
		return this.bitDefender;
	}

	public void setBitDefender(String bitDefender) {
		this.bitDefender = bitDefender;
	}

	@Column(name = "K7GW")
	public String getK7gw() {
		return this.k7gw;
	}

	public void setK7gw(String k7gw) {
		this.k7gw = k7gw;
	}

	@Column(name = "update_date")
	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Column(name = "Symantec")
	public String getSymantec() {
		return this.symantec;
	}

	public void setSymantec(String symantec) {
		this.symantec = symantec;
	}

	@Column(name = "Avast")
	public String getAvast() {
		return this.avast;
	}

	public void setAvast(String avast) {
		this.avast = avast;
	}

	@Column(name = "ClamAV")
	public String getClamAv() {
		return this.clamAv;
	}

	public void setClamAv(String clamAv) {
		this.clamAv = clamAv;
	}

	@Column(name = "Kaspersky")
	public String getKaspersky() {
		return this.kaspersky;
	}

	public void setKaspersky(String kaspersky) {
		this.kaspersky = kaspersky;
	}

	@Column(name = "Alibaba")
	public String getAlibaba() {
		return this.alibaba;
	}

	public void setAlibaba(String alibaba) {
		this.alibaba = alibaba;
	}

	@Column(name = "F_Secure")
	public String getFSecure() {
		return this.FSecure;
	}

	public void setFSecure(String FSecure) {
		this.FSecure = FSecure;
	}

	@Column(name = "CAT_QuickHeal")
	public String getCatQuickHeal() {
		return this.catQuickHeal;
	}

	public void setCatQuickHeal(String catQuickHeal) {
		this.catQuickHeal = catQuickHeal;
	}

	@Column(name = "Sophos")
	public String getSophos() {
		return this.sophos;
	}

	public void setSophos(String sophos) {
		this.sophos = sophos;
	}

	@Column(name = "Comodo")
	public String getComodo() {
		return this.comodo;
	}

	public void setComodo(String comodo) {
		this.comodo = comodo;
	}

	@Column(name = "DrWeb")
	public String getDrWeb() {
		return this.drWeb;
	}

	public void setDrWeb(String drWeb) {
		this.drWeb = drWeb;
	}

	@Column(name = "VIPRE")
	public String getVipre() {
		return this.vipre;
	}

	public void setVipre(String vipre) {
		this.vipre = vipre;
	}

	@Column(name = "TrendMicro")
	public String getTrendMicro() {
		return this.trendMicro;
	}

	public void setTrendMicro(String trendMicro) {
		this.trendMicro = trendMicro;
	}

	@Column(name = "Emsisoft")
	public String getEmsisoft() {
		return this.emsisoft;
	}

	public void setEmsisoft(String emsisoft) {
		this.emsisoft = emsisoft;
	}

	@Column(name = "F_Prot")
	public String getFProt() {
		return this.FProt;
	}

	public void setFProt(String FProt) {
		this.FProt = FProt;
	}

	@Column(name = "Cyren")
	public String getCyren() {
		return this.cyren;
	}

	public void setCyren(String cyren) {
		this.cyren = cyren;
	}

	@Column(name = "Avira")
	public String getAvira() {
		return this.avira;
	}

	public void setAvira(String avira) {
		this.avira = avira;
	}

	@Column(name = "Kingsoft")
	public String getKingsoft() {
		return this.kingsoft;
	}

	public void setKingsoft(String kingsoft) {
		this.kingsoft = kingsoft;
	}

	@Column(name = "Microsoft")
	public String getMicrosoft() {
		return this.microsoft;
	}

	public void setMicrosoft(String microsoft) {
		this.microsoft = microsoft;
	}

	@Column(name = "AegisLab")
	public String getAegisLab() {
		return this.aegisLab;
	}

	public void setAegisLab(String aegisLab) {
		this.aegisLab = aegisLab;
	}

	@Column(name = "GData")
	public String getGdata() {
		return this.gdata;
	}

	public void setGdata(String gdata) {
		this.gdata = gdata;
	}

	@Column(name = "resource")
	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Column(name = "Qihoo_360")
	public String getQihoo360() {
		return this.qihoo360;
	}

	public void setQihoo360(String qihoo360) {
		this.qihoo360 = qihoo360;
	}

	@Column(name = "NANO_Antivirus")
	public String getNanoAntivirus() {
		return this.nanoAntivirus;
	}

	public void setNanoAntivirus(String nanoAntivirus) {
		this.nanoAntivirus = nanoAntivirus;
	}

	@Column(name = "VBA32")
	public String getVba32() {
		return this.vba32;
	}

	public void setVba32(String vba32) {
		this.vba32 = vba32;
	}

	@Column(name = "AVware")
	public String getAvware() {
		return this.avware;
	}

	public void setAvware(String avware) {
		this.avware = avware;
	}

	@Column(name = "isscan", length = 11)
	public String getIsscan() {
		return this.isscan;
	}

	public void setIsscan(String isscan) {
		this.isscan = isscan;
	}

	@Column(name = "Tencent")
	public String getTencent() {
		return this.tencent;
	}

	public void setTencent(String tencent) {
		this.tencent = tencent;
	}

	@Column(name = "Ikarus")
	public String getIkarus() {
		return this.ikarus;
	}

	public void setIkarus(String ikarus) {
		this.ikarus = ikarus;
	}

	@Column(name = "Fortinet")
	public String getFortinet() {
		return this.fortinet;
	}

	public void setFortinet(String fortinet) {
		this.fortinet = fortinet;
	}

	@Column(name = "AVG")
	public String getAvg() {
		return this.avg;
	}

	public void setAvg(String avg) {
		this.avg = avg;
	}

	@Column(name = "AhnLab_V3")
	public String getAhnLabV3() {
		return this.ahnLabV3;
	}

	public void setAhnLabV3(String ahnLabV3) {
		this.ahnLabV3 = ahnLabV3;
	}

	@Column(name = "Jiangmin")
	public String getJiangmin() {
		return this.jiangmin;
	}

	public void setJiangmin(String jiangmin) {
		this.jiangmin = jiangmin;
	}

	@Column(name = "Zoner")
	public String getZoner() {
		return this.zoner;
	}

	public void setZoner(String zoner) {
		this.zoner = zoner;
	}

	@Column(name = "Rising")
	public String getRising() {
		return this.rising;
	}

	public void setRising(String rising) {
		this.rising = rising;
	}

	@Column(name = "Zillya")
	public String getZillya() {
		return this.zillya;
	}

	public void setZillya(String zillya) {
		this.zillya = zillya;
	}

	@Column(name = "Agnitum")
	public String getAgnitum() {
		return this.agnitum;
	}

	public void setAgnitum(String agnitum) {
		this.agnitum = agnitum;
	}

	@Column(name = "TotalDefense")
	public String getTotalDefense() {
		return this.totalDefense;
	}

	public void setTotalDefense(String totalDefense) {
		this.totalDefense = totalDefense;
	}

	@Column(name = "McAfee_GW_Edition")
	public String getMcAfeeGwEdition() {
		return this.mcAfeeGwEdition;
	}

	public void setMcAfeeGwEdition(String mcAfeeGwEdition) {
		this.mcAfeeGwEdition = mcAfeeGwEdition;
	}

	@Column(name = "ALYac")
	public String getAlyac() {
		return this.alyac;
	}

	public void setAlyac(String alyac) {
		this.alyac = alyac;
	}

	@Column(name = "Antiy_AVL")
	public String getAntiyAvl() {
		return this.antiyAvl;
	}

	public void setAntiyAvl(String antiyAvl) {
		this.antiyAvl = antiyAvl;
	}

	@Column(name = "Panda")
	public String getPanda() {
		return this.panda;
	}

	public void setPanda(String panda) {
		this.panda = panda;
	}

	@Column(name = "Commtouch")
	public String getCommtouch() {
		return this.commtouch;
	}

	public void setCommtouch(String commtouch) {
		this.commtouch = commtouch;
	}

	@Column(name = "AntiVir")
	public String getAntiVir() {
		return this.antiVir;
	}

	public void setAntiVir(String antiVir) {
		this.antiVir = antiVir;
	}

	@Column(name = "Norman")
	public String getNorman() {
		return this.norman;
	}

	public void setNorman(String norman) {
		this.norman = norman;
	}

	@Column(name = "K7AntiVirus")
	public String getK7antiVirus() {
		return this.k7antiVirus;
	}

	public void setK7antiVirus(String k7antiVirus) {
		this.k7antiVirus = k7antiVirus;
	}

	@Column(name = "ViRobot")
	public String getViRobot() {
		return this.viRobot;
	}

	public void setViRobot(String viRobot) {
		this.viRobot = viRobot;
	}

}