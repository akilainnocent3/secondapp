package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;

/* JADX INFO: loaded from: classes6.dex */
public final class j37 {
    public final uti a;
    public final psm b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[m0u.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m0u.a aVar = m0u.b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m0u.a aVar2 = m0u.b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m0u.a aVar3 = m0u.b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m0u.a aVar4 = m0u.b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m0u.a aVar5 = m0u.b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                m0u.a aVar6 = m0u.b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m0u.a aVar7 = m0u.b;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[f07.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f07 f07Var = f07.a;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[ChallengeType.values().length];
            try {
                iArr3[ChallengeType.TOTAL_WINNING_ODDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ChallengeType.TOTAL_WINNING_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ChallengeType.HIGHEST_WINNING_AMOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr3;
            int[] iArr4 = new int[ChallengeCardStatus.values().length];
            try {
                iArr4[ChallengeCardStatus.Expired.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ChallengeCardStatus.Completed.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ChallengeCardStatus.Upcoming.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ChallengeCardStatus.Available.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ChallengeCardStatus.Conflicted.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr4;
            int[] iArr5 = new int[lx6.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                lx6 lx6Var = lx6.a;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                lx6 lx6Var2 = lx6.a;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                lx6 lx6Var3 = lx6.a;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public j37(uti utiVar, psm psmVar) {
        psmVar.getClass();
        this.a = utiVar;
        this.b = psmVar;
    }

    public static a07 e(f07 f07Var) {
        int iOrdinal = f07Var.ordinal();
        if (iOrdinal == 2) {
            StringUiText stringUiText = vch0.a;
            return new a07(new ResourceUiText(R.string.page_loyalty__challenge_lobby_empty_available_title), new ResourceUiText(R.string.page_loyalty__challenge_lobby_empty_available_subtitle));
        }
        if (iOrdinal != 3) {
            StringUiText stringUiText2 = vch0.a;
            return new a07(new ResourceUiText(R.string.page_loyalty__challenge_lobby_empty_ongoing_title), new ResourceUiText(R.string.page_loyalty__challenge_lobby_empty_join_subtitle));
        }
        StringUiText stringUiText3 = vch0.a;
        return new a07(new ResourceUiText(R.string.page_loyalty__challenge_lobby_empty_completed_title), new ResourceUiText(R.string.page_loyalty__challenge_lobby_empty_join_subtitle));
    }

    public static int f(m0u m0uVar) {
        m0uVar.getClass();
        switch (m0uVar.ordinal()) {
            case 0:
                return R.string.page_loyalty__challenge_title_iron_img_v2;
            case 1:
                return R.string.page_loyalty__challenge_title_copper_img_v2;
            case 2:
                return R.string.page_loyalty__challenge_title_bronze_img_v2;
            case 3:
                return R.string.page_loyalty__challenge_title_silver_img_v2;
            case 4:
                return R.string.page_loyalty__challenge_title_gold_img_v2;
            case 5:
                return R.string.page_loyalty__challenge_title_platinum_img_v2;
            case 6:
                return R.string.page_loyalty__challenge_title_titanium_img_v2;
            case 7:
                return R.string.page_loyalty__challenge_title_diamond_img_v2;
            default:
                uhc.a();
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, j27 j27Var, j27 j27Var2, x1b x1bVar) {
        k37 k37Var;
        int i2;
        int i3;
        j27 j27Var3;
        UiText uiText;
        int i4;
        ResourceUiText resourceUiText;
        a27 a27Var;
        if (x1bVar instanceof k37) {
            k37Var = (k37) x1bVar;
            int i5 = k37Var.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k37Var.v = i5 - Integer.MIN_VALUE;
            } else {
                k37Var = new k37(this, x1bVar);
            }
        } else {
            k37Var = new k37(this, x1bVar);
        }
        Object objB = k37Var.f;
        Object obj = y5b.a;
        int i6 = k37Var.v;
        if (i6 != 0) {
            if (i6 == 1) {
                i3 = k37Var.b;
                i2 = k37Var.a;
                uiText = (UiText) k37Var.d;
                j27Var3 = k37Var.c;
                uj50.b(objB);
            } else {
                if (i6 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = k37Var.b;
                resourceUiText = k37Var.e;
                a27Var = (a27) k37Var.d;
                uj50.b(objB);
            }
            return a4h.a(a27Var, new a27((String) objB, resourceUiText, i4));
        }
        uj50.b(objB);
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_loyalty__challenge_rank_champion);
        k37Var.c = j27Var2;
        k37Var.d = resourceUiText2;
        k37Var.a = i;
        k37Var.b = R.drawable.img_crown;
        k37Var.v = 1;
        Object objB2 = b(j27Var, k37Var);
        if (objB2 != obj) {
            i2 = i;
            i3 = R.drawable.img_crown;
            j27Var3 = j27Var2;
            uiText = resourceUiText2;
            objB = objB2;
        }
        return obj;
        a27 a27Var2 = new a27((String) objB, uiText, i3);
        Object[] objArr = {new Integer(i2)};
        StringUiText stringUiText2 = vch0.a;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_loyalty__challenge_rank_top, ay0.S(objArr));
        k37Var.c = null;
        k37Var.d = a27Var2;
        k37Var.e = resourceUiText3;
        k37Var.a = i2;
        k37Var.b = R.drawable.img_money_bag;
        k37Var.v = 2;
        objB = b(j27Var3, k37Var);
        if (objB != obj) {
            i4 = R.drawable.img_money_bag;
            resourceUiText = resourceUiText3;
            a27Var = a27Var2;
            return a4h.a(a27Var, new a27((String) objB, resourceUiText, i4));
        }
        return obj;
    }

    public final Object b(j27 j27Var, x1b x1bVar) {
        boolean z = j27Var instanceof j27.b;
        uti utiVar = this.a;
        if (!z) {
            return j27Var instanceof j27.a ? ((j27.a) j27Var).a : utiVar.a(s5y.e(new Double(0.0d)), this.b.b(), true, x1bVar);
        }
        j27.b bVar = (j27.b) j27Var;
        return utiVar.a(s5y.e(new Long(bVar.b)), bVar.c, true, x1bVar);
    }

    /* JADX WARN: Failed to calculate best type for var: r0v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v12 ??, new type: r27
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v21 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v26 ??, new type: java.lang.Boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v31 ??, new type: r27
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: com.sporty.android.common_ui.uitext.UiText
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v5 ??, new type: com.sporty.android.common_ui.uitext.UiText
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final java.lang.Object c(com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus r23, java.lang.String r24, defpackage.t27 r25, int r26, defpackage.j27 r27, defpackage.j27 r28, long r29, long r31, defpackage.x1b r33) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j37.c(com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus, java.lang.String, t27, int, j27, j27, long, long, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027c  */
    /* JADX WARN: Code duplicated, block: B:103:0x027f  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x0304  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:135:0x0408  */
    /* JADX WARN: Code duplicated, block: B:136:0x040b  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0152  */
    /* JADX WARN: Code duplicated, block: B:38:0x016a  */
    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0178  */
    /* JADX WARN: Code duplicated, block: B:45:0x017d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0188  */
    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:51:0x018e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x0195  */
    /* JADX WARN: Code duplicated, block: B:55:0x0198  */
    /* JADX WARN: Code duplicated, block: B:57:0x019c  */
    /* JADX WARN: Code duplicated, block: B:58:0x019f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0213  */
    /* JADX WARN: Code duplicated, block: B:93:0x021f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x022a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0232  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.sporty.android.common_ui.uitext.ResourceUiText, com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType, com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus, java.lang.String, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x03b6 -> B:126:0x03e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(int r62, defpackage.x1b r63, java.util.List r64) {
        /*
            Method dump skipped, instruction units count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j37.d(int, x1b, java.util.List):java.lang.Object");
    }
}
