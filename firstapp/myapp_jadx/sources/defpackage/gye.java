package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.dateofbirth.DobVerificationResponse;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.verification.DobVerificationViewModel$verifyDob$1", f = "DobVerificationViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class gye extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fye b;

    public static final class a<T> implements myh {
        public final /* synthetic */ fye a;

        public a(fye fyeVar) {
            this.a = fyeVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            Object value8;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            fye fyeVar = this.a;
            if (z) {
                wwd0 wwd0Var = fyeVar.c;
                do {
                    value8 = wwd0Var.getValue();
                } while (!wwd0Var.g(value8, dye.a((dye) value8, null, null, uxs.ENABLE, false, false, null, false, null, 503)));
                ku90<ixe> ku90Var = fyeVar.e;
                DobVerificationResponse dobVerificationResponse = (DobVerificationResponse) ((lk50.c) lk50Var).a;
                return ku90Var.a.emit(new ixe.c(dobVerificationResponse.getQualifiedForGift(), dobVerificationResponse.getMessage()), v1bVar);
            }
            if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var2 = fyeVar.c;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, dye.a((dye) value2, null, null, uxs.DISABLE, false, false, null, false, null, 503)));
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                Integer num = sprThrowableH != null ? new Integer(sprThrowableH.getD()) : null;
                if ((num != null && num.intValue() == 12702) || ((num != null && num.intValue() == 12721) || (num != null && num.intValue() == 12708))) {
                    do {
                        value7 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value7, dye.a((dye) value7, null, null, null, false, false, new zwe.d(((lk50.a) lk50Var).b), false, null, 447)));
                } else if (num != null && num.intValue() == 12701) {
                    do {
                        value6 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value6, dye.a((dye) value6, null, null, null, false, false, new zwe.b(((lk50.a) lk50Var).b), false, null, 447)));
                } else if ((num != null && num.intValue() == 12704) || (num != null && num.intValue() == 12706)) {
                    do {
                        value5 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value5, dye.a((dye) value5, null, null, null, false, false, new zwe.c(((lk50.a) lk50Var).b), false, null, 447)));
                } else if (num != null && num.intValue() == 12709) {
                    do {
                        value4 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value4, dye.a((dye) value4, null, null, null, false, false, new zwe.e(((lk50.a) lk50Var).b), false, null, 447)));
                } else {
                    do {
                        value3 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value3, dye.a((dye) value3, null, null, null, false, false, zwe.a.e, false, null, 447)));
                }
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var3 = fyeVar.c;
                do {
                    value = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value, dye.a((dye) value, null, null, uxs.LOADING, false, false, null, false, null, 455)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gye(fye fyeVar, v1b<? super gye> v1bVar) {
        super(2, v1bVar);
        this.b = fyeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gye(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gye) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fye fyeVar = this.b;
            Long l = ((dye) fyeVar.c.getValue()).a;
            if (l == null) {
                return Unit.a;
            }
            long jLongValue = l.longValue();
            b0i0 b0i0Var = fyeVar.b;
            Date date = new Date(jLongValue);
            Locale locale = Locale.US;
            locale.getClass();
            String strL = bwf0.l(date, "yyyy-MM-dd", locale, 0, 0);
            String str = ((dye) fyeVar.c.getValue()).c.a.b;
            b0i0Var.getClass();
            str.getClass();
            or60 or60VarO = bm50.o(new a0i0(b0i0Var, str, strL, null));
            a aVar = new a(fyeVar);
            this.a = 1;
            if (or60VarO.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
