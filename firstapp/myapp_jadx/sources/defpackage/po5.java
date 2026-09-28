package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.cms.repositories.CMSRepository$apiCall$2", f = "CMSRepository.kt", l = {94}, m = "invokeSuspend", v = 1)
public final class po5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<String> c;
    public final /* synthetic */ to5 d;
    public final /* synthetic */ ro5 e;

    @c0d(c = "com.sportygames.cms.repositories.CMSRepository$apiCall$2$1", f = "CMSRepository.kt", l = {88}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super bi50<xdp>>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ to5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, to5 to5Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = str;
            this.c = to5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super bi50<xdp>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            Object value = on0.p.getValue();
            value.getClass();
            String str = this.c.b;
            this.a = 1;
            Object objA = ((qm5) value).a(this.b, str, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    @c0d(c = "com.sportygames.cms.repositories.CMSRepository$apiCall$2$2", f = "CMSRepository.kt", l = {96, 98, 99, 104}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Iterator a;
        public ojd b;
        public Map c;
        public Object d;
        public File e;
        public int f;
        public final /* synthetic */ ArrayList<ojd<bi50<xdp>>> i;
        public final /* synthetic */ HashMap<String, String> v;
        public final /* synthetic */ to5 w;
        public final /* synthetic */ ro5 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, HashMap map, to5 to5Var, ro5 ro5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.i = arrayList;
            this.v = map;
            this.w = to5Var;
            this.y = ro5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.i, this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0076  */
        /* JADX WARN: Code duplicated, block: B:20:0x0093  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:32:0x0102  */
        /* JADX WARN: Code duplicated, block: B:34:0x0108  */
        /* JADX WARN: Code duplicated, block: B:37:0x011f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0158 A[PHI: r2 r12 r14
          0x0158: PHI (r2v12 java.util.Map) = (r2v3 java.util.Map), (r2v15 java.util.Map) binds: [B:33:0x0106, B:38:0x0125] A[DONT_GENERATE, DONT_INLINE]
          0x0158: PHI (r12v7 java.lang.Object) = (r12v0 java.lang.Object), (r12v9 java.lang.Object) binds: [B:33:0x0106, B:38:0x0125] A[DONT_GENERATE, DONT_INLINE]
          0x0158: PHI (r14v16 java.util.Iterator<ojd<bi50<xdp>>>) = (r14v0 java.util.Iterator<ojd<bi50<xdp>>>), (r14v18 java.util.Iterator<ojd<bi50<xdp>>>) binds: [B:33:0x0106, B:38:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0106 -> B:39:0x0158). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011f -> B:38:0x0125). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 366
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: po5.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po5(ro5 ro5Var, to5 to5Var, v1b v1bVar, List list) {
        super(2, v1bVar);
        this.c = list;
        this.d = to5Var;
        this.e = ro5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        po5 po5Var = new po5(this.e, this.d, v1bVar, this.c);
        po5Var.b = obj;
        return po5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((po5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        to5 to5Var;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            ArrayList arrayListA = j9f.a(obj);
            HashMap map = new HashMap();
            Iterator<String> it = this.c.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                to5Var = this.d;
                if (!zHasNext) {
                    break;
                }
                arrayListA.add(ej5.a(v5bVar, null, new a(it.next(), to5Var, null), 3));
            }
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            b bVar = new b(arrayListA, map, to5Var, this.e, null);
            this.b = null;
            this.a = 1;
            if (ej5.d(oddVar, bVar, this) == y5bVar) {
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
