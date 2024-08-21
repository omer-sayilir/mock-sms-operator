package tr.com.kolaysoft.peyk.mocksmsoperator.model;

public enum SmsErrorCode {
    ERR_BAD_REQUEST("Hatalı istek gereken şartlar yerine getirilmemiş veya illegal bir istekte bulunuluyor"),
    ERR_INVALID_PARAM("Hatalı parametre message parametresindeki açıklamaya bakınız"),
    ERR_UNAUTHORIZED_REQUEST("Kullanıcı adı veya parola hatalı"),
    ERR_USER_NOT_AUTHORIZED("Kullanıcının bu işlemi yapmaya yetkisi yok"),
    ERR_INVALID_SMS_SENDER("Hatalı gönderen başlığı"),
    ERR_EMPTY_SMS_PACKAGE("İlgili pakette geçerli numara bulunamadı"),
    ERR_INVALID_SMS_SENDING_DATE("Sms gönderim tarihi geçersiz ya da mevcut zamandan daha eski"),
    ERR_USER_CREDIT_REQUIRED("Kullanıcı yeterli krediye sahip değil"),
    ERR_PARENT_USER_CREDIT_REQUIRED("Üst kullanıcı yeterli krediye sahip değil"),
    ERR_USER_BRAND_CODE_NOT_FOUND("Kullanıcı IYS marka kodu tanımlı değil"),
    ERR_SMS_PKG_CUSTOM_ID_DUPLICATION("Belirtilen özel id ile daha önce oluşturulmuş bir sms paketi sistemde zaten mevcut"),
    ERR_INVALID_DATE_RANGE("Geçersiz tarih aralığı"),
    ERR_SMS_PKG_NOT_FOUND("Sms paketi mevcut değil"),
    ERR_SMS_PKG_NOT_CHANGEABLE("Sms durumu değiştirilebilir pozisyonda değil"),
    ERR_USER_IYS_SETTINGS_NOT_FOUND("Kullanıcı IYS tanımları mevcut değil"),
    ERR_INVALID_PRICING_PLAN("Fiyat planı geçersiz"),
    ERR_CREDIT_PLAN_NOT_FOUND("Kredi planı mevcut değil"),
    ERR_USER_NOT_FOUND("Kullanıcı bulunamadı"),
    ERR_SMS_PKG_DUPLICATION("Mevcut sms ilgili numaralara son 30 dk içersinde zaten gönderildi"),
    ERR_MO_NOT_FOUND("MO kısa numara mevcut değil"),
    ERR_SMS_PKG_CREATING_FAILED("Sms paketi oluşturulamadı"),
    ERR_SYSTEM_MAINTENANCE("Sistem bakım modunda daha sonra tekrar denenmeli."),
    ERR_NOT_FOUND("İstek atılan url geçersiz"),
    ERR_INTERNAL_SERVER("Sunucu hatası"),
    ERR_DAILY_REQUEST_LIMIT("Günlük rapor sorgulama limiti aşıldı");

    private String message;

    SmsErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
