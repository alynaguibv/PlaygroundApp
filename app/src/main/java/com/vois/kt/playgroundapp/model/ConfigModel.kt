package com.vois.kt.playgroundapp.model

import com.google.gson.annotations.SerializedName


data class ConfigModel (

  @SerializedName("cancelContractHotline"                  ) var cancelContractHotline                  : String?                                  = null,
  @SerializedName("postpaid100MBExpirationIntervalInHours" ) var postpaid100MBExpirationIntervalInHours : Int?                                     = null,
  @SerializedName("hideMobilePaymentOption"                ) var hideMobilePaymentOption                : Boolean?                                 = null,
  @SerializedName("phoneNumbers"                           ) var phoneNumbers                           : PhoneNumbers?                            = PhoneNumbers(),
  @SerializedName("urlsList"                               ) var urlsList                               : ArrayList<UrlsList>                      = arrayListOf(),
  @SerializedName("packageDescriptions"                    ) var packageDescriptions                    : PackageDescriptions?                     = PackageDescriptions(),
  @SerializedName("packageSocs"                            ) var packageSocs                            : PackageSocs?                             = PackageSocs(),
  @SerializedName("miscIdentifiers"                        ) var miscIdentifiers                        : MiscIdentifiers?                         = MiscIdentifiers(),
  @SerializedName("miscIdentifiersList"                    ) var miscIdentifiersList                    : MiscIdentifiersList?                     = MiscIdentifiersList(),
  @SerializedName("imageNames"                             ) var imageNames                             : ImageNames?                              = ImageNames(),
  @SerializedName("pontisImages"                           ) var pontisImages                           : PontisImages?                            = PontisImages(),
  @SerializedName("thresholds"                             ) var thresholds                             : Thresholds?                              = Thresholds(),
  @SerializedName("features"                               ) var features                               : Features?                                = Features(),
  @SerializedName("securedScreens"                         ) var securedScreens                         : SecuredScreens?                          = SecuredScreens(),
  @SerializedName("notificationButtonActionGroup"          ) var notificationButtonActionGroup          : ArrayList<NotificationButtonActionGroup> = arrayListOf(),
  @SerializedName("bgLocationPopupShownMinsDelay"          ) var bgLocationPopupShownMinsDelay          : Int?                                     = null,
  @SerializedName("loginMethods"                           ) var loginMethods                           : LoginMethods?                            = LoginMethods(),
  @SerializedName("meinTarifMapping"                       ) var meinTarifMapping                       : ArrayList<MeinTarifMapping>              = arrayListOf(),
  @SerializedName("loginTabsConfig"                        ) var loginTabsConfig                        : LoginTabsConfig?                         = LoginTabsConfig(),
  @SerializedName("tooltips"                               ) var tooltips                               : ArrayList<Tooltips>                      = arrayListOf(),
  @SerializedName("rootDetection"                          ) var rootDetection                          : RootDetection?                           = RootDetection()

)


