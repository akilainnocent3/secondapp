package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.manager.spine.PiggyBashSpineDataManager$downloadSpineData$3$cmsSpineKeysWithSpineDataMap$1", f = "PiggyBashSpineDataManager.kt", l = {52}, m = "invokeSuspend", v = 1)
public final class px00 extends tje0 implements Function2<v5b, v1b<? super Map<String, ? extends icb0>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Map<String, String> c;
    public final /* synthetic */ qx00 d;

    @c0d(c = "com.sportygames.piggybash.domain.manager.spine.PiggyBashSpineDataManager$downloadSpineData$3$cmsSpineKeysWithSpineDataMap$1$spineData$1$1", f = "PiggyBashSpineDataManager.kt", l = {46}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Pair<? extends String, ? extends icb0>>, Object> {
        public String a;
        public int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ qx00 d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, qx00 qx00Var, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = qx00Var;
            this.e = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Pair<? extends String, ? extends icb0>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                zrm zrmVar = this.d.a;
                String str2 = this.c;
                this.a = str2;
                this.b = 1;
                obj = zrmVar.b(this.e, str2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                str = str2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.a;
                uj50.b(obj);
            }
            return new Pair(str, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px00(Map<String, String> map, qx00 qx00Var, v1b<? super px00> v1bVar) {
        super(2, v1bVar);
        this.c = map;
        this.d = qx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        px00 px00Var = new px00(this.c, this.d, v1bVar);
        px00Var.b = obj;
        return px00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Map<String, ? extends icb0>> v1bVar) {
        return ((px00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Map<String, String> map = this.c;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(ej5.a(v5bVar, null, new a(entry.getKey(), this.d, entry.getValue(), null), 3));
            }
            this.b = null;
            this.a = 1;
            obj = up1.a(arrayList, this);
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
        List<Pair> list = (List) obj;
        int iA = jpu.a(l48.r(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Pair pair : list) {
            linkedHashMap.put(pair.a, pair.b);
        }
        return linkedHashMap;
    }
}
