package kz.mechta.seller

const val DAYS_FOR_IMMEDIATE_UPDATE = 7
const val DAYS_FOR_FLEXIBLE_UPDATE = 2
const val REMOTE_CONFIG_FETCH_INTERVAL = 7200L

const val PAGE_LIMIT = 30

const val NAV_ARGS_KEY = "nav_args_key"

const val PLACEHOLDERS_COUNT = 10
const val COMMENT_CHARACTERS_LEN = 65000
const val KZT_SIGN = "₸"
const val INSTALLMENT_MONTHS_DEFAULT = 24
const val EMPTY_REQUIRED_FIELD_TEXT = " *"

const val DB_NAME = "local_database"
const val AMPLITUDE_API_KEY = "383e593a348466547e8689461df2cf92"
const val DUBL_GIS_API_KEY = "4c64b77c-856d-47bb-b44f-104acde33282"
const val MINDBOX_DOMAIN_NAME = "api.mindbox.ru"
const val MINDBOX_ENDPOINT_ID = "mechta-Android-sandbox"

object AuthType {
    const val LOGIN = "login"
    const val REGISTER = "register"
}

object BrokerStatus {
    const val IN_PROGRESS = "in_progress"
    const val APPROVED = "approved"
    const val REJECTED = "rejected"
}

const val CONTACT_PHONE = "+7 747 440 40 40"
const val MECHTA_BOT_LINK = "https://t.me/MechtaShop_bot"
const val WHATSAPP_LINK = "https://wa.me/77010315436"
const val CONTRACT_PDF_LINK = "https://www.mechta.kz/public_contract/mobile"
const val PRIVACY_POLICY_PDF_LINK = "https://www.mechta.kz/useful/%D0%A1%D0%BE%D0%B3%D0%BB%D0%B0%D1%88%D0%B5%D0%BD%D0%B8%D0%B5_%D0%BE_%D0%BA%D0%BE%D0%BD%D1%84%D0%B8%D0%B4%D0%B5%D0%BD%D1%86%D0%B8%D0%B0%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D0%B8_2021.pdf"

const val PRIVACY_POLICY_LINK = "https://www.mechta.kz/privacy_policy/mobile"
const val TERMS_OF_USE_LINK = "https://www.mechta.kz/terms_of_use/mobile"

const val PRIVACY_POLICY_TAG = "privacy"
const val TERMS_OF_USE_TAG = "terms_of_use"

const val FULL_PHONE_LENGTH = 10
const val FULL_BIN_LENGTH = 12
const val FULL_CODE_LENGTH = 4

const val LANG_KAZAKH = "kk"
const val LANG_RUSSIAN = "ru"
const val LANG_DEFAULT = LANG_RUSSIAN
const val APP_LANG_KEY = "APP_LANG"

object RemoteConfigKeys {
    const val UPDATES = "android_updates"
}

object UpdatePriority {
    const val FLEXIBLE = 1
    const val IMMEDIATE = 2
}

object OrderStatus {
    const val ACTIVE = "active"
    const val FINISHED = "finished"
    const val CANCELLED = "cancelled"
}