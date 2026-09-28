package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 46}, m = "invokeSuspend")
public final class npc extends tje0 implements Function2<Object, v1b<Object>, Object> {
    public Iterator a;
    public kpc b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List<kpc<Object>> f;
    public final /* synthetic */ ArrayList i;

    @c0d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ kpc<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kpc<Object> kpcVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = kpcVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.h() == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npc(List list, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.f = list;
        this.i = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        npc npcVar = new npc(this.f, this.i, v1bVar);
        npcVar.e = obj;
        return npcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<Object> v1bVar) {
        return ((npc) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            java.util.Iterator r1 = r9.a
            java.lang.Object r5 = r9.e
            java.util.List r5 = (java.util.List) r5
            defpackage.uj50.b(r10)
            goto L3b
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L1d:
            java.lang.Object r1 = r9.c
            kpc r5 = r9.b
            java.util.Iterator r6 = r9.a
            java.lang.Object r7 = r9.e
            java.util.List r7 = (java.util.List) r7
            defpackage.uj50.b(r10)
            r8 = r7
            r7 = r5
            r5 = r8
            goto L5d
        L2e:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.e
            java.util.List<kpc<java.lang.Object>> r1 = r9.f
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r5 = r9.i
        L3b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L82
            java.lang.Object r6 = r1.next()
            kpc r6 = (defpackage.kpc) r6
            r9.e = r5
            r9.a = r1
            r9.b = r6
            r9.c = r10
            r9.d = r3
            java.lang.Object r7 = r6.j(r10, r9)
            if (r7 != r0) goto L58
            goto L7d
        L58:
            r8 = r1
            r1 = r10
            r10 = r7
            r7 = r6
            r6 = r8
        L5d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L80
            npc$a r10 = new npc$a
            r10.<init>(r7, r4)
            r5.add(r10)
            r9.e = r5
            r9.a = r6
            r9.b = r4
            r9.c = r4
            r9.d = r2
            java.lang.Object r10 = r7.i(r1, r9)
            if (r10 != r0) goto L7e
        L7d:
            return r0
        L7e:
            r1 = r6
            goto L3b
        L80:
            r10 = r1
            goto L7e
        L82:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
