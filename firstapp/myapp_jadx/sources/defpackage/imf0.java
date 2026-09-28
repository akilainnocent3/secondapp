package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class imf0 {
    public static final imf0 d = new imf0(0, 0, null, null, null, 0, null, null, 0, 0, null, null, 16777215);
    public final ora0 a;
    public final qrz b;
    public final uk10 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public imf0(long j, long j2, t9i t9iVar, n9i n9iVar, f8i f8iVar, long j3, yef0 yef0Var, ix80 ix80Var, int i, long j4, uk10 uk10Var, afs afsVar, int i2) {
        long j5 = (i2 & 1) != 0 ? j58.m : j;
        long j6 = (i2 & 2) != 0 ? omf0.c : j2;
        t9i t9iVar2 = (i2 & 4) != 0 ? null : t9iVar;
        n9i n9iVar2 = (i2 & 8) != 0 ? null : n9iVar;
        f8i f8iVar2 = (i2 & 32) != 0 ? null : f8iVar;
        long j7 = (i2 & 128) != 0 ? omf0.c : j3;
        long j8 = j58.m;
        yef0 yef0Var2 = (i2 & 4096) != 0 ? null : yef0Var;
        ix80 ix80Var2 = (i2 & 8192) != 0 ? null : ix80Var;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j9 = (131072 & i2) != 0 ? omf0.c : j4;
        uk10 uk10Var2 = (524288 & i2) != 0 ? null : uk10Var;
        afs afsVar2 = (i2 & 1048576) != 0 ? null : afsVar;
        uk10 uk10Var3 = uk10Var2;
        this(new ora0(j5, j6, t9iVar2, n9iVar2, (o9i) null, f8iVar2, (String) null, j7, (t82) null, (ljf0) null, (cet) null, j8, yef0Var2, ix80Var2, uk10Var2 != null ? uk10Var2.a : null), new qrz(i3, Integer.MIN_VALUE, j9, null, uk10Var3 != null ? uk10Var3.b : null, afsVar2, 0, Integer.MIN_VALUE, null), uk10Var3);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static defpackage.imf0 a(defpackage.imf0 r35, defpackage.ya5 r36, defpackage.t9i r37, defpackage.f8i r38, defpackage.ix80 r39, defpackage.yae0 r40, int r41) {
        /*
            r0 = r35
            r1 = r41
            ora0 r2 = r0.a
            kjf0 r2 = r2.a
            float r5 = r2.a()
            ora0 r2 = r0.a
            long r6 = r2.b
            r3 = r1 & 8
            if (r3 == 0) goto L18
            t9i r3 = r2.c
            r8 = r3
            goto L1a
        L18:
            r8 = r37
        L1a:
            n9i r9 = r2.d
            o9i r10 = r2.e
            r3 = r1 & 64
            if (r3 == 0) goto L26
            f8i r3 = r2.f
            r11 = r3
            goto L28
        L26:
            r11 = r38
        L28:
            java.lang.String r12 = r2.g
            long r13 = r2.h
            t82 r15 = r2.i
            ljf0 r3 = r2.j
            cet r4 = r2.k
            r16 = r3
            r17 = r4
            long r3 = r2.l
            r18 = r3
            yef0 r3 = r2.m
            r4 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L45
            ix80 r4 = r2.n
            r21 = r4
            goto L47
        L45:
            r21 = r39
        L47:
            r4 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r4
            if (r1 == 0) goto L52
            wcf r1 = r2.p
            r23 = r1
            goto L54
        L52:
            r23 = r40
        L54:
            qrz r1 = r0.b
            int r2 = r1.a
            int r4 = r1.b
            r25 = r2
            r20 = r3
            long r2 = r1.c
            r27 = r2
            pjf0 r2 = r1.d
            uk10 r3 = r0.c
            afs r0 = r1.f
            r31 = r0
            int r0 = r1.g
            r32 = r0
            int r0 = r1.h
            qlf0 r1 = r1.i
            r35.getClass()
            r33 = r0
            imf0 r0 = new imf0
            ora0 r22 = new ora0
            r24 = 0
            r34 = r1
            if (r3 == 0) goto L8f
            kk10 r1 = r3.a
            r26 = r22
            r22 = r1
            r1 = r3
            r3 = r26
        L8a:
            r26 = r4
            r4 = r36
            goto L95
        L8f:
            r1 = r3
            r3 = r22
            r22 = r24
            goto L8a
        L95:
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22, r23)
            r4 = r24
            qrz r24 = new qrz
            if (r1 == 0) goto La0
            sj10 r4 = r1.b
        La0:
            r29 = r2
            r30 = r4
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34)
            r2 = r24
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imf0.a(imf0, ya5, t9i, f8i, ix80, yae0, int):imf0");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ??, still in use, count: 1, list:
          (r6v3 ?? I:??[OBJECT, ARRAY]) from 0x0133: INVOKE (r1v2 ?? I:imf0), (r6v3 ?? I:??[OBJECT, ARRAY]), (r7v4 ?? I:qrz), (r0v2 ?? I:uk10) DIRECT call: imf0.<init>(ora0, qrz, uk10):void A[MD:(ora0, qrz, uk10):void (m)] (LINE:308)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static defpackage.imf0 b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ??, still in use, count: 1, list:
          (r6v3 ?? I:??[OBJECT, ARRAY]) from 0x0133: INVOKE (r1v2 ?? I:imf0), (r6v3 ?? I:??[OBJECT, ARRAY]), (r7v4 ?? I:qrz), (r0v2 ?? I:uk10) DIRECT call: imf0.<init>(ora0, qrz, uk10):void A[MD:(ora0, qrz, uk10):void (m)] (LINE:308)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
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

    public static imf0 f(imf0 imf0Var, long j, long j2, t9i t9iVar, n9i n9iVar, f8i f8iVar, long j3, yef0 yef0Var, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? omf0.c : j2;
        t9i t9iVar2 = (i2 & 4) != 0 ? null : t9iVar;
        n9i n9iVar2 = (i2 & 8) != 0 ? null : n9iVar;
        f8i f8iVar2 = (i2 & 32) != 0 ? null : f8iVar;
        long j6 = (i2 & 128) != 0 ? omf0.c : j3;
        long j7 = j58.m;
        yef0 yef0Var2 = (i2 & 4096) != 0 ? null : yef0Var;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        long j8 = (i2 & 131072) != 0 ? omf0.c : j4;
        ora0 ora0VarA = qra0.a(imf0Var.a, j, null, Float.NaN, j5, t9iVar2, n9iVar2, null, f8iVar2, null, j6, null, null, null, j7, yef0Var2, null, null, null);
        qrz qrzVarA = rrz.a(imf0Var.b, i3, Integer.MIN_VALUE, j8, null, null, null, 0, Integer.MIN_VALUE, null);
        return (imf0Var.a == ora0VarA && imf0Var.b == qrzVarA) ? imf0Var : new imf0(ora0VarA, qrzVarA);
    }

    public final long c() {
        return this.a.a.d();
    }

    public final boolean d(imf0 imf0Var) {
        if (this != imf0Var) {
            return Intrinsics.g(this.b, imf0Var.b) && this.a.b(imf0Var.a);
        }
        return true;
    }

    public final imf0 e(imf0 imf0Var) {
        return (imf0Var == null || imf0Var.equals(d)) ? this : new imf0(this.a.d(imf0Var.a), this.b.a(imf0Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imf0)) {
            return false;
        }
        imf0 imf0Var = (imf0) obj;
        return Intrinsics.g(this.a, imf0Var.a) && Intrinsics.g(this.b, imf0Var.b) && Intrinsics.g(this.c, imf0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        uk10 uk10Var = this.c;
        return iHashCode + (uk10Var != null ? uk10Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) j58.i(c()));
        sb.append(", brush=");
        ora0 ora0Var = this.a;
        sb.append(ora0Var.a.e());
        sb.append(", alpha=");
        sb.append(ora0Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) omf0.f(ora0Var.b));
        sb.append(", fontWeight=");
        sb.append(ora0Var.c);
        sb.append(", fontStyle=");
        sb.append(ora0Var.d);
        sb.append(", fontSynthesis=");
        sb.append(ora0Var.e);
        sb.append(", fontFamily=");
        sb.append(ora0Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(ora0Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) omf0.f(ora0Var.h));
        sb.append(", baselineShift=");
        sb.append(ora0Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(ora0Var.j);
        sb.append(", localeList=");
        sb.append(ora0Var.k);
        sb.append(", background=");
        ofz.a(ora0Var.l, ", textDecoration=", sb);
        sb.append(ora0Var.m);
        sb.append(", shadow=");
        sb.append(ora0Var.n);
        sb.append(", drawStyle=");
        sb.append(ora0Var.p);
        sb.append(", textAlign=");
        qrz qrzVar = this.b;
        sb.append((Object) gdf0.b(qrzVar.a));
        sb.append(", textDirection=");
        sb.append((Object) dff0.a(qrzVar.b));
        sb.append(", lineHeight=");
        sb.append((Object) omf0.f(qrzVar.c));
        sb.append(", textIndent=");
        sb.append(qrzVar.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(qrzVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) yes.a(qrzVar.g));
        sb.append(", hyphens=");
        sb.append((Object) tqm.a(qrzVar.h));
        sb.append(", textMotion=");
        sb.append(qrzVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public imf0(ya5 ya5Var, long j, t9i t9iVar, f8i f8iVar, ix80 ix80Var, yae0 yae0Var, long j2, int i) {
        long j3 = (i & 4) != 0 ? omf0.c : j;
        t9i t9iVar2 = (i & 8) != 0 ? null : t9iVar;
        f8i f8iVar2 = (i & 64) != 0 ? null : f8iVar;
        long j4 = omf0.c;
        this(new ora0(ya5Var, Float.NaN, j3, t9iVar2, null, null, f8iVar2, null, j4, null, null, null, j58.m, null, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : ix80Var, null, (32768 & i) != 0 ? null : yae0Var), new qrz((65536 & i) != 0 ? Integer.MIN_VALUE : 3, Integer.MIN_VALUE, (i & 262144) != 0 ? j4 : j2, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public imf0(ora0 ora0Var, qrz qrzVar) {
        kk10 kk10Var = ora0Var.o;
        sj10 sj10Var = qrzVar.e;
        this(ora0Var, qrzVar, (kk10Var == null && sj10Var == null) ? null : new uk10(kk10Var, sj10Var));
    }

    public imf0(ora0 ora0Var, qrz qrzVar, uk10 uk10Var) {
        this.a = ora0Var;
        this.b = qrzVar;
        this.c = uk10Var;
    }
}
