package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.viewmodel.BaseNCViewModel$ncList$1", f = "BaseNCViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l32 extends tje0 implements gaj<kqz<j3x>, Map<Integer, ? extends Boolean>, v1b<? super kqz<j3x>>, Object> {
    public /* synthetic */ kqz a;
    public /* synthetic */ Map b;

    @c0d(c = "com.sportybet.feature.notificationcenter.viewmodel.BaseNCViewModel$ncList$1$1", f = "BaseNCViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<j3x, v1b<? super j3x>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ Map<Integer, Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<Integer, Boolean> map, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = map;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j3x j3xVar, v1b<? super j3x> v1bVar) {
            return ((a) create(j3xVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            j3x j3xVar = (j3x) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Boolean bool = this.b.get(new Integer(j3xVar.a));
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            int i = j3xVar.a;
            String str = j3xVar.b;
            String str2 = j3xVar.c;
            String str3 = j3xVar.d;
            String str4 = j3xVar.e;
            n2x n2xVar = j3xVar.f;
            str.getClass();
            str2.getClass();
            str4.getClass();
            return new j3x(i, str, str2, str3, str4, n2xVar, zBooleanValue);
        }
    }

    @Override // defpackage.gaj
    public final Object invoke(kqz<j3x> kqzVar, Map<Integer, ? extends Boolean> map, v1b<? super kqz<j3x>> v1bVar) {
        l32 l32Var = new l32(3, v1bVar);
        l32Var.a = kqzVar;
        l32Var.b = map;
        return l32Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kqz kqzVar = this.a;
        Map map = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return vqz.b(kqzVar, new a(map, null));
    }
}
