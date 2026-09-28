package defpackage;

import android.net.Uri;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class rjr implements lyh<gjr> {
    public final /* synthetic */ ku90 a;
    public final /* synthetic */ sjr b;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.webview.LNWebViewViewModel$special$$inlined$map$1", f = "LNWebViewViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return rjr.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ sjr b;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.webview.LNWebViewViewModel$special$$inlined$map$1$2", f = "LNWebViewViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, sjr sjrVar) {
            this.a = myhVar;
            this.b = sjrVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object bVar;
            String string;
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
            a aVar2 = aVar;
            Object obj2 = aVar2.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar2.b;
            if (i2 == 0) {
                uj50.b(obj2);
                String str = (String) obj;
                sjr sjrVar = this.b;
                v8r v8rVar = sjrVar.f;
                int i3 = v8rVar.a;
                String strD = bnh0.d(sjrVar.b, new String[]{v8rVar.b}, null, 6);
                try {
                    zi50.a aVar3 = zi50.b;
                    bVar = Uri.parse(strD);
                } catch (Throwable th) {
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                Uri uriBuild = (Uri) bVar;
                if (uriBuild == null) {
                    string = "";
                } else {
                    if (uriBuild.getQueryParameter("theme") == null) {
                        uriBuild = uriBuild.buildUpon().appendQueryParameter("theme", str).build();
                        uriBuild.getClass();
                    }
                    string = uriBuild.toString();
                    string.getClass();
                }
                gjr gjrVar = new gjr(i3, string, sjrVar.d.B(), sjrVar.e.getLanguageCode(null), sjrVar.c.b().l(), sjrVar.a);
                aVar2.b = 1;
                if (this.a.emit(gjrVar, aVar2) == y5bVar) {
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

    public rjr(ku90 ku90Var, sjr sjrVar) {
        this.a = ku90Var;
        this.b = sjrVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super gjr> myhVar, v1b v1bVar) {
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
        b bVar = new b(myhVar, this.b);
        aVar.b = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }
}
