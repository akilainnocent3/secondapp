package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2", f = "RoomPagingUtil.kt", l = {160}, m = "invokeSuspend")
public final class yv50 extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
    public int a;
    public final /* synthetic */ lv50 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ bw50 d;

    @c0d(c = "androidx.room.paging.util.RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2$1", f = "RoomPagingUtil.kt", l = {161}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<crg0, v1b<? super Integer>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String c;
        public final /* synthetic */ bw50 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, bw50 bw50Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = bw50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crg0 crg0Var, v1b<? super Integer> v1bVar) {
            return ((a) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            crg0 crg0Var = (crg0) this.b;
            final bw50 bw50Var = this.d;
            Function1 function1 = new Function1() { // from class: xv50
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    hq60 hq60Var = (hq60) obj2;
                    bw50Var.b.invoke(hq60Var);
                    return Integer.valueOf(hq60Var.D1() ? hq60Var.getInt(0) : 0);
                }
            };
            this.a = 1;
            Object objC = crg0Var.c(this.c, function1, this);
            return objC == y5bVar ? y5bVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv50(lv50 lv50Var, String str, bw50 bw50Var, v1b<? super yv50> v1bVar) {
        super(2, v1bVar);
        this.b = lv50Var;
        this.c = str;
        this.d = bw50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yv50(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
        return ((yv50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        a aVar = new a(this.c, this.d, null);
        this.a = 1;
        Object objW = this.b.w(true, aVar, this);
        return objW == y5bVar ? y5bVar : objW;
    }
}
