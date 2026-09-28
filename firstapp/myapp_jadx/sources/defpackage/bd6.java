package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.captcha.Quiz;
import com.sporty.android.platform.features.captcha.model.InHouseCaptchaImage;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbd6;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bd6 extends j8i0 {
    public static final /* synthetic */ ohp<Object>[] w = {new otw(0, bd6.class, "state", "getState()Lcom/sporty/android/platform/features/captcha/inhouseCaptcha/InHouseCaptchaState;")};
    public static final int y = 8;
    public final pdn a;
    public final v8w b;
    public final njs<pdn.a> c;
    public final v340 d;
    public final vwd0 e;
    public int f;
    public String i;
    public jvd0 v;

    public static final class a implements lyh<InHouseCaptchaImage.Image> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: bd6$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseViewModel$updateImage$$inlined$map$1", f = "CaptchaInHouseViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0119a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0119a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: bd6$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseViewModel$updateImage$$inlined$map$1$2", f = "CaptchaInHouseViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0120a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0120a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0120a c0120a;
                if (v1bVar instanceof C0120a) {
                    c0120a = (C0120a) v1bVar;
                    int i = c0120a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0120a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0120a = new C0120a(v1bVar);
                    }
                } else {
                    c0120a = new C0120a(v1bVar);
                }
                Object obj2 = c0120a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0120a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Quiz quiz = (Quiz) n52.b((BaseResponse) obj);
                    byte[] bArrDecode = Base64.decode((String) StringsKt__StringsKt.split$default(quiz.getImage(), new String[]{","}, false, 0, 6, null).get(1), 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    bitmapDecodeByteArray.getClass();
                    InHouseCaptchaImage.Image image = new InHouseCaptchaImage.Image(bitmapDecodeByteArray, quiz.getImageKey());
                    c0120a.b = 1;
                    if (this.a.emit(image, c0120a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super InHouseCaptchaImage.Image> myhVar, v1b v1bVar) {
            C0119a c0119a;
            if (v1bVar instanceof C0119a) {
                c0119a = (C0119a) v1bVar;
                int i = c0119a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0119a.b = i - Integer.MIN_VALUE;
                } else {
                    c0119a = new C0119a(v1bVar);
                }
            } else {
                c0119a = new C0119a(v1bVar);
            }
            Object obj = c0119a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0119a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0119a.b = 1;
                if (this.a.collect(bVar, c0119a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseViewModel$updateImage$2", f = "CaptchaInHouseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends InHouseCaptchaImage.Image>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = bd6.this.new b(this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends InHouseCaptchaImage.Image> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            udn udnVarA;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = lk50Var instanceof lk50.b;
            final bd6 bd6Var = bd6.this;
            if (z) {
                ohp<Object>[] ohpVarArr = bd6.w;
                bd6Var.z1(udn.a(bd6Var.x1(), true, null, null, null, 14));
            } else if (lk50Var instanceof lk50.c) {
                if (this.c) {
                    ohp<Object>[] ohpVarArr2 = bd6.w;
                    udn udnVarX1 = bd6Var.x1();
                    InHouseCaptchaImage inHouseCaptchaImage = (InHouseCaptchaImage) ((lk50.c) lk50Var).a;
                    ijf0 ijf0Var = new ijf0((String) null, 0L, 7);
                    StringUiText stringUiText = vch0.a;
                    udnVarX1.getClass();
                    inHouseCaptchaImage.getClass();
                    stringUiText.getClass();
                    udnVarA = new udn(false, inHouseCaptchaImage, ijf0Var, stringUiText);
                } else {
                    ohp<Object>[] ohpVarArr3 = bd6.w;
                    udnVarA = udn.a(bd6Var.x1(), false, (InHouseCaptchaImage) ((lk50.c) lk50Var).a, null, null, 12);
                }
                bd6Var.z1(udnVarA);
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                Throwable th = ((lk50.a) lk50Var).a;
                Function1<? super UiText, Unit> function1 = new Function1() { // from class: cd6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ohp<Object>[] ohpVarArr4 = bd6.w;
                        bd6 bd6Var2 = bd6Var;
                        bd6Var2.z1(udn.a(bd6Var2.x1(), false, new InHouseCaptchaImage.Error((UiText) obj2), null, null, 12));
                        return Unit.a;
                    }
                };
                ohp<Object>[] ohpVarArr4 = bd6.w;
                bd6Var.y1(th, function1);
            }
            return Unit.a;
        }
    }

    public bd6(pdn pdnVar, v8w v8wVar) {
        pdnVar.getClass();
        v8wVar.getClass();
        this.a = pdnVar;
        this.b = v8wVar;
        this.c = pdnVar.getStatus();
        vwd0 vwd0Var = new vwd0(new udn(0));
        this.d = vwd0Var.b;
        this.e = vwd0Var;
        this.f = -1;
        this.i = "";
    }

    public final void A1(boolean z) {
        jvd0 jvd0Var = this.v;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        a aVar = new a(this.b.d(this.i));
        pfd pfdVar = fse.a;
        this.v = kzh.d(new g1i(bm50.a(ozh.c(aVar, odd.b)), new b(z, null)), o8i0.d(this));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.a.a(new pdn.a.C0968a(this.f));
    }

    public final udn x1() {
        return (udn) this.e.a(this, w[0]);
    }

    public final void y1(Throwable th, Function1<? super UiText, Unit> function1) {
        if (!(th instanceof SprThrowable)) {
            function1.invoke(vch0.b);
            return;
        }
        SprThrowable sprThrowable = (SprThrowable) th;
        int d = sprThrowable.getD();
        if (d != 12021 && d != 19000) {
            function1.invoke(vch0.d(sprThrowable.getE()));
            return;
        }
        pdn.a.b bVar = new pdn.a.b(this.f, sprThrowable.getE());
        pdn pdnVar = this.a;
        pdnVar.a(bVar);
        pdnVar.a(new pdn.a.C0968a(this.f));
    }

    public final void z1(udn udnVar) {
        this.e.b(this, w[0], udnVar);
    }
}
