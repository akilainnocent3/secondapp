package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$requestMultiMaker$1", f = "MultiMakerViewModel.kt", l = {1007, 1042, 1047, 1051, 1055, 1064, 1089, 1124}, m = "invokeSuspend", v = 2)
public final class mjw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public List a;
    public Object b;
    public tjw c;
    public Object d;
    public int e;
    public int f;
    public int i;
    public boolean v;
    public int w;
    public /* synthetic */ Object y;
    public final /* synthetic */ tjw z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjw(tjw tjwVar, boolean z, boolean z2, v1b<? super mjw> v1bVar) {
        super(2, v1bVar);
        this.z = tjwVar;
        this.A = z;
        this.B = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mjw mjwVar = new mjw(this.z, this.A, this.B, v1bVar);
        mjwVar.y = obj;
        return mjwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mjw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f5 A[Catch: all -> 0x0298, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0298, blocks: (B:87:0x028a, B:96:0x02d5, B:100:0x02f5), top: B:183:0x028a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x033e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0378  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x0409  */
    /* JADX WARN: Code duplicated, block: B:143:0x040d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0438 A[PHI: r0 r1 r2 r8 r13 r15
      0x0438: PHI (r0v5 ??) = (r0v100 ??), (r0v101 ??), (r0v102 ??), (r0v103 ??), (r0v104 ??) binds: [B:130:0x0376, B:142:0x040b, B:143:0x040d, B:140:0x03e3, B:139:0x03bb] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r1v5 ??) = (r1v54 ??), (r1v55 ??), (r1v56 ??), (r1v57 ??), (r1v58 ??) binds: [B:130:0x0376, B:142:0x040b, B:143:0x040d, B:140:0x03e3, B:139:0x03bb] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r2v5 int) = (r2v4 int), (r2v6 int), (r2v6 int), (r2v6 int), (r2v6 int) binds: [B:130:0x0376, B:142:0x040b, B:143:0x040d, B:140:0x03e3, B:139:0x03bb] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r8v2 java.lang.Object) = 
      (r8v1 java.lang.Object)
      (r8v3 java.lang.Object)
      (r8v3 java.lang.Object)
      (r8v3 java.lang.Object)
      (r8v3 java.lang.Object)
     binds: [B:130:0x0376, B:142:0x040b, B:143:0x040d, B:140:0x03e3, B:139:0x03bb] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r13v4 ??) = (r13v29 ??), (r13v30 ??), (r13v31 ??), (r13v32 ??), (r13v33 ??) binds: [B:130:0x0376, B:142:0x040b, B:143:0x040d, B:140:0x03e3, B:139:0x03bb] A[DONT_GENERATE, DONT_INLINE]
      0x0438: PHI (r15v5 boolean) = (r15v4 boolean), (r15v6 boolean), (r15v6 boolean), (r15v6 boolean), (r15v6 boolean) binds: [B:130:0x0376, B:142:0x040b, B:143:0x040d, B:140:0x03e3, B:139:0x03bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0443  */
    /* JADX WARN: Code duplicated, block: B:149:0x0467  */
    /* JADX WARN: Code duplicated, block: B:153:0x0488 A[LOOP:0: B:151:0x0482->B:153:0x0488, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:162:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:164:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:165:0x050f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x058e  */
    /* JADX WARN: Code duplicated, block: B:183:0x028a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x049f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x021d  */
    /* JADX WARN: Code duplicated, block: B:72:0x021f A[Catch: all -> 0x005e, PHI: r0 r1 r2 r3 r5 r6 r7 r8
      0x021f: PHI (r0v64 tjw) = (r0v59 tjw), (r0v68 tjw) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r1v40 int) = (r1v69 int), (r1v70 int) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r2v20 int) = (r2v18 int), (r2v21 int) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r3v35 int) = (r3v33 int), (r3v36 int) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r5v24 boolean) = (r5v23 boolean), (r5v0 boolean) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r6v14 int) = (r6v13 int), (r6v0 int) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r7v21 ??) = (r7v37 ??), (r7v33 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r8v18 java.util.List) = (r8v30 java.util.List), (r8v31 java.util.List) binds: [B:70:0x021b, B:18:0x008a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x005e, blocks: (B:9:0x0055, B:15:0x0073, B:18:0x008a, B:72:0x021f, B:21:0x009f, B:69:0x01ff), top: B:192:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x023e  */
    /* JADX WARN: Code duplicated, block: B:82:0x025f A[Catch: all -> 0x035d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x035d, blocks: (B:76:0x0241, B:82:0x025f), top: B:190:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d5 A[Catch: all -> 0x0298, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0298, blocks: (B:87:0x028a, B:96:0x02d5, B:100:0x02f5), top: B:183:0x028a }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02ea A[Catch: all -> 0x0357, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0357, blocks: (B:84:0x0279, B:85:0x0284, B:91:0x029f, B:104:0x0304, B:98:0x02ea), top: B:181:0x0279 }] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        if (r0.join(r38) == r12) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d3, code lost:
    
        if (r0.join(r38) == r12) goto L148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, wwd0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, wwd0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [a6b, java.lang.Object, java.util.concurrent.CancellationException, kotlin.coroutines.CoroutineContext, v1b] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24, types: [jvd0, m9p] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v42, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v7, types: [wwd0] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, wwd0] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.List, tjw] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, tjw] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, tjw] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r9v11, types: [h940] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
