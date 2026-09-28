package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class d350 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ xmt a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d350(xmt xmtVar, Context context, String str, String str2, v1b<? super d350> v1bVar) {
        super(2, v1bVar);
        this.a = xmtVar;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d350(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d350) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (a8i a8iVar : this.a.f.values()) {
            Context context = this.b;
            a8iVar.getClass();
            String str = a8iVar.a;
            String str2 = a8iVar.c;
            try {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), oxc.a(this.c, str, this.d));
                try {
                    typefaceCreateFromAsset.getClass();
                    str2.getClass();
                    int i = 0;
                    boolean zM = StringsKt.M(str2, "Italic", false);
                    boolean zM2 = StringsKt.M(str2, "Bold", false);
                    if (zM && zM2) {
                        i = 3;
                    } else if (zM) {
                        i = 2;
                    } else if (zM2) {
                        i = 1;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                    }
                    a8iVar.d = typefaceCreateFromAsset;
                } catch (Exception unused) {
                    lgt.a.getClass();
                }
            } catch (Exception unused2) {
                lgt.a.getClass();
            }
        }
        return Unit.a;
    }
}
