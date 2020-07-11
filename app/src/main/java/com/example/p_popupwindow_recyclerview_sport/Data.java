package com.example.p_popupwindow_recyclerview_sport;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Data {

    @SerializedName("BannerList")
    private List<BannerList> BannerList;
    private List<MarqueeList> MarqueeList;
    private List<HotRaceManages> HotRaceManages;
    private MemberInfo MemberInfo;
    private List<ImportantNotices> ImportantNotices;
    private String MemberMainBalance;

    public Data(JSONObject jsonObject) throws JSONException {
        if(jsonObject != null){
            Gson gson = new Gson();

            //1.接收data資料
            JSONArray bannerList = jsonObject.getJSONArray("BannerList");
            JSONArray marqueeList = jsonObject.getJSONArray("MarqueeList");
            JSONArray hotRaceManages = jsonObject.getJSONArray("HotRaceManages");
            JSONObject memberInfo = jsonObject.getJSONObject("MemberInfo");
            JSONArray importantNotices = jsonObject.getJSONArray("ImportantNotices");

            //2.轉成jsonStromg
            String jsonBannerString = bannerList.toString();
            String marqueeListString = marqueeList.toString();
            String hotRaceManagesString = hotRaceManages.toString();
            String memberInfoString = memberInfo.toString();
            String importantNoticesString = importantNotices.toString();

            //3.解析轉成類別
            BannerList = gson.fromJson(getJsonArrayString(bannerList),new TypeToken<List<Data.BannerList>>(){}.getType());
            MarqueeList = gson.fromJson(getJsonArrayString(marqueeList),new TypeToken<List<Data.MarqueeList>>(){}.getType());
            HotRaceManages = gson.fromJson(getJsonArrayString(hotRaceManages),new TypeToken<List<Data.HotRaceManages>>(){}.getType());
            MemberInfo = gson.fromJson(getJsonObjectString(memberInfo), com.example.p_popupwindow_recyclerview_sport.Data.MemberInfo.class);
            ImportantNotices = gson.fromJson(importantNotices.toString(),new TypeToken<List<Data.ImportantNotices>>(){}.getType());
            MemberMainBalance = jsonObject.getString("MemberMainBalance");
        }
    }


    public List<Data.BannerList> getBannerList() {
        return BannerList;
    }

    public void setBannerList(List<Data.BannerList> bannerList) {
        BannerList = bannerList;
    }

    public List<Data.MarqueeList> getMarqueeList() {
        return MarqueeList;
    }

    public void setMarqueeList(List<Data.MarqueeList> marqueeList) {
        MarqueeList = marqueeList;
    }

    public List<Data.HotRaceManages> getHotRaceManages() {
        return HotRaceManages;
    }

    public void setHotRaceManages(List<Data.HotRaceManages> hotRaceManages) {
        HotRaceManages = hotRaceManages;
    }

    public Data.MemberInfo getMemberInfo() {
        return MemberInfo;
    }

    public void setMemberInfo(Data.MemberInfo memberInfo) {
        MemberInfo = memberInfo;
    }

    public List<Data.ImportantNotices> getImportantNotices() {
        return ImportantNotices;
    }

    public void setImportantNotices(List<Data.ImportantNotices> importantNotices) {
        ImportantNotices = importantNotices;
    }

    public String getMemberMainBalance() {
        return MemberMainBalance;
    }

    public void setMemberMainBalance(String memberMainBalance) {
        MemberMainBalance = memberMainBalance;
    }

    public static class BannerList {
        private int BannerGroupID;
        private String StartDate;
        private String EndDate;
        private String Title;
        private String PicName;
        private String Url;
        private int DeviceCommGroupID;
        private int UseType;
        private int PictureType;
        private int Activity_ID;
        private String ImagePath;

        public int getBannerGroupID() {
            return BannerGroupID;
        }

        public void setBannerGroupID(int bannerGroupID) {
            BannerGroupID = bannerGroupID;
        }

        public String getStartDate() {
            return StartDate;
        }

        public void setStartDate(String startDate) {
            StartDate = startDate;
        }

        public String getEndDate() {
            return EndDate;
        }

        public void setEndDate(String endDate) {
            EndDate = endDate;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getPicName() {
            return PicName;
        }

        public void setPicName(String picName) {
            PicName = picName;
        }

        public String getUrl() {
            return Url;
        }

        public void setUrl(String url) {
            Url = url;
        }

        public int getDeviceCommGroupID() {
            return DeviceCommGroupID;
        }

        public void setDeviceCommGroupID(int deviceCommGroupID) {
            DeviceCommGroupID = deviceCommGroupID;
        }

        public int getUseType() {
            return UseType;
        }

        public void setUseType(int useType) {
            UseType = useType;
        }

        public int getPictureType() {
            return PictureType;
        }

        public void setPictureType(int pictureType) {
            PictureType = pictureType;
        }

        public int getActivity_ID() {
            return Activity_ID;
        }

        public void setActivity_ID(int activity_ID) {
            Activity_ID = activity_ID;
        }

        public String getImagePath() {
            return ImagePath;
        }

        public void setImagePath(String imagePath) {
            ImagePath = imagePath;
        }
    }

    public static class MarqueeList {

    }

    public static class HotRaceManages {

        /**
         * HotRaceManageID : 3
         * StartRaceTime : 2020-07-09T00:00:00Z
         * StartDate : 2020-07-01T00:00:00Z
         * EndDate : 2020-07-31T00:00:00Z
         * BallType : 1
         * GameUnionRaceName : 通靈王大賽
         * MainTeamName : 麻倉葉
         * MainTeamLogo : http://mgt.dev.opebet5.com/Files/SportMessage/o/77363da7-4ecc-4ec4-be1b-692d925ee30c.jpg
         * VisiteTeamName : 道蓮
         * VisiteTeamLogo : http://mgt.dev.opebet5.com/Files/SportMessage/o/70134c9d-c416-4383-88ad-04f5a7f9234a.jpg
         * SportPlatform : 1
         * SportPlatformName : OPE体育
         * PlatformRaceNo : 3
         * BallTypeName : 足球
         */

        private int HotRaceManageID;
        private String StartRaceTime;
        private String StartDate;
        private String EndDate;
        private int BallType;
        private String GameUnionRaceName;
        private String MainTeamName;
        private String MainTeamLogo;
        private String VisiteTeamName;
        private String VisiteTeamLogo;
        private int SportPlatform;
        private String SportPlatformName;
        private String PlatformRaceNo;
        private String BallTypeName;

        public int getHotRaceManageID() {
            return HotRaceManageID;
        }

        public void setHotRaceManageID(int HotRaceManageID) {
            this.HotRaceManageID = HotRaceManageID;
        }

        public String getStartRaceTime() {
            return StartRaceTime;
        }

        public void setStartRaceTime(String StartRaceTime) {
            this.StartRaceTime = StartRaceTime;
        }

        public String getStartDate() {
            return StartDate;
        }

        public void setStartDate(String StartDate) {
            this.StartDate = StartDate;
        }

        public String getEndDate() {
            return EndDate;
        }

        public void setEndDate(String EndDate) {
            this.EndDate = EndDate;
        }

        public int getBallType() {
            return BallType;
        }

        public void setBallType(int BallType) {
            this.BallType = BallType;
        }

        public String getGameUnionRaceName() {
            return GameUnionRaceName;
        }

        public void setGameUnionRaceName(String GameUnionRaceName) {
            this.GameUnionRaceName = GameUnionRaceName;
        }

        public String getMainTeamName() {
            return MainTeamName;
        }

        public void setMainTeamName(String MainTeamName) {
            this.MainTeamName = MainTeamName;
        }

        public String getMainTeamLogo() {
            return MainTeamLogo;
        }

        public void setMainTeamLogo(String MainTeamLogo) {
            this.MainTeamLogo = MainTeamLogo;
        }

        public String getVisiteTeamName() {
            return VisiteTeamName;
        }

        public void setVisiteTeamName(String VisiteTeamName) {
            this.VisiteTeamName = VisiteTeamName;
        }

        public String getVisiteTeamLogo() {
            return VisiteTeamLogo;
        }

        public void setVisiteTeamLogo(String VisiteTeamLogo) {
            this.VisiteTeamLogo = VisiteTeamLogo;
        }

        public int getSportPlatform() {
            return SportPlatform;
        }

        public void setSportPlatform(int SportPlatform) {
            this.SportPlatform = SportPlatform;
        }

        public String getSportPlatformName() {
            return SportPlatformName;
        }

        public void setSportPlatformName(String SportPlatformName) {
            this.SportPlatformName = SportPlatformName;
        }

        public String getPlatformRaceNo() {
            return PlatformRaceNo;
        }

        public void setPlatformRaceNo(String PlatformRaceNo) {
            this.PlatformRaceNo = PlatformRaceNo;
        }

        public String getBallTypeName() {
            return BallTypeName;
        }

        public void setBallTypeName(String BallTypeName) {
            this.BallTypeName = BallTypeName;
        }
    }

    public static class MemberInfo {

        /**
         * NowDate : 0001-01-01T00:00:00
         * Account : opeope88
         * Name : rxrcrcr
         * Sex : 0
         * BirthDay : null
         * QQ :
         * CellPhone : 15236985475
         * CellPhoneStatus : 1
         * CountryCode : 0
         * ProvinceID : 6
         * City :
         * Address :
         * Email : xtw88284@mziqo.com
         * EmailStatus : 1
         * BankPasswordStatus : 1
         * VIPLevel : 0
         * LevelEName : VIP0
         * LastLoginDate : 2020-07-10T14:59:14.56Z
         * WeChat :
         * CanApplyRescueGift : 0
         * CreateDate : 2018-04-27T14:39:25.84Z
         * MemberBank : 1
         * Percentage : 100
         */

        private String NowDate;
        private String Account;
        private String Name;
        private int Sex;
        private Object BirthDay;
        private String QQ;
        private String CellPhone;
        private int CellPhoneStatus;
        private int CountryCode;
        private int ProvinceID;
        private String City;
        private String Address;
        private String Email;
        private int EmailStatus;
        private int BankPasswordStatus;
        private int VIPLevel;
        private String LevelEName;
        private String LastLoginDate;
        private String WeChat;
        private int CanApplyRescueGift;
        private String CreateDate;
        private int MemberBank;
        private int Percentage;

        public String getNowDate() {
            return NowDate;
        }

        public void setNowDate(String NowDate) {
            this.NowDate = NowDate;
        }

        public String getAccount() {
            return Account;
        }

        public void setAccount(String Account) {
            this.Account = Account;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getSex() {
            return Sex;
        }

        public void setSex(int Sex) {
            this.Sex = Sex;
        }

        public Object getBirthDay() {
            return BirthDay;
        }

        public void setBirthDay(Object BirthDay) {
            this.BirthDay = BirthDay;
        }

        public String getQQ() {
            return QQ;
        }

        public void setQQ(String QQ) {
            this.QQ = QQ;
        }

        public String getCellPhone() {
            return CellPhone;
        }

        public void setCellPhone(String CellPhone) {
            this.CellPhone = CellPhone;
        }

        public int getCellPhoneStatus() {
            return CellPhoneStatus;
        }

        public void setCellPhoneStatus(int CellPhoneStatus) {
            this.CellPhoneStatus = CellPhoneStatus;
        }

        public int getCountryCode() {
            return CountryCode;
        }

        public void setCountryCode(int CountryCode) {
            this.CountryCode = CountryCode;
        }

        public int getProvinceID() {
            return ProvinceID;
        }

        public void setProvinceID(int ProvinceID) {
            this.ProvinceID = ProvinceID;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String City) {
            this.City = City;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public int getEmailStatus() {
            return EmailStatus;
        }

        public void setEmailStatus(int EmailStatus) {
            this.EmailStatus = EmailStatus;
        }

        public int getBankPasswordStatus() {
            return BankPasswordStatus;
        }

        public void setBankPasswordStatus(int BankPasswordStatus) {
            this.BankPasswordStatus = BankPasswordStatus;
        }

        public int getVIPLevel() {
            return VIPLevel;
        }

        public void setVIPLevel(int VIPLevel) {
            this.VIPLevel = VIPLevel;
        }

        public String getLevelEName() {
            return LevelEName;
        }

        public void setLevelEName(String LevelEName) {
            this.LevelEName = LevelEName;
        }

        public String getLastLoginDate() {
            return LastLoginDate;
        }

        public void setLastLoginDate(String LastLoginDate) {
            this.LastLoginDate = LastLoginDate;
        }

        public String getWeChat() {
            return WeChat;
        }

        public void setWeChat(String WeChat) {
            this.WeChat = WeChat;
        }

        public int getCanApplyRescueGift() {
            return CanApplyRescueGift;
        }

        public void setCanApplyRescueGift(int CanApplyRescueGift) {
            this.CanApplyRescueGift = CanApplyRescueGift;
        }

        public String getCreateDate() {
            return CreateDate;
        }

        public void setCreateDate(String CreateDate) {
            this.CreateDate = CreateDate;
        }

        public int getMemberBank() {
            return MemberBank;
        }

        public void setMemberBank(int MemberBank) {
            this.MemberBank = MemberBank;
        }

        public int getPercentage() {
            return Percentage;
        }

        public void setPercentage(int Percentage) {
            this.Percentage = Percentage;
        }
    }

    public static class ImportantNotices {

    }

    private String getJsonArrayString(JSONArray jsonArray){
        return jsonArray.toString();
    }

    private String getJsonObjectString(JSONObject jsonObject){
        return jsonObject.toString();
    }
}
