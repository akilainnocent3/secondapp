package defpackage;

import com.sportygames.commons.SportyGamesManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class mzf0 implements Interceptor, bb {
    public volatile dm8 a;
    public final Object b = new Object();
    public String c = "";

    @c0d(c = "com.sportygames.commons.remote.token.TokenRefreshInterceptor$intercept$1$1", f = "TokenRefreshInterceptor.kt", l = {84}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX INFO: renamed from: mzf0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.commons.remote.token.TokenRefreshInterceptor$intercept$1$1$result$1", f = "TokenRefreshInterceptor.kt", l = {85}, m = "invokeSuspend", v = 1)
        public static final class C0885a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
            public int a;
            public final /* synthetic */ mzf0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0885a(mzf0 mzf0Var, v1b<? super C0885a> v1bVar) {
                super(2, v1bVar);
                this.b = mzf0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0885a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
                return ((C0885a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    dm8 dm8Var = this.b.a;
                    if (dm8Var == null) {
                        return null;
                    }
                    this.a = 1;
                    obj = dm8Var.q(this);
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
                return (String) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mzf0.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (Intrinsics.g(mzf0.this.c, "API_RETURN_NULL")) {
                    return "API_RETURN_NULL";
                }
                String str = this.c;
                if (str != null && !str.equals(mzf0.this.c)) {
                    return mzf0.this.c;
                }
                xnh0 user = SportyGamesManager.getInstance().getUser();
                mzf0 mzf0Var = mzf0.this;
                if (user == null) {
                    return "API_RETURN_NULL";
                }
                if (mzf0Var.a != null) {
                    mzf0.this.a = null;
                }
                mzf0.this.a = em8.a();
                SportyGamesManager.getInstance().addAccountUpdatedListener(mzf0.this);
                SportyGamesManager.getInstance().renewUserAccessToken();
                C0885a c0885a = new C0885a(mzf0.this, null);
                this.a = 1;
                obj = vxf0.c(30000L, c0885a, this);
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
            String str2 = (String) obj;
            return str2 == null ? "API_RETURN_NULL" : str2;
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            a(xnh0Var != null ? xnh0Var.a : null);
        }
    }

    public final void a(String str) {
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        nzf0.a = false;
        nzf0.b = System.currentTimeMillis();
        dm8 dm8Var = this.a;
        if (str == null) {
            if (dm8Var != null) {
                dm8Var.R("API_RETURN_NULL");
            }
        } else if (dm8Var != null) {
            dm8Var.R(str);
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String strA0;
        String str;
        String strHeader;
        Object obj;
        chain.getClass();
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        String strHeader2 = responseProceed.request().header("cookie");
        if (strHeader2 != null) {
            int i = 0;
            List listSplit$default = StringsKt__StringsKt.split$default(strHeader2, new String[]{";"}, false, 0, 6, null);
            if (listSplit$default != null) {
                ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt.t0((String) it.next()).toString());
                }
                int size = arrayList.size();
                do {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i);
                    i++;
                } while (!c.u((String) obj, "accessToken=", true));
                String str2 = (String) obj;
                if (str2 != null) {
                    strA0 = StringsKt.a0(str2, "accessToken=");
                } else {
                    strA0 = null;
                }
            } else {
                strA0 = null;
            }
        } else {
            strA0 = null;
        }
        if ((responseProceed.code() == 401 || responseProceed.code() == 403) && (SportyGamesManager.getInstance().getUser() != null || ((strHeader = responseProceed.request().header("sf-access-token")) != null && strHeader.length() != 0))) {
            if (this.c.length() == 0 || Intrinsics.g(this.c, "API_RETURN_NULL") || String.valueOf(strA0).equals("testing_access_token")) {
                this.c = strA0 == null ? "" : strA0;
            }
            synchronized (this.b) {
                pfd pfdVar = fse.a;
                str = (String) dj5.a(odd.b, new a(strA0, null));
                this.c = str;
                Unit unit = Unit.a;
            }
            if (!Intrinsics.g(str, "API_RETURN_NULL")) {
                Request requestBuild = request.newBuilder().header("cookie", "accessToken=" + this.c).build();
                responseProceed.close();
                return chain.proceed(requestBuild);
            }
        }
        return responseProceed;
    }
}
