package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigFeatureFlag;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchResultsDto;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchSuggestions;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchTrending;
import com.sportybet.plugin.realsports.searchv2.data.model.SearchTrendingResult;
import com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class lx70 {
    public final st70 a;
    public final lfb0 b;
    public final lq1 c;
    public final ci40 d;
    public SearchFeatureConfig e;

    public lx70(st70 st70Var, lfb0 lfb0Var, lq1 lq1Var, ci40 ci40Var) {
        st70Var.getClass();
        lfb0Var.getClass();
        lq1Var.getClass();
        this.a = st70Var;
        this.b = lfb0Var;
        this.c = lq1Var;
        this.d = ci40Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0150  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x0126  */
    public final Object a(x1b x1bVar) {
        hx70 hx70Var;
        BOConfigParam bOConfigParam;
        BOConfigFeatureFlag bOConfigFeatureFlag;
        BOConfigFeatureFlag.AndroidRule android2;
        xdp data;
        Object bVar;
        if (x1bVar instanceof hx70) {
            hx70Var = (hx70) x1bVar;
            int i = hx70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx70Var.d = i - Integer.MIN_VALUE;
            } else {
                hx70Var = new hx70(this, x1bVar);
            }
        } else {
            hx70Var = new hx70(this, x1bVar);
        }
        Object obj = hx70Var.b;
        y5b y5bVar = y5b.a;
        int i2 = hx70Var.d;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            SearchFeatureConfig searchFeatureConfig = this.e;
            if (searchFeatureConfig != null) {
                return searchFeatureConfig;
            }
            BOConfigParam bOConfigParam2 = BOConfigParam.NewSearchScreen;
            hx70Var.a = bOConfigParam2;
            hx70Var.d = 1;
            Object objJ = qq1.j(this.c, hx70Var);
            if (objJ == y5bVar) {
                return y5bVar;
            }
            bOConfigParam = bOConfigParam2;
            obj = objJ;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bOConfigParam = hx70Var.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null && (android2 = bOConfigFeatureFlag.getAndroid()) != null && (data = android2.getData()) != null) {
                        try {
                            zi50.a aVar = zi50.b;
                            bVar = new eal().b(data, SearchFeatureConfig.class);
                        } catch (Throwable th) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th);
                        }
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar3 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar4 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar5 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar6 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar7 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (!(configValue instanceof BOConfigFeatureFlag)) {
                        configValue = null;
                    }
                    bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar8 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                } else {
                    if (configValue instanceof String) {
                        b.h((String) configValue);
                    }
                    bOConfigFeatureFlag = null;
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar9 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                }
            } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (!dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        if (!(configValue instanceof BOConfigFeatureFlag)) {
                            configValue = null;
                        }
                        bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                    }
                    if (bOConfigFeatureFlag != null) {
                        zi50.a aVar10 = zi50.b;
                        bVar = new eal().b(data, SearchFeatureConfig.class);
                        if (!(bVar instanceof zi50.b)) {
                            obj2 = bVar;
                        }
                    }
                } else if (configValue != null) {
                    configValue.toString();
                }
                bOConfigFeatureFlag = null;
                if (bOConfigFeatureFlag != null) {
                    zi50.a aVar11 = zi50.b;
                    bVar = new eal().b(data, SearchFeatureConfig.class);
                    if (!(bVar instanceof zi50.b)) {
                        obj2 = bVar;
                    }
                }
            } else if (configValue instanceof Boolean) {
                if (!(configValue instanceof BOConfigFeatureFlag)) {
                    configValue = null;
                }
                bOConfigFeatureFlag = (BOConfigFeatureFlag) configValue;
                if (bOConfigFeatureFlag != null) {
                    zi50.a aVar12 = zi50.b;
                    bVar = new eal().b(data, SearchFeatureConfig.class);
                    if (!(bVar instanceof zi50.b)) {
                        obj2 = bVar;
                    }
                }
            } else {
                if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
                bOConfigFeatureFlag = null;
                if (bOConfigFeatureFlag != null) {
                    zi50.a aVar13 = zi50.b;
                    bVar = new eal().b(data, SearchFeatureConfig.class);
                    if (!(bVar instanceof zi50.b)) {
                        obj2 = bVar;
                    }
                }
            }
        }
        SearchFeatureConfig searchFeatureConfig2 = (SearchFeatureConfig) obj2;
        if (searchFeatureConfig2 == null) {
            return new SearchFeatureConfig(0, 0, 0, false, false, false, false, false, false, 511, null);
        }
        this.e = searchFeatureConfig2;
        return searchFeatureConfig2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, x1b x1bVar) {
        ix70 ix70Var;
        Object obj;
        SearchFeatureConfig searchFeatureConfig;
        if (x1bVar instanceof ix70) {
            ix70Var = (ix70) x1bVar;
            int i = ix70Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix70Var.e = i - Integer.MIN_VALUE;
            } else {
                ix70Var = new ix70(this, x1bVar);
            }
        } else {
            ix70Var = new ix70(this, x1bVar);
        }
        Object objA = ix70Var.c;
        Object obj2 = y5b.a;
        int i2 = ix70Var.e;
        if (i2 == 0) {
            uj50.b(objA);
            ix70Var.a = str;
            ix70Var.e = 1;
            objA = a(ix70Var);
            if (objA != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            str = ix70Var.a;
            uj50.b(objA);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            searchFeatureConfig = ix70Var.b;
            uj50.b(objA);
            obj = ((zi50) objA).a;
        }
        zi50.a aVar = zi50.b;
        if (obj instanceof zi50.b) {
            return obj;
        }
        try {
            return rx70.a((SearchResultsDto) obj, this.b, searchFeatureConfig);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
        SearchFeatureConfig searchFeatureConfig2 = (SearchFeatureConfig) objA;
        ix70Var.a = null;
        ix70Var.b = searchFeatureConfig2;
        ix70Var.e = 2;
        Object objA2 = this.a.a(str, ix70Var);
        if (objA2 != obj2) {
            obj = objA2;
            searchFeatureConfig = searchFeatureConfig2;
            zi50.a aVar3 = zi50.b;
            if (obj instanceof zi50.b) {
                return rx70.a((SearchResultsDto) obj, this.b, searchFeatureConfig);
            }
            return obj;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        jx70 jx70Var;
        Object objB;
        if (x1bVar instanceof jx70) {
            jx70Var = (jx70) x1bVar;
            int i = jx70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx70Var.c = i - Integer.MIN_VALUE;
            } else {
                jx70Var = new jx70(this, x1bVar);
            }
        } else {
            jx70Var = new jx70(this, x1bVar);
        }
        Object obj = jx70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = jx70Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            jx70Var.c = 1;
            objB = this.a.b(jx70Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objB instanceof zi50.b) {
            return objB;
        }
        try {
            return ((SearchSuggestions) objB).getItems();
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(x1b x1bVar) {
        kx70 kx70Var;
        Object objC;
        if (x1bVar instanceof kx70) {
            kx70Var = (kx70) x1bVar;
            int i = kx70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kx70Var.c = i - Integer.MIN_VALUE;
            } else {
                kx70Var = new kx70(this, x1bVar);
            }
        } else {
            kx70Var = new kx70(this, x1bVar);
        }
        Object obj = kx70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = kx70Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            kx70Var.c = 1;
            objC = this.a.c(kx70Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objC = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objC instanceof zi50.b) {
            return objC;
        }
        try {
            List<SearchTrendingResult> results = ((SearchTrending) objC).getResults();
            ArrayList arrayList = new ArrayList(l48.r(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(((SearchTrendingResult) it.next()).getKeyword());
            }
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }
}
