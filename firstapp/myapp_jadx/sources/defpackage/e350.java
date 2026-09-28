package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class e350 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ xmt a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e350(xmt xmtVar, Context context, String str, v1b<? super e350> v1bVar) {
        super(2, v1bVar);
        this.a = xmtVar;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e350(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e350) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (pot potVar : ((HashMap) this.a.c()).values()) {
            potVar.getClass();
            String str2 = potVar.d;
            if (potVar.f == null && c.u(str2, "data:", false) && StringsKt.T(str2, "base64,", 0, false, 6) > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(str2.substring(StringsKt.S(str2, ',', 0, 6) + 1), 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    potVar.f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e) {
                    lgt.c("data URL did not have correct base64 format.", e);
                }
            }
            Context context = this.b;
            if (potVar.f == null && (str = this.c) != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str + str2);
                    inputStreamOpen.getClass();
                    Bitmap bitmapDecodeStream = null;
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                    } catch (IllegalArgumentException e2) {
                        lgt.c("Unable to decode image.", e2);
                    }
                    if (bitmapDecodeStream != null) {
                        potVar.f = srh0.d(bitmapDecodeStream, potVar.a, potVar.b);
                    }
                } catch (IOException e3) {
                    lgt.c("Unable to open asset.", e3);
                }
            }
        }
        return Unit.a;
    }
}
