package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dateofbirth.DobVerificationStatus;
import com.sporty.android.core.model.loyalty.DobRewardType;
import com.sporty.android.core.model.loyalty.TierDobConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class t5k {
    public final sve a;
    public final lq1 b;
    public final mgb0 c;
    public mst d;

    public t5k(sve sveVar, lq1 lq1Var, mgb0 mgb0Var) {
        sveVar.getClass();
        lq1Var.getClass();
        mgb0Var.getClass();
        this.a = sveVar;
        this.b = lq1Var;
        this.c = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(x1b x1bVar) {
        q5k q5kVar;
        if (x1bVar instanceof q5k) {
            q5kVar = (q5k) x1bVar;
            int i = q5kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5kVar.d = i - Integer.MIN_VALUE;
            } else {
                q5kVar = new q5k(this, x1bVar);
            }
        } else {
            q5kVar = new q5k(this, x1bVar);
        }
        Object objB = q5kVar.b;
        y5b y5bVar = y5b.a;
        int i2 = q5kVar.d;
        if (i2 == 0) {
            uj50.b(objB);
            mst mstVar = this.d;
            if (mstVar != null) {
                return mstVar;
            }
            q5kVar.a = this;
            q5kVar.d = 1;
            objB = b(q5kVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = q5kVar.a;
            uj50.b(objB);
        }
        lk50 lk50Var = (lk50) objB;
        if (!(lk50Var instanceof lk50.c)) {
            return null;
        }
        mst mstVar2 = (mst) ((lk50.c) lk50Var).a;
        this.d = mstVar2;
        return mstVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        r5k r5kVar;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof r5k) {
            r5kVar = (r5k) x1bVar;
            int i = r5kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r5kVar.d = i - Integer.MIN_VALUE;
            } else {
                r5kVar = new r5k(this, x1bVar);
            }
        } else {
            r5kVar = new r5k(this, x1bVar);
        }
        Object obj = r5kVar.b;
        y5b y5bVar = y5b.a;
        int i2 = r5kVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                sve sveVar = this.a;
                r5kVar.a = resourceUiText;
                r5kVar.d = 1;
                Object objD = sveVar.d(r5kVar);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
                obj = objD;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = r5kVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        DobVerificationStatus dobVerificationStatus = (DobVerificationStatus) obj;
        boolean zA = qq1.a(this.b, BOConfigParam.DisplayNewForDobBenefitCard, false);
        AccountInfo accountInfoLastAccountInfo = this.c.lastAccountInfo();
        bVar = new mst(dobVerificationStatus.getMinQualifiedTier(), dobVerificationStatus.isVerified(), zA, accountInfoLastAccountInfo != null ? accountInfoLastAccountInfo.getNinDobVerificationEnabled() : false);
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(krf0 krf0Var, TierDobConfig tierDobConfig, TierDobConfig tierDobConfig2, x1b x1bVar) {
        s5k s5kVar;
        que queVar;
        StringUiText stringUiTextA;
        Object next;
        if (x1bVar instanceof s5k) {
            s5kVar = (s5k) x1bVar;
            int i = s5kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                s5kVar.f = i - Integer.MIN_VALUE;
            } else {
                s5kVar = new s5k(this, x1bVar);
            }
        } else {
            s5kVar = new s5k(this, x1bVar);
        }
        Object objA = s5kVar.d;
        Object obj = y5b.a;
        int i2 = s5kVar.f;
        if (i2 == 0) {
            uj50.b(objA);
            if (this.c.isLogin()) {
                s5kVar.a = krf0Var;
                s5kVar.b = tierDobConfig;
                s5kVar.c = tierDobConfig2;
                s5kVar.f = 1;
                objA = a(s5kVar);
                if (objA == obj) {
                    return obj;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tierDobConfig2 = s5kVar.c;
        tierDobConfig = s5kVar.b;
        krf0Var = s5kVar.a;
        uj50.b(objA);
        mst mstVar = (mst) objA;
        if (mstVar != null) {
            int i3 = mstVar.b;
            Integer num = tierDobConfig2 != null ? new Integer(tierDobConfig2.getTier()) : null;
            Integer num2 = tierDobConfig != null ? new Integer(tierDobConfig.getTier()) : null;
            if (num == null || num2 == null || !mstVar.d) {
                queVar = que.e;
            } else if (num.intValue() < i3) {
                queVar = que.a;
            } else if (num.intValue() > num2.intValue()) {
                queVar = que.c;
            } else {
                queVar = !mstVar.a ? que.d : que.b;
            }
            if (tierDobConfig2 != null && (stringUiTextA = u5k.a(tierDobConfig2, DobRewardType.BirthdayGift)) != null) {
                StringUiText stringUiTextA2 = u5k.a(tierDobConfig2, DobRewardType.DobVerifiedGift);
                uag uagVar = krf0.I;
                q3.b bVarA = ocx.a(uagVar, uagVar);
                do {
                    if (!bVarA.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarA.next();
                } while (((krf0) next).a != i3);
                krf0 krf0Var2 = (krf0) next;
                int i4 = krf0Var2 != null ? krf0Var2.b : krf0.TIER_0.b;
                boolean z = mstVar.c;
                int iOrdinal = queVar.ordinal();
                if (iOrdinal == 0) {
                    StringUiText stringUiText = vch0.a;
                    return new aue.d(new ResourceUiText(i4), z);
                }
                if (iOrdinal == 1) {
                    return new aue.c(stringUiTextA, z);
                }
                if (iOrdinal == 2) {
                    int i5 = krf0Var.b;
                    StringUiText stringUiText2 = vch0.a;
                    return new aue.b(stringUiTextA, new ResourceUiText(i5), z);
                }
                if (iOrdinal == 3) {
                    return new aue.a(stringUiTextA2, stringUiTextA, z);
                }
                if (iOrdinal != 4) {
                    uhc.a();
                    return null;
                }
            }
        }
        return null;
    }
}
