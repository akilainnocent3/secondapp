package defpackage;

import android.util.Base64;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ibw implements Function1 {
    public final /* synthetic */ ylb0 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        wwd0 wwd0Var = this.a.D3().e;
        String string = StringsKt.t0(str).toString();
        if (string.length() != 0) {
            try {
                UserLevelProgressDto userLevelProgressDtoCopy = (UserLevelProgressDto) ubw.a.e(x54.a(Base64.decode(string, 0)), UserLevelProgressDto.class);
                Object value = wwd0Var.getValue();
                jph0.d dVar = value instanceof jph0.d ? (jph0.d) value : null;
                UserLevelProgressDto userLevelProgressDto = dVar != null ? dVar.a : null;
                userLevelProgressDtoCopy.getClass();
                if (userLevelProgressDto != null) {
                    int resetProgressInDays = userLevelProgressDtoCopy.getResetProgressInDays();
                    Integer numValueOf = Integer.valueOf(resetProgressInDays);
                    if (resetProgressInDays <= 0) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : userLevelProgressDto.getResetProgressInDays();
                    int fbgExpiryInDays = userLevelProgressDtoCopy.getFbgExpiryInDays();
                    Integer numValueOf2 = Integer.valueOf(fbgExpiryInDays);
                    if (fbgExpiryInDays <= 0) {
                        numValueOf2 = null;
                    }
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : userLevelProgressDto.getFbgExpiryInDays();
                    int fbgHighestAwardedLevel = userLevelProgressDtoCopy.getFbgHighestAwardedLevel();
                    Integer numValueOf3 = Integer.valueOf(fbgHighestAwardedLevel);
                    if (fbgHighestAwardedLevel <= 0) {
                        numValueOf3 = null;
                    }
                    userLevelProgressDtoCopy = userLevelProgressDtoCopy.copy((4607 & 1) != 0 ? userLevelProgressDtoCopy.level : 0, (4607 & 2) != 0 ? userLevelProgressDtoCopy.normalRounds : 0, (4607 & 4) != 0 ? userLevelProgressDtoCopy.completedNormalRounds : 0, (4607 & 8) != 0 ? userLevelProgressDtoCopy.bonusPercentage : 0.0d, (4607 & 16) != 0 ? userLevelProgressDtoCopy.isNextBonusRound : false, (4607 & 32) != 0 ? userLevelProgressDtoCopy.stakeAmountCapForNextRound : null, (4607 & 64) != 0 ? userLevelProgressDtoCopy.bonusMeterRounds : 0, (4607 & 128) != 0 ? userLevelProgressDtoCopy.completedBonusMeterRounds : 0, (4607 & 256) != 0 ? userLevelProgressDtoCopy.isBonusMeterVisible : false, (4607 & 512) != 0 ? userLevelProgressDtoCopy.fbgExpiryInDays : iIntValue2, (4607 & 1024) != 0 ? userLevelProgressDtoCopy.resetProgressInDays : iIntValue, (4607 & 2048) != 0 ? userLevelProgressDtoCopy.fbgHighestAwardedLevel : numValueOf3 != null ? numValueOf3.intValue() : userLevelProgressDto.getFbgHighestAwardedLevel(), (4607 & 4096) != 0 ? userLevelProgressDtoCopy.lastLevelReset : false);
                }
                new jph0.d(userLevelProgressDtoCopy);
                wwd0Var.getClass();
                wwd0Var.k(null, r3);
            } catch (qep unused) {
            }
        }
        return Unit.a;
    }
}
