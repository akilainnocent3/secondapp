package defpackage;

import android.accounts.Account;
import androidx.compose.runtime.m;
import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls6x;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s6x extends j8i0 {
    public final lyz a;
    public final wwd0 b;
    public String c;
    public String d;
    public final ytw e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final v340 w;
    public final v340 y;

    @c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationViewModel$ninVerificationState$1", f = "NINVerificationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<p6x, Boolean, v1b<? super p6x>, Object> {
        public /* synthetic */ p6x a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(p6x p6xVar, Boolean bool, v1b<? super p6x> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, v1bVar);
            aVar.a = p6xVar;
            aVar.b = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            p6x p6xVar = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return p6x.a(p6xVar, null, null, 0, z, false, false, 0, null, 503);
        }
    }

    @c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationViewModel$profileExtra$1", f = "NINVerificationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<Account, AccountInfo, v1b<? super Pair<? extends Account, ? extends AccountInfo>>, Object> {
        public /* synthetic */ Account a;
        public /* synthetic */ AccountInfo b;

        @Override // defpackage.gaj
        public final Object invoke(Account account, AccountInfo accountInfo, v1b<? super Pair<? extends Account, ? extends AccountInfo>> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = account;
            bVar.b = accountInfo;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Account account = this.a;
            AccountInfo accountInfo = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(account, accountInfo);
        }
    }

    public static final class c implements lyh<uxs> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationViewModel$special$$inlined$map$1", f = "NINVerificationViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationViewModel$special$$inlined$map$1$2", f = "NINVerificationViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
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
                a aVar;
                uxs uxsVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    p6x p6xVar = (p6x) obj;
                    int length = p6xVar.a.a.b.length();
                    int i3 = p6xVar.h;
                    boolean z = length < 11 || i3 == 12703 || i3 == 12704 || (length == 11 && p6xVar.b() && Intrinsics.g(p6xVar.a.a.b, p6xVar.b.a.b)) || p6xVar.c == 110;
                    if (p6xVar.f) {
                        uxsVar = uxs.LOADING;
                    } else {
                        uxsVar = z ? uxs.DISABLE : uxs.ENABLE;
                    }
                    aVar.b = 1;
                    if (this.a.emit(uxsVar, aVar) == y5bVar) {
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

        public c(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uxs> myhVar, v1b v1bVar) throws Throwable {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    public s6x(lyz lyzVar, uqm uqmVar) {
        lyzVar.getClass();
        uqmVar.getClass();
        this.a = lyzVar;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.b = wwd0VarA;
        this.c = "";
        this.d = "";
        this.e = m.b(bool);
        wwd0 wwd0VarA2 = xwd0.a(uqmVar.getAccountInfo());
        wwd0 wwd0VarA3 = xwd0.a(uqmVar.getAccount());
        this.f = wwd0VarA3;
        this.i = e1i.e(new n1i(wwd0VarA3, wwd0VarA2, new b(3, null)), o8i0.d(this), q490.a.a(3), new Pair(uqmVar.getAccount(), uqmVar.getAccountInfo()));
        int i = 0;
        wwd0 wwd0VarA4 = xwd0.a(new p6x(i));
        this.v = wwd0VarA4;
        this.w = e1i.e(new n1i(wwd0VarA4, wwd0VarA, new a(3, null)), o8i0.d(this), q490.a.a(3), new p6x(i));
        this.y = e1i.e(new c(wwd0VarA4), o8i0.d(this), q490.a.a(3), uxs.ENABLE);
        kzh.d(new g1i(bm50.a(lyzVar.l()), new r6x(this, null)), o8i0.d(this));
    }

    public final void x1(String str, String str2, boolean z) {
        wwd0 wwd0Var;
        Object value;
        this.c = str;
        this.d = str2;
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
    }

    public final void y1(ijf0 ijf0Var) {
        while (true) {
            wwd0 wwd0Var = this.v;
            Object value = wwd0Var.getValue();
            ijf0 ijf0Var2 = ijf0Var;
            if (wwd0Var.g(value, p6x.a((p6x) value, ijf0Var2, null, 0, false, false, false, 0, null, 510))) {
                return;
            } else {
                ijf0Var = ijf0Var2;
            }
        }
    }

    public final void z1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.v;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, p6x.a((p6x) value, null, null, 0, false, false, false, 0, null, 495)));
    }
}
