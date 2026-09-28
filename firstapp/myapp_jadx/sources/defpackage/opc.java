package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class opc<T> {
    public static final a a = new a();

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:27:0x0066  */
        /* JADX WARN: Code duplicated, block: B:37:0x008c  */
        /* JADX WARN: Code duplicated, block: B:39:0x008f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0060->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007d -> B:25:0x0060). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0080 -> B:25:0x0060). Please report as a decompilation issue!!! */
        public final Object a(List list, ain ainVar, x1b x1bVar) throws Throwable {
            mpc mpcVar;
            List list2;
            Iterator<T> it;
            dq40 dq40Var;
            Throwable th;
            Function1 function1;
            if (x1bVar instanceof mpc) {
                mpcVar = (mpc) x1bVar;
                int i = mpcVar.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    mpcVar.e = i - Integer.MIN_VALUE;
                } else {
                    mpcVar = new mpc(this, x1bVar);
                }
            } else {
                mpcVar = new mpc(this, x1bVar);
            }
            Object obj = mpcVar.c;
            Object obj2 = y5b.a;
            int i2 = mpcVar.e;
            if (i2 == 0) {
                ArrayList arrayListA = j9f.a(obj);
                npc npcVar = new npc(list, arrayListA, null);
                mpcVar.a = arrayListA;
                mpcVar.e = 1;
                if (ainVar.a(npcVar, mpcVar) != obj2) {
                    list2 = arrayListA;
                }
                return obj2;
            }
            if (i2 == 1) {
                list2 = (List) mpcVar.a;
                uj50.b(obj);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = mpcVar.b;
                dq40Var = (dq40) mpcVar.a;
                try {
                    uj50.b(obj);
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    this = this;
                    boolean r0 = r8 instanceof defpackage.mpc
                    if (r0 == 0) goto L13
                    r0 = r8
                    mpc r0 = (defpackage.mpc) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    mpc r0 = new mpc
                    r0.<init>(r5, r8)
                L18:
                    java.lang.Object r5 = r0.c
                    y5b r8 = defpackage.y5b.a
                    int r1 = r0.e
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L41
                    if (r1 == r4) goto L39
                    if (r1 != r3) goto L33
                    java.util.Iterator r6 = r0.b
                    java.io.Serializable r7 = r0.a
                    dq40 r7 = (defpackage.dq40) r7
                    defpackage.uj50.b(r5)     // Catch: java.lang.Throwable -> L31
                    goto L60
                L31:
                    r5 = move-exception
                    goto L79
                L33:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r2
                L39:
                    java.io.Serializable r6 = r0.a
                    java.util.List r6 = (java.util.List) r6
                    defpackage.uj50.b(r5)
                    goto L56
                L41:
                    java.util.ArrayList r5 = defpackage.j9f.a(r5)
                    npc r1 = new npc
                    r1.<init>(r6, r5, r2)
                    r0.a = r5
                    r0.e = r4
                    java.lang.Object r6 = r7.a(r1, r0)
                    if (r6 != r8) goto L55
                    goto L78
                L55:
                    r6 = r5
                L56:
                    dq40 r5 = new dq40
                    r5.<init>()
                    java.util.Iterator r6 = r6.iterator()
                    r7 = r5
                L60:
                    boolean r5 = r6.hasNext()
                    if (r5 == 0) goto L86
                    java.lang.Object r5 = r6.next()
                    kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                    r0.a = r7     // Catch: java.lang.Throwable -> L31
                    r0.b = r6     // Catch: java.lang.Throwable -> L31
                    r0.e = r3     // Catch: java.lang.Throwable -> L31
                    java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L31
                    if (r5 != r8) goto L60
                L78:
                    return r8
                L79:
                    T r1 = r7.a
                    if (r1 != 0) goto L80
                    r7.a = r5
                    goto L60
                L80:
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    defpackage.rtg.a(r1, r5)
                    goto L60
                L86:
                    T r5 = r7.a
                    java.lang.Throwable r5 = (java.lang.Throwable) r5
                    if (r5 != 0) goto L8f
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                L8f:
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: opc.a.a(java.util.List, ain, x1b):java.lang.Object");
            }
        }
    }
