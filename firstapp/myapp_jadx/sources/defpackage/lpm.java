package defpackage;

import com.twilio.voice.Constants;
import kotlin.jvm.functions.Function0;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lpm implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MediaType.INSTANCE.get(Constants.APP_JSON_PAYLOAD_TYPE);
    }
}
