package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vqz {

    public static final class a implements lyh {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ Function2 b;

        /* JADX INFO: renamed from: vqz$a$a, reason: collision with other inner class name */
        public static final class C1222a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ Function2 b;

            /* JADX INFO: renamed from: vqz$a$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {225, 223}, m = "emit")
            public static final class C1223a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh c;

                public C1223a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1222a.this.emit(null, this);
                }
            }

            public C1222a(myh myhVar, Function2 function2) {
                this.a = myhVar;
                this.b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L22;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, defpackage.v1b r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vqz.a.C1222a.C1223a
                    if (r0 == 0) goto L13
                    r0 = r9
                    vqz$a$a$a r0 = (vqz.a.C1222a.C1223a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    vqz$a$a$a r0 = new vqz$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L37
                    if (r2 == r5) goto L31
                    if (r2 != r4) goto L2b
                    defpackage.uj50.b(r9)
                    goto L59
                L2b:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r3
                L31:
                    myh r7 = r0.c
                    defpackage.uj50.b(r9)
                    goto L4e
                L37:
                    defpackage.uj50.b(r9)
                    xmz r8 = (defpackage.xmz) r8
                    myh r9 = r7.a
                    r0.c = r9
                    r0.b = r5
                    kotlin.jvm.functions.Function2 r7 = r7.b
                    java.lang.Object r7 = r8.a(r7, r0)
                    if (r7 != r1) goto L4b
                    goto L58
                L4b:
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L4e:
                    r0.c = r3
                    r0.b = r4
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L59
                L58:
                    return r1
                L59:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: vqz.a.C1222a.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public a(lyh lyhVar, Function2 function2) {
            this.a = lyhVar;
            this.b = function2;
        }

        @Override // defpackage.lyh
        public final Object collect(myh myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C1222a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class b implements lyh {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ Function2 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ Function2 b;

            /* JADX INFO: renamed from: vqz$b$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {225, 223}, m = "emit")
            public static final class C1224a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh c;

                public C1224a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, Function2 function2) {
                this.a = myhVar;
                this.b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L22;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, defpackage.v1b r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vqz.b.a.C1224a
                    if (r0 == 0) goto L13
                    r0 = r9
                    vqz$b$a$a r0 = (vqz.b.a.C1224a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    vqz$b$a$a r0 = new vqz$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L37
                    if (r2 == r5) goto L31
                    if (r2 != r4) goto L2b
                    defpackage.uj50.b(r9)
                    goto L59
                L2b:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r3
                L31:
                    myh r7 = r0.c
                    defpackage.uj50.b(r9)
                    goto L4e
                L37:
                    defpackage.uj50.b(r9)
                    xmz r8 = (defpackage.xmz) r8
                    myh r9 = r7.a
                    r0.c = r9
                    r0.b = r5
                    kotlin.jvm.functions.Function2 r7 = r7.b
                    java.lang.Object r7 = r8.b(r7, r0)
                    if (r7 != r1) goto L4b
                    goto L58
                L4b:
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L4e:
                    r0.c = r3
                    r0.b = r4
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L59
                L58:
                    return r1
                L59:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: vqz.b.a.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public b(lyh lyhVar, Function2 function2) {
            this.a = lyhVar;
            this.b = function2;
        }

        @Override // defpackage.lyh
        public final Object collect(myh myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final kqz a(kqz kqzVar, Function2 function2) {
        kqzVar.getClass();
        return new kqz(new a(kqzVar.a, function2), kqzVar.b, kqzVar.c, jqz.a);
    }

    public static final kqz b(kqz kqzVar, Function2 function2) {
        kqzVar.getClass();
        return new kqz(new b(kqzVar.a, function2), kqzVar.b, kqzVar.c, jqz.a);
    }
}
