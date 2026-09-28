package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.UserTier;
import com.sportybet.android.gp.tz.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b4u implements lyh<myt> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ b3u b;

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$special$$inlined$combine$1", f = "LoyaltyViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return b4u.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$special$$inlined$combine$1$3", f = "LoyaltyViewModel.kt", l = {290, 326, 329, 234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super myt>, Object[], v1b<? super Unit>, Object> {
        public lk50 A;
        public ib50 B;
        public krf0 C;
        public tyt D;
        public jwv E;
        public kst F;
        public y0u G;
        public List H;
        public Set I;
        public Object J;
        public long K;
        public boolean L;
        public boolean M;
        public boolean N;
        public boolean O;
        public int P;
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ b3u d;
        public myh e;
        public b3u.d f;
        public String i;
        public p34 v;
        public List w;
        public b3u.a y;
        public st3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, b3u b3uVar) {
            super(3, v1bVar);
            this.d = b3uVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super myt> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:101:0x0501  */
        /* JADX WARN: Code duplicated, block: B:105:0x0594  */
        /* JADX WARN: Code duplicated, block: B:108:0x05b0  */
        /* JADX WARN: Code duplicated, block: B:110:0x05b4  */
        /* JADX WARN: Code duplicated, block: B:118:0x05fb  */
        /* JADX WARN: Code duplicated, block: B:120:0x0600  */
        /* JADX WARN: Code duplicated, block: B:122:0x040b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:123:0x040f A[EDGE_INSN: B:123:0x040f->B:75:0x040f BREAK  A[LOOP:0: B:68:0x03e2->B:73:0x0406], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:124:0x04a2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x04a7 A[EDGE_INSN: B:125:0x04a7->B:88:0x04a7 BREAK  A[LOOP:1: B:81:0x0483->B:86:0x049d], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x0247  */
        /* JADX WARN: Code duplicated, block: B:36:0x026c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0274  */
        /* JADX WARN: Code duplicated, block: B:39:0x0280 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0282  */
        /* JADX WARN: Code duplicated, block: B:59:0x03a0  */
        /* JADX WARN: Code duplicated, block: B:61:0x03c3  */
        /* JADX WARN: Code duplicated, block: B:63:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:64:0x03d6  */
        /* JADX WARN: Code duplicated, block: B:66:0x03da A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:67:0x03dc  */
        /* JADX WARN: Code duplicated, block: B:70:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:73:0x0406 A[LOOP:0: B:68:0x03e2->B:73:0x0406, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:77:0x0413  */
        /* JADX WARN: Code duplicated, block: B:79:0x0418  */
        /* JADX WARN: Code duplicated, block: B:83:0x0489  */
        /* JADX WARN: Code duplicated, block: B:86:0x049d A[LOOP:1: B:81:0x0483->B:86:0x049d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:90:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:93:0x04ba  */
        /* JADX WARN: Code duplicated, block: B:94:0x04bd  */
        /* JADX WARN: Code duplicated, block: B:96:0x04c2  */
        /* JADX WARN: Code duplicated, block: B:97:0x04c5  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v33, types: [b3u$a, b3u$d, ib50, java.lang.Object, java.lang.Object[], java.lang.String, java.util.List, java.util.Set, jwv, krf0, kst, lk50, myh, p34, st3, tyt, y0u] */
        /* JADX WARN: Type inference failed for: r5v34 */
        /* JADX WARN: Type inference failed for: r5v41 */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i;
            myh myhVar;
            String str;
            p34 p34Var;
            List list;
            b3u.a aVar;
            ib50 ib50Var;
            lk50<ftt> lk50Var;
            krf0 krf0Var;
            long j;
            tyt tytVar;
            jwv jwvVar;
            boolean z;
            int i2;
            List list2;
            b3u.d dVar;
            kst kstVar;
            y5b y5bVar;
            jwv jwvVar2;
            List list3;
            st3 st3Var;
            y0u y0uVar;
            boolean z2;
            boolean z3;
            boolean z4;
            long j2;
            boolean z5;
            int i3;
            tyt tytVar2;
            ib50 ib50Var2;
            lk50<ftt> lk50Var2;
            kst kstVar2;
            st3 st3Var2;
            myh myhVar2;
            Object objF1;
            b3u.d dVar2;
            boolean z6;
            p34 p34Var2;
            boolean z7;
            String str2;
            y0u y0uVar2;
            b3u.a aVar2;
            Set<String> set;
            List list4;
            boolean z8;
            List list5;
            boolean z9;
            myt mytVar;
            boolean z10;
            c cVar;
            y5b y5bVar2;
            List list6;
            krf0 krf0Var2;
            krf0 krf0VarL1;
            List list7;
            jwv jwvVar3;
            st3 st3Var3;
            boolean z11;
            boolean z12;
            boolean z13;
            Iterator it;
            boolean z14;
            Object next;
            LoyaltyActivityData loyaltyActivityData;
            Object objQ1;
            ib50 ib50Var3;
            int i4;
            krf0 krf0Var3;
            boolean z15;
            y5b y5bVar3;
            lk50<ftt> lk50Var3;
            tyt tytVar3;
            y0u y0uVar3;
            boolean z16;
            myh myhVar3;
            kst kstVar3;
            List list8;
            st3 st3Var4;
            boolean z17;
            String str3;
            krf0 krf0Var4;
            boolean z18;
            p34 p34Var3;
            long j3;
            List list9;
            b3u.d dVar3;
            b3u.a aVar3;
            Iterator it2;
            q3.b bVarA;
            Object next2;
            krf0 krf0Var5;
            q3.b bVar;
            String str4;
            r720 cVar2;
            s1g0 s1g0Var;
            boolean z19;
            b3u.d dVar4;
            y0u y0uVar4;
            kst kstVar4;
            myh myhVar4;
            int i5;
            boolean z20;
            boolean z21;
            tyt tytVar4;
            boolean z22;
            st3 st3Var5;
            boolean z23;
            Object objZ1;
            tyt tytVar5;
            kst kstVar5;
            y0u y0uVar5;
            boolean z24;
            s1g0 s1g0Var2;
            st3 st3Var6;
            boolean z25;
            boolean z26;
            b3u.d dVar5;
            boolean z27;
            ?? r5;
            boolean z28;
            y5b y5bVar4 = y5b.a;
            int i6 = this.a;
            b3u b3uVar = this.d;
            if (i6 != 0) {
                if (i6 == 1) {
                    int i7 = this.P;
                    boolean z29 = this.O;
                    boolean z30 = this.N;
                    boolean z31 = this.M;
                    boolean z32 = this.L;
                    long j4 = this.K;
                    Set<String> set2 = this.I;
                    List list10 = this.H;
                    i = 2;
                    y0u y0uVar6 = this.G;
                    kst kstVar6 = this.F;
                    jwv jwvVar4 = this.E;
                    tytVar = this.D;
                    krf0 krf0Var6 = this.C;
                    ib50 ib50Var4 = this.B;
                    lk50<ftt> lk50Var4 = this.A;
                    st3Var2 = this.z;
                    aVar2 = this.y;
                    list4 = this.w;
                    p34Var2 = this.v;
                    str2 = this.i;
                    dVar2 = this.f;
                    myh myhVar5 = this.e;
                    uj50.b(obj);
                    kstVar2 = kstVar6;
                    krf0Var = krf0Var6;
                    list5 = list10;
                    set = set2;
                    myhVar2 = myhVar5;
                    objF1 = obj;
                    jwvVar = jwvVar4;
                    ib50Var = ib50Var4;
                    z6 = z29;
                    i2 = i7;
                    lk50Var = lk50Var4;
                    j = j4;
                    z8 = z31;
                    z9 = z32;
                    y0uVar2 = y0uVar6;
                    z7 = z30;
                } else if (i6 == 2) {
                    int i8 = this.P;
                    boolean z33 = this.O;
                    boolean z34 = this.N;
                    boolean z35 = this.M;
                    boolean z36 = this.L;
                    long j5 = this.K;
                    krf0 krf0Var7 = (krf0) this.J;
                    Set set3 = this.I;
                    List list11 = this.H;
                    y0u y0uVar7 = this.G;
                    kst kstVar7 = this.F;
                    jwv jwvVar5 = this.E;
                    tyt tytVar6 = this.D;
                    krf0 krf0Var8 = this.C;
                    ib50 ib50Var5 = this.B;
                    lk50<ftt> lk50Var5 = this.A;
                    st3 st3Var7 = this.z;
                    b3u.a aVar4 = this.y;
                    List list12 = this.w;
                    p34 p34Var4 = this.v;
                    String str5 = this.i;
                    b3u.d dVar6 = this.f;
                    myh myhVar6 = this.e;
                    uj50.b(obj);
                    z17 = z35;
                    i4 = i8;
                    lk50Var3 = lk50Var5;
                    p34Var3 = p34Var4;
                    list8 = list11;
                    krf0Var4 = krf0Var7;
                    st3Var4 = st3Var7;
                    b3uVar = b3uVar;
                    ib50Var3 = ib50Var5;
                    str3 = str5;
                    aVar3 = aVar4;
                    y5bVar3 = y5bVar4;
                    z18 = z36;
                    z16 = z33;
                    y0uVar3 = y0uVar7;
                    myhVar3 = myhVar6;
                    tytVar3 = tytVar6;
                    dVar3 = dVar6;
                    z15 = z34;
                    kstVar3 = kstVar7;
                    list9 = list12;
                    krf0Var3 = krf0Var8;
                    jwvVar3 = jwvVar5;
                    j3 = j5;
                    str4 = (String) obj;
                    if (str4 != null) {
                        cVar2 = new r720.c(str4);
                    } else {
                        cVar2 = r720.b.a;
                    }
                    s1g0Var = new s1g0(krf0Var4, cVar2);
                    ftt fttVar = (ftt) ((lk50.c) lk50Var3).a;
                    LoyaltyTierConfig loyaltyTierConfig = fttVar.a;
                    UserTier userTier = fttVar.b;
                    String str6 = dVar3.b;
                    this.b = null;
                    this.c = null;
                    this.e = myhVar3;
                    this.f = dVar3;
                    this.i = null;
                    this.v = null;
                    this.w = null;
                    this.y = null;
                    this.z = st3Var4;
                    this.A = null;
                    this.B = null;
                    this.C = null;
                    this.D = tytVar3;
                    this.E = null;
                    this.F = kstVar3;
                    this.G = y0uVar3;
                    this.H = null;
                    this.I = null;
                    this.J = s1g0Var;
                    this.K = j3;
                    this.L = z18;
                    this.M = z17;
                    this.N = z15;
                    this.O = z16;
                    int i9 = i4;
                    this.P = i9;
                    z19 = z18;
                    this.a = 3;
                    List list13 = list9;
                    dVar4 = dVar3;
                    y0uVar4 = y0uVar3;
                    kstVar4 = kstVar3;
                    myhVar4 = myhVar3;
                    y5bVar2 = y5bVar3;
                    krf0 krf0Var9 = krf0Var3;
                    i5 = i9;
                    z20 = z17;
                    List list14 = list8;
                    z21 = z16;
                    tytVar4 = tytVar3;
                    long j6 = j3;
                    String str7 = str3;
                    p34 p34Var5 = p34Var3;
                    z22 = true;
                    st3Var5 = st3Var4;
                    ib50 ib50Var6 = ib50Var3;
                    z23 = z15;
                    objZ1 = b3uVar.z1(loyaltyTierConfig, userTier, krf0Var9, list14, tytVar4, ib50Var6, jwvVar3, str6, str7, p34Var5, list13, j6, aVar3, this);
                    cVar = this;
                    if (objZ1 == y5bVar2) {
                        return y5bVar2;
                    }
                    tytVar5 = tytVar4;
                    kstVar5 = kstVar4;
                    y0uVar5 = y0uVar4;
                    z24 = z20;
                    s1g0Var2 = s1g0Var;
                    st3Var6 = st3Var5;
                    z25 = z21;
                    z26 = z23;
                    dVar5 = dVar4;
                    z27 = z19;
                    uf00 uf00Var = (uf00) objZ1;
                    boolean z37 = dVar5.a;
                    if (i5 != 0) {
                        z28 = z22;
                    } else {
                        z28 = false;
                    }
                    mytVar = new myt(new gtt.b(uf00Var, s1g0Var2, z37, z28, tytVar5, z27), kstVar5, y0uVar5, z24, z26, z25, st3Var6.c, st3Var6.d);
                    myhVar = myhVar4;
                    r5 = 0;
                    cVar.b = r5;
                    cVar.c = r5;
                    cVar.e = r5;
                    cVar.f = r5;
                    cVar.i = r5;
                    cVar.v = r5;
                    cVar.w = r5;
                    cVar.y = r5;
                    cVar.z = r5;
                    cVar.A = r5;
                    cVar.B = r5;
                    cVar.C = r5;
                    cVar.D = r5;
                    cVar.E = r5;
                    cVar.F = r5;
                    cVar.G = r5;
                    cVar.H = r5;
                    cVar.I = r5;
                    cVar.J = r5;
                    cVar.a = 4;
                    if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                        return y5bVar2;
                    }
                } else if (i6 == 3) {
                    int i10 = this.P;
                    boolean z38 = this.O;
                    boolean z39 = this.N;
                    boolean z40 = this.M;
                    boolean z41 = this.L;
                    s1g0 s1g0Var3 = (s1g0) this.J;
                    Set set4 = this.I;
                    y0u y0uVar8 = this.G;
                    kst kstVar8 = this.F;
                    tyt tytVar7 = this.D;
                    lk50 lk50Var6 = this.A;
                    st3 st3Var8 = this.z;
                    b3u.d dVar7 = this.f;
                    myh myhVar7 = this.e;
                    uj50.b(obj);
                    i5 = i10;
                    myhVar4 = myhVar7;
                    z27 = z41;
                    y0uVar5 = y0uVar8;
                    z22 = true;
                    cVar = this;
                    y5bVar2 = y5bVar4;
                    z25 = z38;
                    z24 = z40;
                    kstVar5 = kstVar8;
                    st3Var6 = st3Var8;
                    objZ1 = obj;
                    s1g0Var2 = s1g0Var3;
                    z26 = z39;
                    dVar5 = dVar7;
                    tytVar5 = tytVar7;
                    uf00 uf00Var2 = (uf00) objZ1;
                    boolean z310 = dVar5.a;
                    if (i5 != 0) {
                        z28 = z22;
                    } else {
                        z28 = false;
                    }
                    mytVar = new myt(new gtt.b(uf00Var2, s1g0Var2, z310, z28, tytVar5, z27), kstVar5, y0uVar5, z24, z26, z25, st3Var6.c, st3Var6.d);
                    myhVar = myhVar4;
                    r5 = 0;
                    cVar.b = r5;
                    cVar.c = r5;
                    cVar.e = r5;
                    cVar.f = r5;
                    cVar.i = r5;
                    cVar.v = r5;
                    cVar.w = r5;
                    cVar.y = r5;
                    cVar.z = r5;
                    cVar.A = r5;
                    cVar.B = r5;
                    cVar.C = r5;
                    cVar.D = r5;
                    cVar.E = r5;
                    cVar.F = r5;
                    cVar.G = r5;
                    cVar.H = r5;
                    cVar.I = r5;
                    cVar.J = r5;
                    cVar.a = 4;
                    if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                        return y5bVar2;
                    }
                } else {
                    if (i6 != 4) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
            i = 2;
            int i11 = 3;
            uj50.b(obj);
            myhVar = this.b;
            Object[] objArr = this.c;
            Object obj2 = objArr[0];
            obj2.getClass();
            b3u.e eVar = (b3u.e) obj2;
            Object obj3 = objArr[1];
            obj3.getClass();
            b3u.b bVar2 = (b3u.b) obj3;
            Object obj4 = objArr[2];
            obj4.getClass();
            b3u.f fVar = (b3u.f) obj4;
            Object obj5 = objArr[3];
            obj5.getClass();
            b3u.d dVar8 = (b3u.d) obj5;
            Object obj6 = objArr[4];
            obj6.getClass();
            Object obj7 = objArr[5];
            obj7.getClass();
            str = (String) obj7;
            Object obj8 = objArr[6];
            obj8.getClass();
            p34Var = (p34) obj8;
            Object obj9 = objArr[7];
            obj9.getClass();
            list = (List) obj9;
            Object obj10 = objArr[8];
            obj10.getClass();
            long jLongValue = ((Long) obj10).longValue();
            Object obj11 = objArr[9];
            obj11.getClass();
            aVar = (b3u.a) obj11;
            Object obj12 = objArr[10];
            obj12.getClass();
            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
            Object obj13 = objArr[11];
            obj13.getClass();
            st3 st3Var9 = (st3) obj13;
            lk50<ftt> lk50Var7 = eVar.a;
            ib50Var = eVar.b;
            lk50Var = lk50Var7;
            krf0Var = bVar2.a;
            j = jLongValue;
            lk50<List<LoyaltyActivityData>> lk50Var8 = bVar2.b;
            tytVar = bVar2.c;
            jwvVar = ((b3u.c) obj6).a;
            kst kstVar9 = fVar.a;
            y0u y0uVar9 = fVar.b;
            boolean z42 = fVar.c;
            boolean z43 = fVar.d;
            boolean z44 = fVar.e;
            boolean z45 = lk50Var8 instanceof lk50.c;
            if (z45) {
                Iterable iterable = (Iterable) ((lk50.c) lk50Var8).a;
                z = z43;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it3 = iterable.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            int status = ((LoyaltyActivityData) it3.next()).getStatus();
                            Iterator it4 = it3;
                            int i12 = i11;
                            if (status != i12) {
                                i11 = i12;
                                it3 = it4;
                            } else if (b3uVar.c.d.a.getValue() == null) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                }
                if (lk50Var8 instanceof lk50.a) {
                    gtt.a aVar5 = gtt.a.a;
                    StringUiText stringUiText = vch0.a;
                    mytVar = new myt(aVar5, new kst.c(new ResourceUiText(R.string.common_functions__error), ((lk50.a) lk50Var8).b, igm.l.a), 252);
                    z10 = false;
                } else {
                    if (Intrinsics.g(lk50Var8, lk50.b.a)) {
                        if (z45) {
                            uhc.a();
                            return null;
                        }
                        list2 = (List) ((lk50.c) lk50Var8).a;
                        Set<String> setO1 = b3uVar.O1((String) b3uVar.N.a.getValue());
                        if ((tytVar instanceof tyt.b) || !((tyt.b) tytVar).d || krf0Var == null) {
                            dVar = dVar8;
                            kstVar = kstVar9;
                            y5bVar = y5bVar4;
                            jwvVar2 = jwvVar;
                            list3 = list2;
                            st3Var = st3Var9;
                            y0uVar = y0uVar9;
                            z2 = z42;
                            z3 = z;
                            z4 = zBooleanValue;
                            krf0Var = krf0Var;
                            j2 = j;
                            z5 = z44;
                            i3 = i2;
                            tytVar2 = tytVar;
                            ib50Var2 = ib50Var;
                            lk50Var2 = lk50Var;
                            myhVar = myhVar;
                        } else {
                            this.b = null;
                            this.c = null;
                            this.e = myhVar;
                            this.f = dVar8;
                            this.i = str;
                            this.v = p34Var;
                            this.w = list;
                            this.y = aVar;
                            this.z = st3Var9;
                            this.A = lk50Var;
                            this.B = ib50Var;
                            this.C = krf0Var;
                            this.D = tytVar;
                            this.E = jwvVar;
                            this.F = kstVar2;
                            st3Var2 = st3Var9;
                            this.G = y0uVar9;
                            this.H = list2;
                            this.I = setO1;
                            myhVar2 = myhVar;
                            this.K = j;
                            this.L = zBooleanValue;
                            this.M = z42;
                            this.N = z;
                            this.O = z44;
                            this.P = i2;
                            this.a = 1;
                            objF1 = b3uVar.F1(lk50Var, krf0Var, this);
                            if (objF1 == y5bVar4) {
                                kstVar2 = kstVar9;
                                y5bVar4 = y5bVar4;
                                return y5bVar4;
                            }
                            kstVar2 = kstVar9;
                            y5bVar4 = y5bVar4;
                            boolean z46 = z;
                            dVar2 = dVar8;
                            z6 = z44;
                            p34Var2 = p34Var;
                            z7 = z46;
                            str2 = str;
                            y0uVar2 = y0uVar9;
                            aVar2 = aVar;
                            set = setO1;
                            list4 = list;
                            z8 = z42;
                            list5 = list2;
                            z9 = zBooleanValue;
                        }
                        if (lk50Var2 instanceof lk50.a) {
                            gtt.a aVar6 = gtt.a.a;
                            StringUiText stringUiText2 = vch0.a;
                            mytVar = new myt(aVar6, new kst.c(new ResourceUiText(R.string.common_functions__error), ((lk50.a) lk50Var2).b, igm.l.a), 252);
                        } else {
                            if (!Intrinsics.g(lk50Var2, lk50.b.a)) {
                                if (!(lk50Var2 instanceof lk50.c)) {
                                    uhc.a();
                                    return null;
                                }
                                if (krf0Var == null) {
                                    uag uagVar = krf0.I;
                                    bVarA = ocx.a(uagVar, uagVar);
                                    while (true) {
                                        if (!bVarA.hasNext()) {
                                            list6 = list3;
                                            next2 = null;
                                            break;
                                        }
                                        next2 = bVarA.next();
                                        bVar = bVarA;
                                        list6 = list3;
                                        if (((ftt) ((lk50.c) lk50Var2).a).b.getCurrentTier() == ((krf0) next2).a) {
                                            break;
                                        }
                                        bVarA = bVar;
                                        list3 = list6;
                                    }
                                    krf0Var5 = (krf0) next2;
                                    if (krf0Var5 == null) {
                                        krf0Var5 = krf0.TIER_0;
                                    }
                                    krf0Var2 = krf0Var5;
                                } else {
                                    list6 = list3;
                                    krf0Var2 = krf0Var;
                                }
                                krf0VarL1 = b3u.L1(((ftt) ((lk50.c) lk50Var2).a).b.getCurrentTier());
                                this.b = null;
                                this.c = null;
                                this.e = myhVar;
                                this.f = dVar;
                                this.i = str;
                                this.v = p34Var;
                                this.w = list;
                                this.y = aVar;
                                this.z = st3Var;
                                this.A = lk50Var2;
                                this.B = ib50Var2;
                                this.C = krf0Var2;
                                this.D = tytVar2;
                                this.E = jwvVar2;
                                this.F = kstVar;
                                this.G = y0uVar;
                                list7 = list6;
                                this.H = list7;
                                jwvVar3 = jwvVar2;
                                this.I = null;
                                this.J = krf0VarL1;
                                st3Var3 = st3Var;
                                this.K = j2;
                                z11 = z4;
                                this.L = z11;
                                z12 = z2;
                                this.M = z12;
                                z13 = z3;
                                this.N = z13;
                                this.O = z5;
                                this.P = i3;
                                this.a = i;
                                it = list7.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z14 = z12;
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    it2 = it;
                                    z14 = z12;
                                    if (((LoyaltyActivityData) next).getStatus() == 1) {
                                        break;
                                    }
                                    z12 = z14;
                                    it = it2;
                                }
                                loyaltyActivityData = (LoyaltyActivityData) next;
                                if (loyaltyActivityData != null) {
                                    objQ1 = b3uVar.Q1(loyaltyActivityData, this);
                                    if (objQ1 != y5b.a) {
                                        objQ1 = (String) objQ1;
                                    }
                                } else {
                                    objQ1 = null;
                                }
                                if (objQ1 == y5bVar) {
                                    return y5bVar;
                                }
                                ib50Var3 = ib50Var2;
                                i4 = i3;
                                krf0Var3 = krf0Var2;
                                z15 = z13;
                                y5bVar3 = y5bVar;
                                lk50Var3 = lk50Var2;
                                tytVar3 = tytVar2;
                                y0uVar3 = y0uVar;
                                z16 = z5;
                                myhVar3 = myhVar;
                                kstVar3 = kstVar;
                                list8 = list7;
                                st3Var4 = st3Var3;
                                z17 = z14;
                                str3 = str;
                                b3u.d dVar9 = dVar;
                                krf0Var4 = krf0VarL1;
                                obj = objQ1;
                                z18 = z11;
                                p34Var3 = p34Var;
                                j3 = j2;
                                list9 = list;
                                dVar3 = dVar9;
                                aVar3 = aVar;
                                str4 = (String) obj;
                                if (str4 != null) {
                                    cVar2 = new r720.c(str4);
                                } else {
                                    cVar2 = r720.b.a;
                                }
                                s1g0Var = new s1g0(krf0Var4, cVar2);
                                ftt fttVar2 = (ftt) ((lk50.c) lk50Var3).a;
                                LoyaltyTierConfig loyaltyTierConfig2 = fttVar2.a;
                                UserTier userTier2 = fttVar2.b;
                                String str8 = dVar3.b;
                                this.b = null;
                                this.c = null;
                                this.e = myhVar3;
                                this.f = dVar3;
                                this.i = null;
                                this.v = null;
                                this.w = null;
                                this.y = null;
                                this.z = st3Var4;
                                this.A = null;
                                this.B = null;
                                this.C = null;
                                this.D = tytVar3;
                                this.E = null;
                                this.F = kstVar3;
                                this.G = y0uVar3;
                                this.H = null;
                                this.I = null;
                                this.J = s1g0Var;
                                this.K = j3;
                                this.L = z18;
                                this.M = z17;
                                this.N = z15;
                                this.O = z16;
                                int i13 = i4;
                                this.P = i13;
                                z19 = z18;
                                this.a = 3;
                                List list15 = list9;
                                dVar4 = dVar3;
                                y0uVar4 = y0uVar3;
                                kstVar4 = kstVar3;
                                myhVar4 = myhVar3;
                                y5bVar2 = y5bVar3;
                                krf0 krf0Var10 = krf0Var3;
                                i5 = i13;
                                z20 = z17;
                                List list16 = list8;
                                z21 = z16;
                                tytVar4 = tytVar3;
                                long j7 = j3;
                                String str9 = str3;
                                p34 p34Var6 = p34Var3;
                                z22 = true;
                                st3Var5 = st3Var4;
                                ib50 ib50Var7 = ib50Var3;
                                z23 = z15;
                                objZ1 = b3uVar.z1(loyaltyTierConfig2, userTier2, krf0Var10, list16, tytVar4, ib50Var7, jwvVar3, str8, str9, p34Var6, list15, j7, aVar3, this);
                                cVar = this;
                                if (objZ1 == y5bVar2) {
                                    return y5bVar2;
                                }
                                tytVar5 = tytVar4;
                                kstVar5 = kstVar4;
                                y0uVar5 = y0uVar4;
                                z24 = z20;
                                s1g0Var2 = s1g0Var;
                                st3Var6 = st3Var5;
                                z25 = z21;
                                z26 = z23;
                                dVar5 = dVar4;
                                z27 = z19;
                                uf00 uf00Var3 = (uf00) objZ1;
                                boolean z311 = dVar5.a;
                                if (i5 != 0) {
                                    z28 = z22;
                                } else {
                                    z28 = false;
                                }
                                mytVar = new myt(new gtt.b(uf00Var3, s1g0Var2, z311, z28, tytVar5, z27), kstVar5, y0uVar5, z24, z26, z25, st3Var6.c, st3Var6.d);
                                myhVar = myhVar4;
                                r5 = 0;
                                cVar.b = r5;
                                cVar.c = r5;
                                cVar.e = r5;
                                cVar.f = r5;
                                cVar.i = r5;
                                cVar.v = r5;
                                cVar.w = r5;
                                cVar.y = r5;
                                cVar.z = r5;
                                cVar.A = r5;
                                cVar.B = r5;
                                cVar.C = r5;
                                cVar.D = r5;
                                cVar.E = r5;
                                cVar.F = r5;
                                cVar.G = r5;
                                cVar.H = r5;
                                cVar.I = r5;
                                cVar.J = r5;
                                cVar.a = 4;
                                if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                                    return y5bVar2;
                                }
                                return Unit.a;
                            }
                            mytVar = new myt(gtt.a.a, null, 254);
                        }
                        cVar = this;
                        y5bVar2 = y5bVar;
                        r5 = 0;
                        cVar.b = r5;
                        cVar.c = r5;
                        cVar.e = r5;
                        cVar.f = r5;
                        cVar.i = r5;
                        cVar.v = r5;
                        cVar.w = r5;
                        cVar.y = r5;
                        cVar.z = r5;
                        cVar.A = r5;
                        cVar.B = r5;
                        cVar.C = r5;
                        cVar.D = r5;
                        cVar.E = r5;
                        cVar.F = r5;
                        cVar.G = r5;
                        cVar.H = r5;
                        cVar.I = r5;
                        cVar.J = r5;
                        cVar.a = 4;
                        if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                            return y5bVar2;
                        }
                        return Unit.a;
                    }
                    z10 = false;
                    mytVar = new myt(gtt.a.a, null, 254);
                }
                cVar = this;
                y5bVar2 = y5bVar4;
                r5 = z10;
                cVar.b = r5;
                cVar.c = r5;
                cVar.e = r5;
                cVar.f = r5;
                cVar.i = r5;
                cVar.v = r5;
                cVar.w = r5;
                cVar.y = r5;
                cVar.z = r5;
                cVar.A = r5;
                cVar.B = r5;
                cVar.C = r5;
                cVar.D = r5;
                cVar.E = r5;
                cVar.F = r5;
                cVar.G = r5;
                cVar.H = r5;
                cVar.I = r5;
                cVar.J = r5;
                cVar.a = 4;
                if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                    return y5bVar2;
                }
                return Unit.a;
            }
            z = z43;
            i2 = 0;
            if (lk50Var8 instanceof lk50.a) {
                gtt.a aVar7 = gtt.a.a;
                StringUiText stringUiText3 = vch0.a;
                mytVar = new myt(aVar7, new kst.c(new ResourceUiText(R.string.common_functions__error), ((lk50.a) lk50Var8).b, igm.l.a), 252);
                z10 = false;
            } else {
                if (Intrinsics.g(lk50Var8, lk50.b.a)) {
                    if (z45) {
                        uhc.a();
                        return null;
                    }
                    list2 = (List) ((lk50.c) lk50Var8).a;
                    Set<String> setO2 = b3uVar.O1((String) b3uVar.N.a.getValue());
                    if (tytVar instanceof tyt.b) {
                    }
                    dVar = dVar8;
                    kstVar = kstVar9;
                    y5bVar = y5bVar4;
                    jwvVar2 = jwvVar;
                    list3 = list2;
                    st3Var = st3Var9;
                    y0uVar = y0uVar9;
                    z2 = z42;
                    z3 = z;
                    z4 = zBooleanValue;
                    krf0Var = krf0Var;
                    j2 = j;
                    z5 = z44;
                    i3 = i2;
                    tytVar2 = tytVar;
                    ib50Var2 = ib50Var;
                    lk50Var2 = lk50Var;
                    myhVar = myhVar;
                    if (lk50Var2 instanceof lk50.a) {
                        gtt.a aVar8 = gtt.a.a;
                        StringUiText stringUiText4 = vch0.a;
                        mytVar = new myt(aVar8, new kst.c(new ResourceUiText(R.string.common_functions__error), ((lk50.a) lk50Var2).b, igm.l.a), 252);
                    } else {
                        if (!Intrinsics.g(lk50Var2, lk50.b.a)) {
                            if (!(lk50Var2 instanceof lk50.c)) {
                                uhc.a();
                                return null;
                            }
                            if (krf0Var == null) {
                                uag uagVar2 = krf0.I;
                                bVarA = ocx.a(uagVar2, uagVar2);
                                while (true) {
                                    if (!bVarA.hasNext()) {
                                        list6 = list3;
                                        next2 = null;
                                        break;
                                    }
                                    next2 = bVarA.next();
                                    bVar = bVarA;
                                    list6 = list3;
                                    if (((ftt) ((lk50.c) lk50Var2).a).b.getCurrentTier() == ((krf0) next2).a) {
                                        break;
                                        break;
                                    }
                                    bVarA = bVar;
                                    list3 = list6;
                                }
                                krf0Var5 = (krf0) next2;
                                if (krf0Var5 == null) {
                                    krf0Var5 = krf0.TIER_0;
                                }
                                krf0Var2 = krf0Var5;
                            } else {
                                list6 = list3;
                                krf0Var2 = krf0Var;
                            }
                            krf0VarL1 = b3u.L1(((ftt) ((lk50.c) lk50Var2).a).b.getCurrentTier());
                            this.b = null;
                            this.c = null;
                            this.e = myhVar;
                            this.f = dVar;
                            this.i = str;
                            this.v = p34Var;
                            this.w = list;
                            this.y = aVar;
                            this.z = st3Var;
                            this.A = lk50Var2;
                            this.B = ib50Var2;
                            this.C = krf0Var2;
                            this.D = tytVar2;
                            this.E = jwvVar2;
                            this.F = kstVar;
                            this.G = y0uVar;
                            list7 = list6;
                            this.H = list7;
                            jwvVar3 = jwvVar2;
                            this.I = null;
                            this.J = krf0VarL1;
                            st3Var3 = st3Var;
                            this.K = j2;
                            z11 = z4;
                            this.L = z11;
                            z12 = z2;
                            this.M = z12;
                            z13 = z3;
                            this.N = z13;
                            this.O = z5;
                            this.P = i3;
                            this.a = i;
                            it = list7.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z14 = z12;
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                it2 = it;
                                z14 = z12;
                                if (((LoyaltyActivityData) next).getStatus() == 1) {
                                    break;
                                    break;
                                }
                                z12 = z14;
                                it = it2;
                            }
                            loyaltyActivityData = (LoyaltyActivityData) next;
                            if (loyaltyActivityData != null) {
                                objQ1 = b3uVar.Q1(loyaltyActivityData, this);
                                if (objQ1 != y5b.a) {
                                    objQ1 = (String) objQ1;
                                }
                            } else {
                                objQ1 = null;
                            }
                            if (objQ1 == y5bVar) {
                                return y5bVar;
                            }
                            ib50Var3 = ib50Var2;
                            i4 = i3;
                            krf0Var3 = krf0Var2;
                            z15 = z13;
                            y5bVar3 = y5bVar;
                            lk50Var3 = lk50Var2;
                            tytVar3 = tytVar2;
                            y0uVar3 = y0uVar;
                            z16 = z5;
                            myhVar3 = myhVar;
                            kstVar3 = kstVar;
                            list8 = list7;
                            st3Var4 = st3Var3;
                            z17 = z14;
                            str3 = str;
                            b3u.d dVar10 = dVar;
                            krf0Var4 = krf0VarL1;
                            obj = objQ1;
                            z18 = z11;
                            p34Var3 = p34Var;
                            j3 = j2;
                            list9 = list;
                            dVar3 = dVar10;
                            aVar3 = aVar;
                            str4 = (String) obj;
                            if (str4 != null) {
                                cVar2 = new r720.c(str4);
                            } else {
                                cVar2 = r720.b.a;
                            }
                            s1g0Var = new s1g0(krf0Var4, cVar2);
                            ftt fttVar3 = (ftt) ((lk50.c) lk50Var3).a;
                            LoyaltyTierConfig loyaltyTierConfig3 = fttVar3.a;
                            UserTier userTier3 = fttVar3.b;
                            String str10 = dVar3.b;
                            this.b = null;
                            this.c = null;
                            this.e = myhVar3;
                            this.f = dVar3;
                            this.i = null;
                            this.v = null;
                            this.w = null;
                            this.y = null;
                            this.z = st3Var4;
                            this.A = null;
                            this.B = null;
                            this.C = null;
                            this.D = tytVar3;
                            this.E = null;
                            this.F = kstVar3;
                            this.G = y0uVar3;
                            this.H = null;
                            this.I = null;
                            this.J = s1g0Var;
                            this.K = j3;
                            this.L = z18;
                            this.M = z17;
                            this.N = z15;
                            this.O = z16;
                            int i14 = i4;
                            this.P = i14;
                            z19 = z18;
                            this.a = 3;
                            List list17 = list9;
                            dVar4 = dVar3;
                            y0uVar4 = y0uVar3;
                            kstVar4 = kstVar3;
                            myhVar4 = myhVar3;
                            y5bVar2 = y5bVar3;
                            krf0 krf0Var11 = krf0Var3;
                            i5 = i14;
                            z20 = z17;
                            List list18 = list8;
                            z21 = z16;
                            tytVar4 = tytVar3;
                            long j8 = j3;
                            String str11 = str3;
                            p34 p34Var7 = p34Var3;
                            z22 = true;
                            st3Var5 = st3Var4;
                            ib50 ib50Var8 = ib50Var3;
                            z23 = z15;
                            objZ1 = b3uVar.z1(loyaltyTierConfig3, userTier3, krf0Var11, list18, tytVar4, ib50Var8, jwvVar3, str10, str11, p34Var7, list17, j8, aVar3, this);
                            cVar = this;
                            if (objZ1 == y5bVar2) {
                                return y5bVar2;
                            }
                            tytVar5 = tytVar4;
                            kstVar5 = kstVar4;
                            y0uVar5 = y0uVar4;
                            z24 = z20;
                            s1g0Var2 = s1g0Var;
                            st3Var6 = st3Var5;
                            z25 = z21;
                            z26 = z23;
                            dVar5 = dVar4;
                            z27 = z19;
                            uf00 uf00Var4 = (uf00) objZ1;
                            boolean z312 = dVar5.a;
                            if (i5 != 0) {
                                z28 = z22;
                            } else {
                                z28 = false;
                            }
                            mytVar = new myt(new gtt.b(uf00Var4, s1g0Var2, z312, z28, tytVar5, z27), kstVar5, y0uVar5, z24, z26, z25, st3Var6.c, st3Var6.d);
                            myhVar = myhVar4;
                            r5 = 0;
                            cVar.b = r5;
                            cVar.c = r5;
                            cVar.e = r5;
                            cVar.f = r5;
                            cVar.i = r5;
                            cVar.v = r5;
                            cVar.w = r5;
                            cVar.y = r5;
                            cVar.z = r5;
                            cVar.A = r5;
                            cVar.B = r5;
                            cVar.C = r5;
                            cVar.D = r5;
                            cVar.E = r5;
                            cVar.F = r5;
                            cVar.G = r5;
                            cVar.H = r5;
                            cVar.I = r5;
                            cVar.J = r5;
                            cVar.a = 4;
                            if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                                return y5bVar2;
                            }
                            return Unit.a;
                        }
                        mytVar = new myt(gtt.a.a, null, 254);
                    }
                    cVar = this;
                    y5bVar2 = y5bVar;
                    r5 = 0;
                    cVar.b = r5;
                    cVar.c = r5;
                    cVar.e = r5;
                    cVar.f = r5;
                    cVar.i = r5;
                    cVar.v = r5;
                    cVar.w = r5;
                    cVar.y = r5;
                    cVar.z = r5;
                    cVar.A = r5;
                    cVar.B = r5;
                    cVar.C = r5;
                    cVar.D = r5;
                    cVar.E = r5;
                    cVar.F = r5;
                    cVar.G = r5;
                    cVar.H = r5;
                    cVar.I = r5;
                    cVar.J = r5;
                    cVar.a = 4;
                    if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                        return y5bVar2;
                    }
                    return Unit.a;
                }
                z10 = false;
                mytVar = new myt(gtt.a.a, null, 254);
            }
            cVar = this;
            y5bVar2 = y5bVar4;
            r5 = z10;
            cVar.b = r5;
            cVar.c = r5;
            cVar.e = r5;
            cVar.f = r5;
            cVar.i = r5;
            cVar.v = r5;
            cVar.w = r5;
            cVar.y = r5;
            cVar.z = r5;
            cVar.A = r5;
            cVar.B = r5;
            cVar.C = r5;
            cVar.D = r5;
            cVar.E = r5;
            cVar.F = r5;
            cVar.G = r5;
            cVar.H = r5;
            cVar.I = r5;
            cVar.J = r5;
            cVar.a = 4;
            if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                return y5bVar2;
            }
            return Unit.a;
            String str12 = (String) objF1;
            if (str12 != null && !set.contains(str12)) {
                ej5.c(o8i0.d(b3uVar), null, null, new k4u(set, wi80.b(str12), b3uVar, null), 3);
            }
            List list19 = list5;
            y5bVar = y5bVar4;
            jwvVar2 = jwvVar;
            list3 = list19;
            z3 = z7;
            z2 = z8;
            st3Var = st3Var2;
            aVar = aVar2;
            list = list4;
            p34Var = p34Var2;
            ib50Var2 = ib50Var;
            z4 = z9;
            j2 = j;
            i3 = i2;
            z5 = z6;
            y0uVar = y0uVar2;
            kstVar = kstVar2;
            str = str2;
            dVar = dVar2;
            tytVar2 = tytVar;
            lk50Var2 = lk50Var;
            myhVar = myhVar2;
            if (lk50Var2 instanceof lk50.a) {
                gtt.a aVar9 = gtt.a.a;
                StringUiText stringUiText5 = vch0.a;
                mytVar = new myt(aVar9, new kst.c(new ResourceUiText(R.string.common_functions__error), ((lk50.a) lk50Var2).b, igm.l.a), 252);
            } else {
                if (!Intrinsics.g(lk50Var2, lk50.b.a)) {
                    if (!(lk50Var2 instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    if (krf0Var == null) {
                        uag uagVar3 = krf0.I;
                        bVarA = ocx.a(uagVar3, uagVar3);
                        while (true) {
                            if (!bVarA.hasNext()) {
                                list6 = list3;
                                next2 = null;
                                break;
                            }
                            next2 = bVarA.next();
                            bVar = bVarA;
                            list6 = list3;
                            if (((ftt) ((lk50.c) lk50Var2).a).b.getCurrentTier() == ((krf0) next2).a) {
                                break;
                                break;
                            }
                            bVarA = bVar;
                            list3 = list6;
                        }
                        krf0Var5 = (krf0) next2;
                        if (krf0Var5 == null) {
                            krf0Var5 = krf0.TIER_0;
                        }
                        krf0Var2 = krf0Var5;
                    } else {
                        list6 = list3;
                        krf0Var2 = krf0Var;
                    }
                    krf0VarL1 = b3u.L1(((ftt) ((lk50.c) lk50Var2).a).b.getCurrentTier());
                    this.b = null;
                    this.c = null;
                    this.e = myhVar;
                    this.f = dVar;
                    this.i = str;
                    this.v = p34Var;
                    this.w = list;
                    this.y = aVar;
                    this.z = st3Var;
                    this.A = lk50Var2;
                    this.B = ib50Var2;
                    this.C = krf0Var2;
                    this.D = tytVar2;
                    this.E = jwvVar2;
                    this.F = kstVar;
                    this.G = y0uVar;
                    list7 = list6;
                    this.H = list7;
                    jwvVar3 = jwvVar2;
                    this.I = null;
                    this.J = krf0VarL1;
                    st3Var3 = st3Var;
                    this.K = j2;
                    z11 = z4;
                    this.L = z11;
                    z12 = z2;
                    this.M = z12;
                    z13 = z3;
                    this.N = z13;
                    this.O = z5;
                    this.P = i3;
                    this.a = i;
                    it = list7.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z14 = z12;
                            next = null;
                            break;
                        }
                        next = it.next();
                        it2 = it;
                        z14 = z12;
                        if (((LoyaltyActivityData) next).getStatus() == 1) {
                            break;
                            break;
                        }
                        z12 = z14;
                        it = it2;
                    }
                    loyaltyActivityData = (LoyaltyActivityData) next;
                    if (loyaltyActivityData != null) {
                        objQ1 = b3uVar.Q1(loyaltyActivityData, this);
                        if (objQ1 != y5b.a) {
                            objQ1 = (String) objQ1;
                        }
                    } else {
                        objQ1 = null;
                    }
                    if (objQ1 == y5bVar) {
                        return y5bVar;
                    }
                    ib50Var3 = ib50Var2;
                    i4 = i3;
                    krf0Var3 = krf0Var2;
                    z15 = z13;
                    y5bVar3 = y5bVar;
                    lk50Var3 = lk50Var2;
                    tytVar3 = tytVar2;
                    y0uVar3 = y0uVar;
                    z16 = z5;
                    myhVar3 = myhVar;
                    kstVar3 = kstVar;
                    list8 = list7;
                    st3Var4 = st3Var3;
                    z17 = z14;
                    str3 = str;
                    b3u.d dVar11 = dVar;
                    krf0Var4 = krf0VarL1;
                    obj = objQ1;
                    z18 = z11;
                    p34Var3 = p34Var;
                    j3 = j2;
                    list9 = list;
                    dVar3 = dVar11;
                    aVar3 = aVar;
                    str4 = (String) obj;
                    if (str4 != null) {
                        cVar2 = new r720.c(str4);
                    } else {
                        cVar2 = r720.b.a;
                    }
                    s1g0Var = new s1g0(krf0Var4, cVar2);
                    ftt fttVar4 = (ftt) ((lk50.c) lk50Var3).a;
                    LoyaltyTierConfig loyaltyTierConfig4 = fttVar4.a;
                    UserTier userTier4 = fttVar4.b;
                    String str13 = dVar3.b;
                    this.b = null;
                    this.c = null;
                    this.e = myhVar3;
                    this.f = dVar3;
                    this.i = null;
                    this.v = null;
                    this.w = null;
                    this.y = null;
                    this.z = st3Var4;
                    this.A = null;
                    this.B = null;
                    this.C = null;
                    this.D = tytVar3;
                    this.E = null;
                    this.F = kstVar3;
                    this.G = y0uVar3;
                    this.H = null;
                    this.I = null;
                    this.J = s1g0Var;
                    this.K = j3;
                    this.L = z18;
                    this.M = z17;
                    this.N = z15;
                    this.O = z16;
                    int i15 = i4;
                    this.P = i15;
                    z19 = z18;
                    this.a = 3;
                    List list110 = list9;
                    dVar4 = dVar3;
                    y0uVar4 = y0uVar3;
                    kstVar4 = kstVar3;
                    myhVar4 = myhVar3;
                    y5bVar2 = y5bVar3;
                    krf0 krf0Var12 = krf0Var3;
                    i5 = i15;
                    z20 = z17;
                    List list111 = list8;
                    z21 = z16;
                    tytVar4 = tytVar3;
                    long j9 = j3;
                    String str14 = str3;
                    p34 p34Var8 = p34Var3;
                    z22 = true;
                    st3Var5 = st3Var4;
                    ib50 ib50Var9 = ib50Var3;
                    z23 = z15;
                    objZ1 = b3uVar.z1(loyaltyTierConfig4, userTier4, krf0Var12, list111, tytVar4, ib50Var9, jwvVar3, str13, str14, p34Var8, list110, j9, aVar3, this);
                    cVar = this;
                    if (objZ1 == y5bVar2) {
                        return y5bVar2;
                    }
                    tytVar5 = tytVar4;
                    kstVar5 = kstVar4;
                    y0uVar5 = y0uVar4;
                    z24 = z20;
                    s1g0Var2 = s1g0Var;
                    st3Var6 = st3Var5;
                    z25 = z21;
                    z26 = z23;
                    dVar5 = dVar4;
                    z27 = z19;
                    uf00 uf00Var5 = (uf00) objZ1;
                    boolean z313 = dVar5.a;
                    if (i5 != 0) {
                        z28 = z22;
                    } else {
                        z28 = false;
                    }
                    mytVar = new myt(new gtt.b(uf00Var5, s1g0Var2, z313, z28, tytVar5, z27), kstVar5, y0uVar5, z24, z26, z25, st3Var6.c, st3Var6.d);
                    myhVar = myhVar4;
                    r5 = 0;
                    cVar.b = r5;
                    cVar.c = r5;
                    cVar.e = r5;
                    cVar.f = r5;
                    cVar.i = r5;
                    cVar.v = r5;
                    cVar.w = r5;
                    cVar.y = r5;
                    cVar.z = r5;
                    cVar.A = r5;
                    cVar.B = r5;
                    cVar.C = r5;
                    cVar.D = r5;
                    cVar.E = r5;
                    cVar.F = r5;
                    cVar.G = r5;
                    cVar.H = r5;
                    cVar.I = r5;
                    cVar.J = r5;
                    cVar.a = 4;
                    if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                        return y5bVar2;
                    }
                    return Unit.a;
                }
                mytVar = new myt(gtt.a.a, null, 254);
            }
            cVar = this;
            y5bVar2 = y5bVar;
            r5 = 0;
            cVar.b = r5;
            cVar.c = r5;
            cVar.e = r5;
            cVar.f = r5;
            cVar.i = r5;
            cVar.v = r5;
            cVar.w = r5;
            cVar.y = r5;
            cVar.z = r5;
            cVar.A = r5;
            cVar.B = r5;
            cVar.C = r5;
            cVar.D = r5;
            cVar.E = r5;
            cVar.F = r5;
            cVar.G = r5;
            cVar.H = r5;
            cVar.I = r5;
            cVar.J = r5;
            cVar.a = 4;
            if (myhVar.emit(mytVar, cVar) == y5bVar2) {
                return y5bVar2;
            }
            return Unit.a;
        }
    }

    public b4u(lyh[] lyhVarArr, b3u b3uVar) {
        this.a = lyhVarArr;
        this.b = b3uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super myt> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
