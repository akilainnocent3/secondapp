package defpackage;

import android.widget.TextView;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$observeAssetsInfo$$inlined$collectWithLifecycle$default$1", f = "DepositBaseFragmentLegacy.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class brd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lrd b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ lrd d;

    @c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$observeAssetsInfo$$inlined$collectWithLifecycle$default$1$1", f = "DepositBaseFragmentLegacy.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ lrd d;

        /* JADX INFO: renamed from: brd$a$a, reason: collision with other inner class name */
        public static final class C0138a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ lrd b;

            public C0138a(v5b v5bVar, lrd lrdVar) {
                this.b = lrdVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                lk50 lk50Var = (lk50) t;
                boolean z = lk50Var instanceof lk50.c;
                lrd lrdVar = this.b;
                if (z) {
                    AssetsInfo assetsInfo = (AssetsInfo) ((lk50.c) lk50Var).a;
                    double d = assetsInfo.balance / 10000.0d;
                    f0l f0lVar = lrdVar.O;
                    if (f0lVar != null) {
                        f0lVar.f = d;
                    }
                    lrdVar.I = d;
                    TextView textViewD1 = lrdVar.d1();
                    if (textViewD1 != null) {
                        textViewD1.setText(bjb0.U(assetsInfo.balance, Locale.US));
                    }
                } else {
                    TextView textViewD2 = lrdVar.d1();
                    if (textViewD2 != null) {
                        textViewD2.setText(sn5.d(lrdVar, R.string.app_common__no_cash, new Object[0]));
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, lrd lrdVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = lrdVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0138a c0138a = new C0138a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0138a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brd(lrd lrdVar, lyh lyhVar, v1b v1bVar, lrd lrdVar2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = lrdVar;
        this.c = lyhVar;
        this.d = lrdVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new brd(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((brd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
