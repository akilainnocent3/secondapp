package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class e4k0 implements d4k0 {
    public static final /* synthetic */ int g = 0;
    public final lq1 a;
    public final psm b;
    public final t6k0 c;
    public final v5b d;
    public final wwd0 e;
    public final v340 f;

    @c0d(c = "com.sportybet.feature.worldcup.config.data.repository.WorldCupSelectedTeamRepositoryImpl$1", f = "WorldCupSelectedTeamRepositoryImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return e4k0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                e4k0 e4k0Var = e4k0.this;
                wwd0 wwd0Var2 = e4k0Var.e;
                this.a = wwd0Var2;
                this.b = 1;
                obj = e4k0Var.c(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    static {
        ohp<Object>[] ohpVarArr = t6k0.c;
    }

    public e4k0(lq1 lq1Var, psm psmVar, t6k0 t6k0Var, @ApplicationScope v5b v5bVar) {
        lq1Var.getClass();
        psmVar.getClass();
        v5bVar.getClass();
        this.a = lq1Var;
        this.b = psmVar;
        this.c = t6k0Var;
        this.d = v5bVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        ej5.c(v5bVar, null, null, new a(null), 3);
    }

    @Override // defpackage.d4k0
    public final v340 a() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r8.g(r0, r2) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r8.a(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        return r1;
     */
    @Override // defpackage.d4k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.sporty.android.core.model.worldcuptournament.WorldCupTeam r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.h4k0
            if (r0 == 0) goto L13
            r0 = r8
            h4k0 r0 = (defpackage.h4k0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            h4k0 r0 = new h4k0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 == r4) goto L2e
            if (r2 != r3) goto L27
            goto L2e
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L2e:
            com.sporty.android.core.model.worldcuptournament.WorldCupTeam r7 = r0.a
            defpackage.uj50.b(r8)
            goto L68
        L34:
            defpackage.uj50.b(r8)
            t6k0 r8 = r6.c
            rkd r2 = r8.b
            r5 = 0
            if (r7 == 0) goto L55
            ohp<java.lang.Object>[] r3 = defpackage.t6k0.c
            r3 = r3[r5]
            wm20 r8 = r2.a(r8, r3)
            java.lang.String r2 = r7.getId()
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.g(r0, r2)
            if (r8 != r1) goto L68
            goto L67
        L55:
            ohp<java.lang.Object>[] r4 = defpackage.t6k0.c
            r4 = r4[r5]
            wm20 r8 = r2.a(r8, r4)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            wwd0 r6 = r6.e
            r6.setValue(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e4k0.b(com.sporty.android.core.model.worldcuptournament.WorldCupTeam, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:1: B:41:0x00a7->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        f4k0 f4k0Var;
        ArrayList arrayList;
        String str;
        int size;
        Object obj;
        int size2;
        int i;
        Object obj2;
        WorldCupTeam worldCupTeam;
        if (x1bVar instanceof f4k0) {
            f4k0Var = (f4k0) x1bVar;
            int i2 = f4k0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f4k0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                f4k0Var = new f4k0(this, x1bVar);
            }
        } else {
            f4k0Var = new f4k0(this, x1bVar);
        }
        Object objD = f4k0Var.b;
        Object obj3 = y5b.a;
        int i3 = f4k0Var.d;
        int i4 = 0;
        Object obj4 = null;
        if (i3 == 0) {
            uj50.b(objD);
            f4k0Var.d = 1;
            objD = d(f4k0Var);
            if (objD != obj3) {
            }
            return obj3;
        }
        if (i3 == 1) {
            uj50.b(objD);
        } else {
            if (i3 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = f4k0Var.a;
            uj50.b(objD);
        }
        str = (String) objD;
        if (str != null) {
            size2 = arrayList.size();
            i = 0;
            do {
                if (i < size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i);
                i++;
            } while (!Intrinsics.g(((WorldCupTeam) obj2).getId(), str));
            worldCupTeam = (WorldCupTeam) obj2;
            if (worldCupTeam != null) {
                return worldCupTeam;
            }
        }
        size = arrayList.size();
        while (i4 < size) {
            obj = arrayList.get(i4);
            i4++;
            if (c.l(((WorldCupTeam) obj).getCountryCode(), this.b.getCountryCode().getCode(), true)) {
                obj4 = obj;
                break;
            }
        }
        return (WorldCupTeam) obj4;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : (Iterable) objD) {
            if (!((WorldCupTeam) obj5).isTeamEliminated()) {
                arrayList2.add(obj5);
            }
        }
        t6k0 t6k0Var = this.c;
        wm20 wm20VarA = t6k0Var.b.a(t6k0Var, t6k0.c[0]);
        f4k0Var.a = arrayList2;
        f4k0Var.d = 2;
        objD = wm20VarA.f(f4k0Var);
        if (objD != obj3) {
            arrayList = arrayList2;
            str = (String) objD;
            if (str != null) {
                size2 = arrayList.size();
                i = 0;
                do {
                    if (i < size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i);
                    i++;
                } while (!Intrinsics.g(((WorldCupTeam) obj2).getId(), str));
                worldCupTeam = (WorldCupTeam) obj2;
                if (worldCupTeam != null) {
                    return worldCupTeam;
                }
            }
            size = arrayList.size();
            while (i4 < size) {
                obj = arrayList.get(i4);
                i4++;
                if (c.l(((WorldCupTeam) obj).getCountryCode(), this.b.getCountryCode().getCode(), true)) {
                    obj4 = obj;
                    break;
                }
            }
            return (WorldCupTeam) obj4;
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[PHI: r6
      0x0077: PHI (r6v18 java.lang.Object) = 
      (r6v8 java.lang.Object)
      (r6v9 java.lang.Object)
      (r6v11 java.lang.Object)
      (r6v8 java.lang.Object)
      (r6v13 java.lang.Object)
      (r6v8 java.lang.Object)
      (r6v15 java.lang.Object)
      (r6v8 java.lang.Object)
      (r6v17 java.lang.Object)
      (r6v8 java.lang.Object)
      (r6v20 java.lang.Object)
      (r6v8 java.lang.Object)
     binds: [B:106:0x0146, B:102:0x013e, B:94:0x0124, B:87:0x0112, B:80:0x00fc, B:73:0x00eb, B:66:0x00d6, B:59:0x00c5, B:52:0x00b0, B:45:0x009f, B:38:0x008a, B:29:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(x1b x1bVar) {
        g4k0 g4k0Var;
        BOConfigParam bOConfigParam;
        Object[] objArr;
        if (x1bVar instanceof g4k0) {
            g4k0Var = (g4k0) x1bVar;
            int i = g4k0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                g4k0Var.e = i - Integer.MIN_VALUE;
            } else {
                g4k0Var = new g4k0(this, x1bVar);
            }
        } else {
            g4k0Var = new g4k0(this, x1bVar);
        }
        Object obj = g4k0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = g4k0Var.e;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.WorldCupTournamentPageTeams;
            WorldCupTeam[] worldCupTeamArr = new WorldCupTeam[0];
            g4k0Var.a = bOConfigParam2;
            g4k0Var.b = worldCupTeamArr;
            g4k0Var.e = 1;
            Object objJ = qq1.j(this.a, g4k0Var);
            if (objJ == y5bVar) {
                return y5bVar;
            }
            bOConfigParam = bOConfigParam2;
            obj = objJ;
            objArr = worldCupTeamArr;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WorldCupTeam[] worldCupTeamArr2 = g4k0Var.b;
            bOConfigParam = g4k0Var.a;
            uj50.b(obj);
            objArr = worldCupTeamArr2;
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(WorldCupTeam[].class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                } else if ((configValue instanceof String) && (configValue = StringsKt.toIntOrNull((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                } else if ((configValue instanceof String) && (configValue = StringsKt.s0((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                } else if ((configValue instanceof String) && (configValue = b.i((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                } else if ((configValue instanceof String) && (configValue = b.h((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                } else if ((configValue instanceof String) && (configValue = StringsKt.r0((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null && (configValue = configValue.toString()) != null) {
                    if (configValue instanceof WorldCupTeam[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTeam[]) obj2;
                }
            } else if (configValue != null) {
                if (configValue instanceof WorldCupTeam[]) {
                    obj2 = configValue;
                }
                obj2 = (WorldCupTeam[]) obj2;
            }
            if (obj2 != null) {
                objArr = obj2;
            }
        }
        return ay0.S(objArr);
    }
}
