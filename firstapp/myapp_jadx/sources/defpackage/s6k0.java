package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigFeatureFlag;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sporty.android.core.model.worldcuptournament.WorldCupTournamentPageGroup;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final class s6k0 {
    public final lq1 a;
    public final yi5 b;

    public s6k0(lq1 lq1Var, yi5 yi5Var) {
        lq1Var.getClass();
        yi5Var.getClass();
        this.a = lq1Var;
        this.b = yi5Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        p6k0 p6k0Var;
        BOConfigParam bOConfigParam;
        BOConfigFeatureFlag bOConfigFeatureFlag;
        BOConfigFeatureFlag.AndroidRule android2;
        xdp data;
        Object bVar;
        if (x1bVar instanceof p6k0) {
            p6k0Var = (p6k0) x1bVar;
            int i = p6k0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6k0Var.d = i - Integer.MIN_VALUE;
            } else {
                p6k0Var = new p6k0(this, x1bVar);
            }
        } else {
            p6k0Var = new p6k0(this, x1bVar);
        }
        Object obj = p6k0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = p6k0Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.WorldCupTournamentPageConfig;
            p6k0Var.a = bOConfigParam2;
            p6k0Var.d = 1;
            Object objJ = qq1.j(this.a, p6k0Var);
            if (objJ == y5bVar) {
                return y5bVar;
            }
            obj = objJ;
            bOConfigParam = bOConfigParam2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bOConfigParam = p6k0Var.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle == null) {
            return null;
        }
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
                bOConfigFeatureFlag = null;
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                bOConfigFeatureFlag = null;
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
            } else {
                if (configValue instanceof String) {
                    b.i((String) configValue);
                }
                bOConfigFeatureFlag = null;
            }
        } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (configValue instanceof Double) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
            } else {
                if (configValue instanceof String) {
                    b.h((String) configValue);
                }
                bOConfigFeatureFlag = null;
            }
        } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
            if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
            }
            bOConfigFeatureFlag = null;
        } else if (configValue instanceof Boolean) {
            if (!(configValue instanceof BOConfigFeatureFlag)) {
                configValue = null;
            }
            bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
        } else {
            if (configValue instanceof String) {
                StringsKt.r0((String) configValue);
            }
            bOConfigFeatureFlag = null;
        }
        if (bOConfigFeatureFlag == null || (android2 = bOConfigFeatureFlag.getAndroid()) == null || (data = android2.getData()) == null) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = new eal().b(data, WorldCupTournamentConfig.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            return null;
        }
        return bVar;
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
    public final Object b(x1b x1bVar) {
        q6k0 q6k0Var;
        BOConfigParam bOConfigParam;
        Object[] objArr;
        if (x1bVar instanceof q6k0) {
            q6k0Var = (q6k0) x1bVar;
            int i = q6k0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6k0Var.e = i - Integer.MIN_VALUE;
            } else {
                q6k0Var = new q6k0(this, x1bVar);
            }
        } else {
            q6k0Var = new q6k0(this, x1bVar);
        }
        Object obj = q6k0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = q6k0Var.e;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.WorldCupTournamentPageGroups;
            WorldCupTournamentPageGroup[] worldCupTournamentPageGroupArr = new WorldCupTournamentPageGroup[0];
            q6k0Var.a = bOConfigParam2;
            q6k0Var.b = worldCupTournamentPageGroupArr;
            q6k0Var.e = 1;
            Object objJ = qq1.j(this.a, q6k0Var);
            if (objJ == y5bVar) {
                return y5bVar;
            }
            bOConfigParam = bOConfigParam2;
            obj = objJ;
            objArr = worldCupTournamentPageGroupArr;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            WorldCupTournamentPageGroup[] worldCupTournamentPageGroupArr2 = q6k0Var.b;
            bOConfigParam = q6k0Var.a;
            uj50.b(obj);
            objArr = worldCupTournamentPageGroupArr2;
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(WorldCupTournamentPageGroup[].class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                } else if ((configValue instanceof String) && (configValue = StringsKt.toIntOrNull((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                } else if ((configValue instanceof String) && (configValue = StringsKt.s0((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                } else if ((configValue instanceof String) && (configValue = b.i((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                } else if ((configValue instanceof String) && (configValue = b.h((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                } else if ((configValue instanceof String) && (configValue = StringsKt.r0((String) configValue)) != null) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null && (configValue = configValue.toString()) != null) {
                    if (configValue instanceof WorldCupTournamentPageGroup[]) {
                        obj2 = configValue;
                    }
                    obj2 = (WorldCupTournamentPageGroup[]) obj2;
                }
            } else if (configValue != null) {
                if (configValue instanceof WorldCupTournamentPageGroup[]) {
                    obj2 = configValue;
                }
                obj2 = (WorldCupTournamentPageGroup[]) obj2;
            }
            if (obj2 != null) {
                objArr = obj2;
            }
        }
        return ay0.S(objArr);
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
    public final Object c(x1b x1bVar) {
        r6k0 r6k0Var;
        BOConfigParam bOConfigParam;
        Object[] objArr;
        if (x1bVar instanceof r6k0) {
            r6k0Var = (r6k0) x1bVar;
            int i = r6k0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6k0Var.e = i - Integer.MIN_VALUE;
            } else {
                r6k0Var = new r6k0(this, x1bVar);
            }
        } else {
            r6k0Var = new r6k0(this, x1bVar);
        }
        Object obj = r6k0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = r6k0Var.e;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            BOConfigParam bOConfigParam2 = BOConfigParam.WorldCupTournamentPageTeams;
            WorldCupTeam[] worldCupTeamArr = new WorldCupTeam[0];
            r6k0Var.a = bOConfigParam2;
            r6k0Var.b = worldCupTeamArr;
            r6k0Var.e = 1;
            Object objJ = qq1.j(this.a, r6k0Var);
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
            WorldCupTeam[] worldCupTeamArr2 = r6k0Var.b;
            bOConfigParam = r6k0Var.a;
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
