package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwsi;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wsi extends j8i0 {
    public final o2k a;
    public final wwd0 b = xwd0.a(new vsi(0));

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.ForceResetPasswordViewModel$1", f = "ForceResetPasswordViewModel.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = wsi.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object value;
            String str;
            y5b y5bVar = y5b.a;
            int i = this.a;
            wsi wsiVar = wsi.this;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    zi50.a aVar = zi50.b;
                    o2k o2kVar = wsiVar.a;
                    this.b = null;
                    this.a = 1;
                    obj = ((mgb0) o2kVar.a).getLastAccount(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                bVar = (String) obj;
                zi50.a aVar2 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (!(bVar instanceof zi50.b)) {
                String str2 = (String) bVar;
                wwd0 wwd0Var = wsiVar.b;
                do {
                    value = wwd0Var.getValue();
                    vsi vsiVar = (vsi) value;
                    str = str2 == null ? "" : str2;
                    vsiVar.getClass();
                } while (!wwd0Var.g(value, new vsi(str)));
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.a(inm.a("Failed to get phone number: ", thA.getMessage()), new Object[0]);
            }
            return Unit.a;
        }
    }

    public wsi(o2k o2kVar) {
        this.a = o2kVar;
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
