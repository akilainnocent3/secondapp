package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class knf {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EditBetDlgType.values().length];
            try {
                iArr[EditBetDlgType.ERROR_EDIT_PLACE_BET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditBetDlgType.NO_LONGER_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditBetDlgType.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final ErrorDataInfo errorDataInfo, final boolean z, final Function0 function0, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        int i4;
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1332053411);
        int i5 = i | (bVarI.A(errorDataInfo) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= bVarI.b(z) ? 32 : 16;
        }
        int i6 = i5 | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (!bVarI.q(i6 & 1, (i6 & 1171) != 1170)) {
            bVarI.G();
        } else if (z) {
            bVarI.N(-2000115964);
            EditBetDlgType editBetDlgType = errorDataInfo.getEditBetDlgType();
            int[] iArr = a.a;
            int i7 = iArr[editBetDlgType.ordinal()];
            if (i7 == 1) {
                i2 = R.string.common_functions__edit_bet_submission_error_cashout_value_changed_title;
            } else if (i7 == 2) {
                i2 = R.string.common_functions__edit_bet_submission_error_unavailable_title;
            } else {
                if (i7 != 3) {
                    uhc.a();
                    return;
                }
                i2 = R.string.bet_history__discard_delete_sections_hint_title;
            }
            String strA = cb40.a(i2, new Object[0], bVarI);
            int i8 = iArr[errorDataInfo.getEditBetDlgType().ordinal()];
            if (i8 == 1) {
                i3 = R.string.common_functions__edit_bet_submission_error_cashout_value_changed_message;
            } else if (i8 == 2) {
                i3 = R.string.common_functions__edit_bet_submission_error_unavailable_message;
            } else {
                if (i8 != 3) {
                    uhc.a();
                    return;
                }
                i3 = R.string.common_functions__edit_bet_discard_selection_message;
            }
            String strA2 = cb40.a(i3, new Object[0], bVarI);
            int i9 = iArr[errorDataInfo.getEditBetDlgType().ordinal()];
            if (i9 == 1) {
                i4 = R.string.common_functions__edit_bet_submission_error_cashout_value_changed_review_changes;
            } else if (i9 == 2) {
                i4 = R.string.common_functions__ok;
            } else {
                if (i9 != 3) {
                    uhc.a();
                    return;
                }
                i4 = R.string.common_functions__discard;
            }
            String strA3 = cb40.a(i4, new Object[0], bVarI);
            op8 op8VarB = null;
            Integer numValueOf = errorDataInfo.getEditBetDlgType() == EditBetDlgType.DISCARD ? Integer.valueOf(R.string.common_functions__stay) : null;
            if (numValueOf == null) {
                bVarI.N(-1999746135);
                bVarI.X(false);
            } else {
                bVarI.N(-1999746134);
                final int iIntValue = numValueOf.intValue();
                op8VarB = pp8.b(-1924793015, new Function2() { // from class: hnf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            lkf0.d(cb40.a(iIntValue, new Object[0], aVar2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262142);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                bVarI.X(false);
            }
            boolean zA = ((i6 & 7168) == 2048) | bVarI.A(errorDataInfo) | ((i6 & 896) == 256);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: inf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function1 function2 = function1;
                        ErrorDataInfo errorDataInfo2 = errorDataInfo;
                        function2.invoke(errorDataInfo2);
                        if (errorDataInfo2.getEditBetDlgType() != EditBetDlgType.ERROR_EDIT_PLACE_BET) {
                            iu2.a.j().I1();
                        }
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            nzj.b(null, strA, strA2, null, null, null, strA3, null, null, null, op8VarB, function0, (Function0) objY, function0, bVarI, 0, ((i6 >> 3) & 112) | ((i6 << 3) & 7168), 953);
            bVarI = bVarI;
            bVarI.X(false);
        } else {
            bVarI.N(-1999284699);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jnf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    knf.a(errorDataInfo, z, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
