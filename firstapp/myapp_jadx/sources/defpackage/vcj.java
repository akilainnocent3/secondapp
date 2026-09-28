package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class vcj {
    public static final /* synthetic */ int a = 0;

    public static final Integer a(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -715617392:
                if (str.equals("sr:sport:1")) {
                    return Integer.valueOf(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS);
                }
                return null;
            case -715617391:
                return !str.equals("sr:sport:2") ? null : 147;
            case -715617390:
                return !str.equals("sr:sport:3") ? null : 152;
            case -513544908:
                return !str.equals("sr:sport:1-1") ? null : 146;
            case -513544907:
                return !str.equals("sr:sport:1-2") ? null : 153;
            case 404585818:
                return !str.equals("sr:sport:1-3-1") ? null : 159;
            case 404585819:
                return !str.equals("sr:sport:1-3-2") ? null : 173;
            case 404672400:
                return !str.equals("sr:sport:10000") ? null : 171;
            case 1259979936:
                return !str.equals("sr:sport:1000") ? null : 150;
            default:
                return null;
        }
    }
}
