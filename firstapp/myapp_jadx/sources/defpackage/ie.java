package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ie {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public static final class a<O> {
        public final ud<O> a;
        public final vd<?, O> b;

        public a(vd vdVar, ud udVar) {
            udVar.getClass();
            vdVar.getClass();
            this.a = udVar;
            this.b = vdVar;
        }
    }

    public static final class b {
        public final s9s a;
        public final ArrayList b = new ArrayList();

        public b(s9s s9sVar) {
            this.a = s9sVar;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.LinkedHashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            ie$a r0 = (ie.a) r0
            if (r0 == 0) goto L1d
            ud<O> r1 = r0.a
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.d
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            ud<O> r3 = r0.a
            vd<?, O> r0 = r0.b
            java.lang.Object r5 = r0.c(r6, r5)
            r3.a(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f
            r0.remove(r4)
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r6, r5)
            android.os.Bundle r3 = r3.g
            r3.putParcelable(r4, r0)
        L46:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie.a(int, int, android.content.Intent):boolean");
    }

    public abstract void b(int i, vd vdVar, Object obj);

    public final le d(String str, vd vdVar, ud udVar) {
        str.getClass();
        e(str);
        this.e.put(str, new a(vdVar, udVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            udVar.a(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) rj5.a(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            udVar.a(vdVar.c(activityResult.b, activityResult.a));
        }
        return new le(this, str, vdVar);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        final je jeVar = je.a;
        jeVar.getClass();
        for (Number number : new dwa(new q1k(jeVar, new Function1() { // from class: cd80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                obj.getClass();
                return jeVar.invoke();
            }
        }))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        ibh0.a("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbA = he.a("Dropping pending result for request ", str, ": ");
            sbA.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbA.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) rj5.a(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        b bVar = (b) linkedHashMap2.get(str);
        if (bVar != null) {
            ArrayList arrayList = bVar.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bVar.a.d((cbs) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final ke c(final String str, ibs ibsVar, final vd vdVar, final ud udVar) {
        str.getClass();
        vdVar.getClass();
        udVar.getClass();
        s9s lifecycle = ibsVar.getLifecycle();
        if (lifecycle.b().compareTo(s9s.b.d) < 0) {
            e(str);
            LinkedHashMap linkedHashMap = this.c;
            b bVar = (b) linkedHashMap.get(str);
            if (bVar == null) {
                bVar = new b(lifecycle);
            }
            cbs cbsVar = new cbs() { // from class: ge
                @Override // defpackage.cbs
                public final void F0(ibs ibsVar2, s9s.a aVar) {
                    s9s.a aVar2 = s9s.a.ON_START;
                    ie ieVar = this.a;
                    String str2 = str;
                    if (aVar2 != aVar) {
                        if (s9s.a.ON_STOP == aVar) {
                            ieVar.e.remove(str2);
                            return;
                        } else {
                            if (s9s.a.ON_DESTROY == aVar) {
                                ieVar.f(str2);
                                return;
                            }
                            return;
                        }
                    }
                    LinkedHashMap linkedHashMap2 = ieVar.e;
                    Bundle bundle = ieVar.g;
                    LinkedHashMap linkedHashMap3 = ieVar.f;
                    vd vdVar2 = vdVar;
                    ud udVar2 = udVar;
                    linkedHashMap2.put(str2, new ie.a(vdVar2, udVar2));
                    if (linkedHashMap3.containsKey(str2)) {
                        Object obj = linkedHashMap3.get(str2);
                        linkedHashMap3.remove(str2);
                        udVar2.a(obj);
                    }
                    ActivityResult activityResult = (ActivityResult) rj5.a(bundle, str2, ActivityResult.class);
                    if (activityResult != null) {
                        bundle.remove(str2);
                        udVar2.a(vdVar2.c(activityResult.b, activityResult.a));
                    }
                }
            };
            bVar.a.a(cbsVar);
            bVar.b.add(cbsVar);
            linkedHashMap.put(str, bVar);
            return new ke(this, str, vdVar);
        }
        StringBuilder sb = new StringBuilder(LxHElgWAiSeM.EwBH);
        sb.append(ibsVar);
        s9s.b bVarB = lifecycle.b();
        sb.append(" is attempting to register while current state is ");
        sb.append(bVarB);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString().toString());
    }
}