data class AppDynamics (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class Adjust (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class Pu (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class AccountLoginTab (

  @SerializedName("order"    ) var order    : Int?    = null,
  @SerializedName("titleKey" ) var titleKey : String? = null

)

data class ContractScenarioIds (

  @SerializedName("contractScenarioId"           ) var contractScenarioId          : String?  = null,
  @SerializedName("startDate_visible"            ) var startDateVisible            : Boolean? = null,
  @SerializedName("startDateLabel_de"            ) var startDateLabelDe            : String?  = null,
  @SerializedName("minimumRuntime_visible"       ) var minimumRuntimeVisible       : Boolean? = null,
  @SerializedName("minimumRuntimeLabel_de"       ) var minimumRuntimeLabelDe       : String?  = null,
  @SerializedName("lastCancellationDate_visible" ) var lastCancellationDateVisible : Boolean? = null,
  @SerializedName("lastCancellationDateLabel_de" ) var lastCancellationDateLabelDe : String?  = null,
  @SerializedName("endDate_visible"              ) var endDateVisible              : Boolean? = null,
  @SerializedName("endDateLabel_de"              ) var endDateLabelDe              : String?  = null,
  @SerializedName("additionalText_visible"       ) var additionalTextVisible       : Boolean? = null,
  @SerializedName("additionalTextLabel_de"       ) var additionalTextLabelDe       : String?  = null

)

data class DatenForTaten (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class DirectDebitTopUp (

  @SerializedName("amounts"       ) var amounts       : ArrayList<String> = arrayListOf(),
  @SerializedName("defaultAmount" ) var defaultAmount : String?           = null

)

data class Dunning (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class EeccPrepaid (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)


data class EligibleCustomerTypes (

  @SerializedName("showForTypeFixedNet"   ) var showForTypeFixedNet   : Boolean?          = null,
  @SerializedName("showForTypeCable"      ) var showForTypeCable      : Boolean?          = null,
  @SerializedName("showForTypePre"        ) var showForTypePre        : Boolean?          = null,
  @SerializedName("vfplanForTypePreWhite" ) var vfplanForTypePreWhite : ArrayList<String> = arrayListOf(),
  @SerializedName("vfplanForTypePreBlack" ) var vfplanForTypePreBlack : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypePreWhite"    ) var socForTypePreWhite    : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypePreBlack"    ) var socForTypePreBlack    : ArrayList<String> = arrayListOf(),
  @SerializedName("showForTypeI"          ) var showForTypeI          : Boolean?          = null,
  @SerializedName("vfplanForTypeIWhite"   ) var vfplanForTypeIWhite   : ArrayList<String> = arrayListOf(),
  @SerializedName("vfplanForTypeIBlack"   ) var vfplanForTypeIBlack   : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypeIWhite"      ) var socForTypeIWhite      : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypeIBlack"      ) var socForTypeIBlack      : ArrayList<String> = arrayListOf(),
  @SerializedName("showForTypeS"          ) var showForTypeS          : Boolean?          = null,
  @SerializedName("vfplanForTypeSWhite"   ) var vfplanForTypeSWhite   : ArrayList<String> = arrayListOf(),
  @SerializedName("vfplanForTypeSBlack"   ) var vfplanForTypeSBlack   : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypeSWhite"      ) var socForTypeSWhite      : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypeSBlack"      ) var socForTypeSBlack      : ArrayList<String> = arrayListOf(),
  @SerializedName("showForTypeB"          ) var showForTypeB          : Boolean?          = null,
  @SerializedName("vfplanForTypeBWhite"   ) var vfplanForTypeBWhite   : ArrayList<String> = arrayListOf(),
  @SerializedName("vfplanForTypeBBlack"   ) var vfplanForTypeBBlack   : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypeBWhite"      ) var socForTypeBWhite      : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypeBBlack"      ) var socForTypeBBlack      : ArrayList<String> = arrayListOf(),
  @SerializedName("showForTypePU"         ) var showForTypePU         : Boolean?          = null,
  @SerializedName("vfplanForTypePUWhite"  ) var vfplanForTypePUWhite  : ArrayList<String> = arrayListOf(),
  @SerializedName("vfplanForTypePUBlack"  ) var vfplanForTypePUBlack  : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypePUWhite"     ) var socForTypePUWhite     : ArrayList<String> = arrayListOf(),
  @SerializedName("socForTypePUBlack"     ) var socForTypePUBlack     : ArrayList<String> = arrayListOf(),
  @SerializedName("showForTypeUnityMedia" ) var showForTypeUnityMedia : Boolean?          = null,
  @SerializedName("unityMediaSubType"     ) var unityMediaSubType     : ArrayList<String> = arrayListOf()

)

data class FlurrySDK (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)



data class SmapiSdk (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class HiddenTariffPrice (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class HideAutoTopupKias20 (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class Features (

  @SerializedName("eeccPrepaid"             ) var eeccPrepaid             : EeccPrepaid?             = EeccPrepaid(),
  @SerializedName("pontis"                  ) var pontis                  : Pontis?                  = Pontis(),
  @SerializedName("personalAgent"           ) var personalAgent           : PersonalAgent?           = PersonalAgent(),
  @SerializedName("netPerform"              ) var netPerform              : NetPerform?              = NetPerform(),
  @SerializedName("adjust"                  ) var adjust                  : Adjust?                  = Adjust(),
  @SerializedName("appDynamics"             ) var appDynamics             : AppDynamics?             = AppDynamics(),
  @SerializedName("dunning"                 ) var dunning                 : Dunning?                 = Dunning(),
  @SerializedName("loggedOutOffer"          ) var loggedOutOffer          : LoggedOutOffer?          = LoggedOutOffer(),
  @SerializedName("inactivityPopup"         ) var inactivityPopup         : InactivityPopup?         = InactivityPopup(),
  @SerializedName("networkExpert"           ) var networkExpert           : NetworkExpert?           = NetworkExpert(),
  @SerializedName("forecastGraph"           ) var forecastGraph           : ForecastGraph?           = ForecastGraph(),
  @SerializedName("quickCheckFlat"          ) var quickCheckFlat          : QuickCheckFlat?          = QuickCheckFlat(),
  @SerializedName("targetCaching"           ) var targetCaching           : TargetCaching?           = TargetCaching(),
  @SerializedName("onlineAufladenAsWebview" ) var onlineAufladenAsWebview : OnlineAufladenAsWebview? = OnlineAufladenAsWebview(),
  @SerializedName("homePlusButton"          ) var homePlusButton          : HomePlusButton?          = HomePlusButton(),
  @SerializedName("pu"                      ) var pu                      : Pu?                      = Pu(),
  @SerializedName("zeroRatingPrepaid"       ) var zeroRatingPrepaid       : ZeroRatingPrepaid?       = ZeroRatingPrepaid(),
  @SerializedName("zeroRatingPostpaid"      ) var zeroRatingPostpaid      : ZeroRatingPostpaid?      = ZeroRatingPostpaid(),
  @SerializedName("redeemVoucher"           ) var redeemVoucher           : RedeemVoucher?           = RedeemVoucher(),
  @SerializedName("vote"                    ) var vote                    : Vote?                    = Vote(),
  @SerializedName("transferCosts"           ) var transferCosts           : TransferCosts?           = TransferCosts(),
  @SerializedName("zeroRating"              ) var zeroRating              : ZeroRating?              = ZeroRating(),
  @SerializedName("datenForTaten"           ) var datenForTaten           : DatenForTaten?           = DatenForTaten(),
  @SerializedName("komfortRegistration"     ) var komfortRegistration     : KomfortRegistration?     = KomfortRegistration(),
  @SerializedName("smapiSdk"                ) var smapiSdk                : SmapiSdk?                = SmapiSdk(),
  @SerializedName("hiddenTariffPrice"       ) var hiddenTariffPrice       : HiddenTariffPrice?       = HiddenTariffPrice(),
  @SerializedName("hideAutoTopupKias20"     ) var hideAutoTopupKias20     : HideAutoTopupKias20?     = HideAutoTopupKias20(),
  @SerializedName("LoginWithKabel"          ) var LoginWithKabel          : LoginWithKabel?          = LoginWithKabel(),
  @SerializedName("flurrySDK"               ) var flurrySDK               : FlurrySDK?               = FlurrySDK(),
  @SerializedName("survey4GCard"            ) var survey4GCard            : Survey4GCard?            = Survey4GCard(),
  @SerializedName("rating"                  ) var rating                  : Rating?                  = Rating(),
  @SerializedName("marketingTray"           ) var marketingTray           : MarketingTray?           = MarketingTray(),
  @SerializedName("simEditNickName"         ) var simEditNickName         : SimEditNickName?         = SimEditNickName()

)

data class ForecastGraph (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class HeaderEnrichment (

  @SerializedName("enable" ) var enable : Boolean? = null

)

data class HomePlusButton (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class ImageNames (

  @SerializedName("prepaid_zeroRating"         ) var prepaidZeroRating         : String? = null,
  @SerializedName("prepaid_bookOptionList"     ) var prepaidBookOptionList     : String? = null,
  @SerializedName("prepaid_bookOptionDetail"   ) var prepaidBookOptionDetail   : String? = null,
  @SerializedName("prepaid_changeTariffList"   ) var prepaidChangeTariffList   : String? = null,
  @SerializedName("prepaid_changeTariffDetail" ) var prepaidChangeTariffDetail : String? = null,
  @SerializedName("prepaid_topupList"          ) var prepaidTopupList          : String? = null,
  @SerializedName("prepaid_topupDetail"        ) var prepaidTopupDetail        : String? = null,
  @SerializedName("prepaid_informativeList"    ) var prepaidInformativeList    : String? = null,
  @SerializedName("prepaid_informativeDetail"  ) var prepaidInformativeDetail  : String? = null,
  @SerializedName("prepaid_variousList"        ) var prepaidVariousList        : String? = null,
  @SerializedName("prepaid_variousDetail"      ) var prepaidVariousDetail      : String? = null,
  @SerializedName("app_background"             ) var appBackground             : String? = null

)

data class InactivityPopup (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class InternetPasswordTab (

  @SerializedName("order"    ) var order    : Int?    = null,
  @SerializedName("titleKey" ) var titleKey : String? = null

)

data class KomfortRegistration (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class LoggedOutOffer (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class LoginMethods (

  @SerializedName("msisdn"           ) var msisdn           : Msisdn?           = Msisdn(),
  @SerializedName("sms"              ) var sms              : Sms?              = Sms(),
  @SerializedName("web"              ) var web              : Web?              = Web(),
  @SerializedName("headerEnrichment" ) var headerEnrichment : HeaderEnrichment? = HeaderEnrichment()

)

data class LoginTabsConfig (

  @SerializedName("internetPasswordTab" ) var internetPasswordTab : InternetPasswordTab? = InternetPasswordTab(),
  @SerializedName("accountLoginTab"     ) var accountLoginTab     : AccountLoginTab?     = AccountLoginTab()

)

data class LoginWithKabel (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class MarketingTray (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null,
  @SerializedName("tabletEnabled"         ) var tabletEnabled         : Boolean?               = null

)

data class MeinTarifMapping (

  @SerializedName("contractScenarioIds" ) var contractScenarioIds : ArrayList<ContractScenarioIds> = arrayListOf()

)

data class MiscIdentifiers (

  @SerializedName("prepaidDataIdentifier"    ) var prepaidDataIdentifier    : String? = null,
  @SerializedName("prepaidBonusIdentifier"   ) var prepaidBonusIdentifier   : String? = null,
  @SerializedName("dealerCode"               ) var dealerCode               : String? = null,
  @SerializedName("quickCheckFlatIdentifier" ) var quickCheckFlatIdentifier : String? = null

)

data class MiscIdentifiersList (

  @SerializedName("whitelisted_domains"               ) var whitelistedDomains                : ArrayList<String>        = arrayListOf(),
  @SerializedName("speedGoStatuses"                   ) var speedGoStatuses                   : SpeedGoStatuses?         = SpeedGoStatuses(),
  @SerializedName("prepaid_callyaDigitalSocs"         ) var prepaidCallyaDigitalSocs          : ArrayList<String>        = arrayListOf(),
  @SerializedName("mnpBlackList"                      ) var mnpBlackList                      : ArrayList<String>        = arrayListOf(),
  @SerializedName("enjoyMoreIdentifiers"              ) var enjoyMoreIdentifiers              : ArrayList<String>        = arrayListOf(),
  @SerializedName("postpaid_gigaBoostSocs"            ) var postpaidGigaBoostSocs             : ArrayList<String>        = arrayListOf(),
  @SerializedName("validityDateBlackListIdentifiers"  ) var validityDateBlackListIdentifiers  : ArrayList<String>        = arrayListOf(),
  @SerializedName("validityDateOneDayListIdentifiers" ) var validityDateOneDayListIdentifiers : ArrayList<String>        = arrayListOf(),
  @SerializedName("highspeedIdentifiers"              ) var highspeedIdentifiers              : ArrayList<String>        = arrayListOf(),
  @SerializedName("prepaidFlexPlanIdentifiers"        ) var prepaidFlexPlanIdentifiers        : ArrayList<String>        = arrayListOf(),
  @SerializedName("prepaid_zeroRatingSocs"            ) var prepaidZeroRatingSocs             : ArrayList<String>        = arrayListOf(),
  @SerializedName("webview_cookies"                   ) var webviewCookies                    : ArrayList<String>        = arrayListOf(),
  @SerializedName("prepaid_unlimited4GSocs"           ) var prepaidUnlimited4GSocs            : ArrayList<String>        = arrayListOf(),
  @SerializedName("prepaidUsageGroupBlackList"        ) var prepaidUsageGroupBlackList        : ArrayList<String>        = arrayListOf(),
  @SerializedName("passes_barring_socs"               ) var passesBarringSocs                 : ArrayList<String>        = arrayListOf(),
  @SerializedName("ratingSuccessJourney"              ) var ratingSuccessJourney              : ArrayList<String>        = arrayListOf(),
  @SerializedName("ratingScreens"                     ) var ratingScreens                     : ArrayList<RatingScreens> = arrayListOf(),
  @SerializedName("directDebitTopUp"                  ) var directDebitTopUp                  : DirectDebitTopUp?        = DirectDebitTopUp()

)

data class Msisdn (

  @SerializedName("enable" ) var enable : Boolean? = null

)

data class NetPerform (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class NetworkExpert (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class NotificationButtonActionGroup (

  @SerializedName("buttonOneId"   ) var buttonOneId   : String? = null,
  @SerializedName("buttonTwoId"   ) var buttonTwoId   : String? = null,
  @SerializedName("actionGroupId" ) var actionGroupId : String? = null

)

data class OnlineAufladenAsWebview (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class PackageDescriptions (

  @SerializedName("AlwaysOn"       ) var AlwaysOn       : String? = null,
  @SerializedName("flatIdentifier" ) var flatIdentifier : String? = null,
  @SerializedName("redPlus"        ) var redPlus        : String? = null,
  @SerializedName("highspeedData"  ) var highspeedData  : String? = null

)

data class PackageSocs (

  @SerializedName("prepaid_zeroRatingSoc"        ) var prepaidZeroRatingSoc      : String? = null,
  @SerializedName("prepaid_unlimited4GSoc"       ) var prepaidUnlimited4GSoc     : String? = null,
  @SerializedName("postpaid_redeem_voucher_soc2" ) var postpaidRedeemVoucherSoc2 : String? = null,
  @SerializedName("postpaid_redeem_voucher_soc1" ) var postpaidRedeemVoucherSoc1 : String? = null,
  @SerializedName("postpaid_zeroRatingSoc"       ) var postpaidZeroRatingSoc     : String? = null,
  @SerializedName("postpaid_unlimited4GSoc"      ) var postpaidUnlimited4GSoc    : String? = null

)

data class Pages (

  @SerializedName("title" ) var title : String? = null,
  @SerializedName("body"  ) var body  : String? = null

)

data class PersonalAgent (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class Pontis (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

class PhoneNumbers

data class PontisImages (

  @SerializedName("informative"  ) var informative  : ArrayList<String> = arrayListOf(),
  @SerializedName("topup"        ) var topup        : ArrayList<String> = arrayListOf(),
  @SerializedName("changeTariff" ) var changeTariff : ArrayList<String> = arrayListOf(),
  @SerializedName("various"      ) var various      : ArrayList<String> = arrayListOf(),
  @SerializedName("bookOption"   ) var bookOption   : ArrayList<String> = arrayListOf()

)

data class Rating (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class QuickCheckFlat (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class RatingScreens (

  @SerializedName("screenName" ) var screenName : String? = null,
  @SerializedName("visits"     ) var visits     : Int?    = null

)

data class RedeemVoucher (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class RootDetection (

  @SerializedName("rootDetectionLevel" ) var rootDetectionLevel : String? = null,
  @SerializedName("titleText"          ) var titleText          : String? = null,
  @SerializedName("hintText"           ) var hintText           : String? = null

)

data class SecuredScreens (

  @SerializedName("screens"            ) var screens            : ArrayList<String> = arrayListOf(),
  @SerializedName("screenShotsEnabled" ) var screenShotsEnabled : Boolean?          = null

)

data class Survey4GCard (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class TargetCaching (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class Thresholds (

  @SerializedName("serviceEECCTimeDelayMilliseconds"        ) var serviceEECCTimeDelayMilliseconds      : Int? = null,
  @SerializedName("inactivityPopupTimeInterval"             ) var inactivityPopupTimeInterval           : Int? = null,
  @SerializedName("vodafoneUnlimitedRedPlusMB"              ) var vodafoneUnlimitedRedPlusMB            : Int? = null,
  @SerializedName("vodafoneUnlimitedMB"                     ) var vodafoneUnlimitedMB                   : Int? = null,
  @SerializedName("forecastGraphThreshold"                  ) var forecastGraphThreshold                : Int? = null,
  @SerializedName("postpaid_redeemVoucherWaitingTime"       ) var postpaidRedeemVoucherWaitingTime      : Int? = null,
  @SerializedName("prepaid_transferStepValue3"              ) var prepaidTransferStepValue3             : Int? = null,
  @SerializedName("prepaid_transferStepValue2"              ) var prepaidTransferStepValue2             : Int? = null,
  @SerializedName("prepaid_transferStepValue1"              ) var prepaidTransferStepValue1             : Int? = null,
  @SerializedName("prepaid_transferStepCount"               ) var prepaidTransferStepCount              : Int? = null,
  @SerializedName("postpaid_zeroRatingTimeSpan"             ) var postpaidZeroRatingTimeSpan            : Int? = null,
  @SerializedName("prepaid_zeroRatingTimeSpan"              ) var prepaidZeroRatingTimeSpan             : Int? = null,
  @SerializedName("bannerDelay"                             ) var bannerDelay                           : Int? = null,
  @SerializedName("fingerPrintAssociateRecurrence"          ) var fingerPrintAssociateRecurrence        : Int? = null,
  @SerializedName("highSpeedThreshold"                      ) var highSpeedThreshold                    : Int? = null,
  @SerializedName("prepaidDataRequestRemainingPercentage"   ) var prepaidDataRequestRemainingPercentage : Int? = null,
  @SerializedName("sessionTimeOutInterval"                  ) var sessionTimeOutInterval                : Int? = null,
  @SerializedName("product_hub_selector" ) var productHubSelector : Int? = null

)

data class Tooltips (

  @SerializedName("backgroundColor"       ) var backgroundColor       : String?                = null,
  @SerializedName("screenID"              ) var screenID              : String?                = null,
  @SerializedName("nextPageButtonText"    ) var nextPageButtonText    : String?                = null,
  @SerializedName("dismissPageButtonText" ) var dismissPageButtonText : String?                = null,
  @SerializedName("pages"                 ) var pages                 : ArrayList<Pages>       = arrayListOf(),
  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null,
  @SerializedName("tabletEnabled"         ) var tabletEnabled         : Boolean?               = null

)


data class TransferCosts (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class UrlsList (

  @SerializedName("urlKey"   ) var urlKey   : String? = null,
  @SerializedName("urlValue" ) var urlValue : String? = null

)


data class Vote (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class Web (

  @SerializedName("enable" ) var enable : Boolean? = null

)

data class ZeroRating (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)
data class ZeroRatingPostpaid (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class ZeroRatingPrepaid (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null

)

data class SpeedGoStatuses (

  @SerializedName("threshold_is_exceeded" ) var thresholdIsExceeded : ArrayList<String> = arrayListOf(),
  @SerializedName("deactivated"           ) var deactivated         : ArrayList<String> = arrayListOf()

)


data class Sms (

  @SerializedName("enable"                    ) var enable                    : Boolean? = null,
  @SerializedName("resendCodeDisableDuration" ) var resendCodeDisableDuration : Int?     = null

)

data class SimEditNickName (

  @SerializedName("eligibleCustomerTypes" ) var eligibleCustomerTypes : EligibleCustomerTypes? = EligibleCustomerTypes(),
  @SerializedName("enable"                ) var enable                : Boolean?               = null,
  @SerializedName("tabletEnabled"         ) var tabletEnabled         : Boolean?               = null

)