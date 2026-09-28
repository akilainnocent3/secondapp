package com.sportygames.newcms;

import defpackage.bo5;
import defpackage.bq40;
import defpackage.c0d;
import defpackage.do5;
import defpackage.dq40;
import defpackage.ej5;
import defpackage.ez20;
import defpackage.ib5;
import defpackage.pjd;
import defpackage.quw;
import defpackage.tje0;
import defpackage.tuw;
import defpackage.uj50;
import defpackage.up1;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.xxs;
import defpackage.y5b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase$getLoadingTask$flow$1", f = "CMSUseCase.kt", l = {129, 134}, m = "invokeSuspend", v = 1)
public final class f extends tje0 implements Function2<ez20<? super xxs<b>>, v1b<? super Unit>, Object> {
    public ArrayList a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d d;
    public final /* synthetic */ dq40<List<do5>> e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ bq40 i;
    public final /* synthetic */ tuw v;
    public final /* synthetic */ dq40<b> w;

    @c0d(c = "com.sportygames.newcms.CMSUseCase$getLoadingTask$flow$1$resultList$1$1", f = "CMSUseCase.kt", l = {113, 237, 115, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super List<? extends Pair<? extends CMSRes.Data, ? extends String>>>, Object> {
        public final /* synthetic */ bq40 A;
        public final /* synthetic */ ArrayList B;
        public List a;
        public quw b;
        public ez20 c;
        public bq40 d;
        public int e;
        public int f;
        public /* synthetic */ Object i;
        public final /* synthetic */ d v;
        public final /* synthetic */ Map.Entry<String, List<CMSRes.Data>> w;
        public final /* synthetic */ tuw y;
        public final /* synthetic */ ez20<xxs<b>> z;

        /* JADX INFO: renamed from: com.sportygames.newcms.f$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.newcms.CMSUseCase$getLoadingTask$flow$1$resultList$1$1$3$2$1", f = "CMSUseCase.kt", l = {120, 237, 122}, m = "invokeSuspend", v = 1)
        public static final class C0443a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public quw a;
            public ez20 b;
            public bq40 c;
            public int d;
            public int e;
            public final /* synthetic */ Pair<bo5<do5>, do5> f;
            public final /* synthetic */ CMSRes.Data i;
            public final /* synthetic */ String v;
            public final /* synthetic */ tuw w;
            public final /* synthetic */ ez20<xxs<b>> y;
            public final /* synthetic */ bq40 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0443a(Pair pair, CMSRes.Data data, String str, tuw tuwVar, ez20 ez20Var, bq40 bq40Var, v1b v1bVar) {
                super(2, v1bVar);
                this.f = pair;
                this.i = data;
                this.v = str;
                this.w = tuwVar;
                this.y = ez20Var;
                this.z = bq40Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0443a(this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0443a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0081  */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                quw quwVar;
                ez20<xxs<b>> ez20Var;
                bq40 bq40Var;
                int i;
                Throwable th;
                quw quwVar2;
                xxs xxsVar;
                y5b y5bVar = y5b.a;
                int i2 = this.e;
                if (i2 == 0) {
                    uj50.b(obj);
                    Pair<bo5<do5>, do5> pair = this.f;
                    bo5<do5> bo5Var = pair.a;
                    do5 do5Var = pair.b;
                    this.e = 1;
                    if (bo5Var.a(this.i, this.v, do5Var, this) != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        quwVar2 = this.a;
                        try {
                            uj50.b(obj);
                            Unit unit = Unit.a;
                            quwVar2.f(null);
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            quwVar2.f(null);
                            throw th;
                        }
                    }
                    i = this.d;
                    bq40Var = this.c;
                    ez20Var = this.b;
                    quw quwVar3 = this.a;
                    uj50.b(obj);
                    quwVar = quwVar3;
                    try {
                        int i3 = bq40Var.a;
                        bq40Var.a = i3 + 1;
                        xxsVar = new xxs(i3, null);
                        this.a = quwVar;
                        this.b = null;
                        this.c = null;
                        this.d = i;
                        this.e = 3;
                        if (ez20Var.j(this, xxsVar) != y5bVar) {
                            quwVar2 = quwVar;
                            Unit unit2 = Unit.a;
                            quwVar2.f(null);
                            return Unit.a;
                        }
                        return y5bVar;
                    } catch (Throwable th3) {
                        quw quwVar4 = quwVar;
                        th = th3;
                        quwVar2 = quwVar4;
                        quwVar2.f(null);
                        throw th;
                    }
                }
                uj50.b(obj);
                quwVar = this.w;
                this.a = quwVar;
                ez20Var = this.y;
                this.b = ez20Var;
                bq40 bq40Var2 = this.z;
                this.c = bq40Var2;
                this.d = 0;
                this.e = 2;
                if (quwVar.d(this) != y5bVar) {
                    bq40Var = bq40Var2;
                    i = 0;
                    int i4 = bq40Var.a;
                    bq40Var.a = i4 + 1;
                    xxsVar = new xxs(i4, null);
                    this.a = quwVar;
                    this.b = null;
                    this.c = null;
                    this.d = i;
                    this.e = 3;
                    if (ez20Var.j(this, xxsVar) != y5bVar) {
                        quwVar2 = quwVar;
                        Unit unit3 = Unit.a;
                        quwVar2.f(null);
                        return Unit.a;
                    }
                }
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, Map.Entry entry, tuw tuwVar, ez20 ez20Var, bq40 bq40Var, ArrayList arrayList, v1b v1bVar) {
            super(2, v1bVar);
            this.v = dVar;
            this.w = entry;
            this.y = tuwVar;
            this.z = ez20Var;
            this.A = bq40Var;
            this.B = arrayList;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.v, this.w, this.y, this.z, this.A, this.B, v1bVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super List<? extends Pair<? extends CMSRes.Data, ? extends String>>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:41:0x0101  */
        /* JADX WARN: Code duplicated, block: B:48:0x0121  */
        /* JADX WARN: Code duplicated, block: B:49:0x0138  */
        /* JADX WARN: Code duplicated, block: B:51:0x013f  */
        /* JADX WARN: Code duplicated, block: B:56:0x015c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x00c1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x0142 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x011b A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            List list;
            ez20<xxs<b>> ez20Var;
            quw quwVar;
            bq40 bq40Var;
            int i;
            xxs xxsVar;
            List list2;
            Object obj2;
            Throwable th;
            ArrayList arrayList;
            ArrayList arrayList2;
            int size;
            int i2;
            ArrayList arrayList3;
            CMSRes.Data data;
            String str;
            ArrayList arrayList4;
            int size2;
            int i3;
            Object obj3;
            Pair pair;
            ArrayList arrayList5;
            quw quwVar2;
            char c;
            pjd pjdVarA;
            v5b v5bVar = (v5b) this.i;
            y5b y5bVar = y5b.a;
            int i4 = this.f;
            bq40 bq40Var2 = this.A;
            tuw tuwVar = this.y;
            quw quwVar3 = null;
            if (i4 == 0) {
                uj50.b(obj);
                Map.Entry<String, List<CMSRes.Data>> entry = this.w;
                String key = entry.getKey();
                List<CMSRes.Data> value = entry.getValue();
                this.i = v5bVar;
                this.f = 1;
                objB = this.v.b(this, key, value);
                if (objB != y5bVar) {
                }
                return y5bVar;
            }
            if (i4 == 1) {
                uj50.b(obj);
                objB = obj;
            } else {
                if (i4 == 2) {
                    int i5 = this.e;
                    bq40 bq40Var3 = this.d;
                    ez20<xxs<b>> ez20Var2 = this.c;
                    quw quwVar4 = this.b;
                    list = this.a;
                    uj50.b(obj);
                    i = i5;
                    quwVar = quwVar4;
                    ez20Var = ez20Var2;
                    bq40Var = bq40Var3;
                    try {
                        int i6 = bq40Var.a;
                        bq40Var.a = i6 + 1;
                        xxsVar = new xxs(i6, null);
                        this.i = v5bVar;
                        this.a = list;
                        this.b = quwVar;
                        this.c = null;
                        this.d = null;
                        this.e = i;
                        this.f = 3;
                        if (ez20Var.j(this, xxsVar) == y5bVar) {
                            list2 = list;
                        }
                        return y5bVar;
                    } catch (Throwable th2) {
                        th = th2;
                        obj2 = null;
                        quwVar.f(obj2);
                        throw th;
                    }
                }
                if (i4 != 3) {
                    if (i4 != 4) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = this.a;
                    uj50.b(obj);
                    return list3;
                }
                quwVar = this.b;
                List list4 = this.a;
                try {
                    uj50.b(obj);
                    list2 = list4;
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = null;
                    quwVar.f(obj2);
                    throw th;
                }
            }
            Unit unit = Unit.a;
            quwVar.f(null);
            arrayList = new ArrayList();
            for (Object obj4 : list2) {
                if (((CMSRes.Data) ((Pair) obj4).a).e.a) {
                    arrayList.add(obj4);
                }
            }
            arrayList2 = new ArrayList();
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                int i7 = i2 + 1;
                Pair pair2 = (Pair) arrayList.get(i2);
                data = (CMSRes.Data) pair2.a;
                str = (String) pair2.b;
                arrayList4 = this.B;
                size2 = arrayList4.size();
                i3 = 0;
                do {
                    if (i3 < size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList4.get(i3);
                    i3++;
                } while (((bo5) ((Pair) obj3).a).getType() != data.e);
                pair = (Pair) obj3;
                if (pair != null) {
                    arrayList5 = arrayList2;
                    C0443a c0443a = new C0443a(pair, data, str, tuwVar, this.z, bq40Var2, null);
                    quwVar2 = null;
                    c = 3;
                    pjdVarA = ej5.a(v5bVar, null, c0443a, 3);
                } else {
                    arrayList5 = arrayList2;
                    quwVar2 = null;
                    c = 3;
                    pjdVarA = null;
                }
                if (pjdVarA != null) {
                    arrayList5.add(pjdVarA);
                }
                quwVar3 = quwVar2;
                arrayList2 = arrayList5;
                size = size;
                i2 = i7;
            }
            arrayList3 = arrayList2;
            quw quwVar5 = quwVar3;
            this.i = quwVar5;
            this.a = list2;
            this.b = quwVar5;
            this.f = 4;
            if (up1.a(arrayList3, this) != y5bVar) {
                return y5bVar;
            }
            return list2;
            List list5 = (List) objB;
            this.i = v5bVar;
            this.a = list5;
            this.b = tuwVar;
            ez20<xxs<b>> ez20Var3 = this.z;
            this.c = ez20Var3;
            this.d = bq40Var2;
            this.e = 0;
            this.f = 2;
            if (tuwVar.d(this) != y5bVar) {
                list = list5;
                ez20Var = ez20Var3;
                quwVar = tuwVar;
                bq40Var = bq40Var2;
                i = 0;
                int i8 = bq40Var.a;
                bq40Var.a = i8 + 1;
                xxsVar = new xxs(i8, null);
                this.i = v5bVar;
                this.a = list;
                this.b = quwVar;
                this.c = null;
                this.d = null;
                this.e = i;
                this.f = 3;
                if (ez20Var.j(this, xxsVar) == y5bVar) {
                    list2 = list;
                    Unit unit2 = Unit.a;
                    quwVar.f(null);
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        if (((CMSRes.Data) ((Pair) obj4).a).e.a) {
                            arrayList.add(obj4);
                        }
                    }
                    arrayList2 = new ArrayList();
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i9 = i2 + 1;
                        Pair pair3 = (Pair) arrayList.get(i2);
                        data = (CMSRes.Data) pair3.a;
                        str = (String) pair3.b;
                        arrayList4 = this.B;
                        size2 = arrayList4.size();
                        i3 = 0;
                        do {
                            if (i3 < size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList4.get(i3);
                            i3++;
                        } while (((bo5) ((Pair) obj3).a).getType() != data.e);
                        pair = (Pair) obj3;
                        if (pair != null) {
                            arrayList5 = arrayList2;
                            C0443a c0443a2 = new C0443a(pair, data, str, tuwVar, this.z, bq40Var2, null);
                            quwVar2 = null;
                            c = 3;
                            pjdVarA = ej5.a(v5bVar, null, c0443a2, 3);
                        } else {
                            arrayList5 = arrayList2;
                            quwVar2 = null;
                            c = 3;
                            pjdVarA = null;
                        }
                        if (pjdVarA != null) {
                            arrayList5.add(pjdVarA);
                        }
                        quwVar3 = quwVar2;
                        arrayList2 = arrayList5;
                        size = size;
                        i2 = i9;
                    }
                    arrayList3 = arrayList2;
                    quw quwVar6 = quwVar3;
                    this.i = quwVar6;
                    this.a = list2;
                    this.b = quwVar6;
                    this.f = 4;
                    if (up1.a(arrayList3, this) != y5bVar) {
                        return list2;
                    }
                }
            }
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, dq40 dq40Var, ArrayList arrayList, bq40 bq40Var, tuw tuwVar, dq40 dq40Var2, v1b v1bVar) {
        super(2, v1bVar);
        this.d = dVar;
        this.e = dq40Var;
        this.f = arrayList;
        this.i = bq40Var;
        this.v = tuwVar;
        this.w = dq40Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f fVar = new f(this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        fVar.c = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super xxs<b>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((f) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0181, code lost:
    
        if (r6.j(r17, r2) == r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [T, com.sportygames.newcms.b, java.lang.Object] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportygames.newcms.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
