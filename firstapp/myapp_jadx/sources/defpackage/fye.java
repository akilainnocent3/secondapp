package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dateofbirth.DobVerificationInfoResponse;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfye;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fye extends j8i0 {
    public final sve a;
    public final b0i0 b;
    public final wwd0 c;
    public final v340 d;
    public final ku90<ixe> e;
    public final t340 f;

    @c0d(c = "com.sporty.android.platform.features.dateofbirth.ui.screens.verification.DobVerificationViewModel$1", f = "DobVerificationViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ResourceUiText a;
        public int b;
        public /* synthetic */ Object c;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = fye.this.new a(v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText;
            Object objA;
            Object bVar;
            lk50 aVar;
            UiText text;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            dye dyeVar;
            Long l;
            ijf0 ijf0Var;
            boolean z;
            boolean z2;
            String message;
            String dateOfBirth;
            String nin;
            Date dateA;
            fye fyeVar = fye.this;
            wwd0 wwd0Var = fyeVar.c;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                ResourceUiText resourceUiText = vch0.b;
                try {
                    zi50.a aVar2 = zi50.b;
                    sve sveVar = fyeVar.a;
                    this.c = null;
                    this.a = resourceUiText;
                    this.b = 1;
                    objA = sveVar.a(this);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                    uiText = resourceUiText;
                } catch (Throwable th) {
                    th = th;
                    uiText = resourceUiText;
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uiText = this.a;
                try {
                    uj50.b(obj);
                    objA = obj;
                } catch (Throwable th2) {
                    th = th2;
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
            }
            bVar = (DobVerificationInfoResponse) objA;
            zi50.a aVar5 = zi50.b;
            Object obj2 = bVar instanceof zi50.b ? null : bVar;
            if (obj2 != null) {
                aVar = new lk50.c(obj2);
            } else {
                Throwable thA = zi50.a(bVar);
                if (thA == null) {
                    thA = new Throwable("Unknown error");
                }
                Throwable thA2 = zi50.a(bVar);
                if (thA2 != null) {
                    if (!(thA2 instanceof fk50)) {
                        thA2 = null;
                    }
                    fk50 fk50Var = (fk50) thA2;
                    if (fk50Var != null && (text = fk50Var.getText()) != null) {
                        uiText = text;
                    }
                }
                aVar = new lk50.a(thA, uiText);
            }
            if (aVar instanceof lk50.c) {
                DobVerificationInfoResponse dobVerificationInfoResponse = (DobVerificationInfoResponse) ((lk50.c) aVar).a;
                do {
                    value4 = wwd0Var.getValue();
                    dyeVar = (dye) value4;
                    String dateOfBirth2 = dobVerificationInfoResponse.getDateOfBirth();
                    l = (dateOfBirth2 == null || (dateA = pwf0.a(dateOfBirth2, "yyyy-MM-dd", true, owf0.a)) == null) ? null : new Long(dateA.getTime());
                    String nin2 = dobVerificationInfoResponse.getNin();
                    if (nin2 == null) {
                        nin2 = "";
                    }
                    ijf0Var = new ijf0(nin2, 0L, 6);
                    String dateOfBirth3 = dobVerificationInfoResponse.getDateOfBirth();
                    z = dateOfBirth3 == null || StringsKt.U(dateOfBirth3);
                    String nin3 = dobVerificationInfoResponse.getNin();
                    z2 = nin3 == null || StringsKt.U(nin3);
                    message = dobVerificationInfoResponse.getMessage();
                    dateOfBirth = dobVerificationInfoResponse.getDateOfBirth();
                } while (!wwd0Var.g(value4, dye.a(dyeVar, l, ijf0Var, (dateOfBirth == null || StringsKt.U(dateOfBirth) || (nin = dobVerificationInfoResponse.getNin()) == null || StringsKt.U(nin)) ? uxs.DISABLE : uxs.ENABLE, z, z2, null, false, message, 194)));
            } else if (aVar instanceof lk50.a) {
                lk50.a aVar6 = (lk50.a) aVar;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, dye.a((dye) value, null, null, uxs.DISABLE, false, false, null, false, null, 503)));
                SprThrowable sprThrowableH = bm50.h(aVar6);
                Integer num = sprThrowableH != null ? new Integer(sprThrowableH.getD()) : null;
                if ((num != null && num.intValue() == 12704) || (num != null && num.intValue() == 12706)) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, dye.a((dye) value3, null, null, null, false, false, new zwe.c(aVar6.b), false, null, 447)));
                } else {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, dye.a((dye) value2, null, null, null, false, false, zwe.a.e, false, null, 447)));
                }
            } else if (!(aVar instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            return Unit.a;
        }
    }

    public fye(sve sveVar, b0i0 b0i0Var) {
        sveVar.getClass();
        b0i0Var.getClass();
        this.a = sveVar;
        this.b = b0i0Var;
        wwd0 wwd0VarA = xwd0.a(new dye(0));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        ku90<ixe> ku90Var = new ku90<>();
        this.e = ku90Var;
        this.f = e1i.a(ku90Var);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void x1() {
        Object value;
        wwd0 wwd0Var = this.c;
        boolean z = !StringsKt.U(((dye) wwd0Var.getValue()).b().a.b) && ((dye) wwd0Var.getValue()).c.a.b.length() == 11;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, dye.a((dye) value, null, null, z ? uxs.ENABLE : uxs.DISABLE, false, false, null, false, null, 503)));
    }
}
