package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl$generateDefaultImages$2", f = "ShareImageProviderImpl.kt", l = {118, 119}, m = "invokeSuspend", v = 2)
public final class w090 extends tje0 implements Function2<v5b, v1b<? super c190>, Object> {
    public pjd a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b190 e;
    public final /* synthetic */ u090 f;

    @c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl$generateDefaultImages$2$generic$1", f = "ShareImageProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public final /* synthetic */ u090 a;
        public final /* synthetic */ b190 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, u090 u090Var, b190 b190Var) {
            super(2, v1bVar);
            this.a = u090Var;
            this.b = b190Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            b190 b190Var = this.b;
            List<Selection> list = b190Var.a;
            return this.a.c(b190Var.b, null, list);
        }
    }

    @c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl$generateDefaultImages$2$withUser$1$1", f = "ShareImageProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public final /* synthetic */ u090 a;
        public final /* synthetic */ b190 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u090 u090Var, b190 b190Var, String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = u090Var;
            this.b = b190Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            b190 b190Var = this.b;
            List<Selection> list = b190Var.a;
            return this.a.c(b190Var.b, this.c, list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w090(v1b v1bVar, u090 u090Var, b190 b190Var) {
        super(2, v1bVar);
        this.e = b190Var;
        this.f = u090Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w090 w090Var = new w090(v1bVar, this.f, this.e);
        w090Var.d = obj;
        return w090Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c190> v1bVar) {
        return ((w090) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        pjd pjdVarA;
        String str;
        String str2;
        v5b v5bVar = (v5b) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        String str3 = null;
        if (i == 0) {
            uj50.b(obj);
            u090 u090Var = this.f;
            b190 b190Var = this.e;
            pjd pjdVarA2 = ej5.a(v5bVar, null, new a(null, u090Var, b190Var), 3);
            String str4 = b190Var.c;
            pjdVarA = str4 != null ? ej5.a(v5bVar, null, new b(u090Var, b190Var, str4, null), 3) : null;
            this.d = null;
            this.a = pjdVarA;
            this.c = 1;
            obj = pjdVarA2.q(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            pjdVarA = this.a;
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.b;
            uj50.b(obj);
        }
        str3 = (String) obj;
        str = str2;
        if (str3 == null) {
            str3 = "";
        }
        return new c190(str, str3);
        str = (String) obj;
        if (pjdVarA != null) {
            this.d = null;
            this.a = null;
            this.b = str;
            this.c = 2;
            Object objAwait = pjdVarA.await(this);
            if (objAwait != y5bVar) {
                obj = objAwait;
                str2 = str;
                str3 = (String) obj;
                str = str2;
            }
            return y5bVar;
        }
        if (str3 == null) {
            str3 = "";
        }
        return new c190(str, str3);
    }
}
