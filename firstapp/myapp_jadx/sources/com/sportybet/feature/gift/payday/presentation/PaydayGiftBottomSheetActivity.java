package com.sportybet.feature.gift.payday.presentation;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.feature.gift.payday.presentation.PaydayGiftBottomSheetActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.fzl;
import defpackage.op8;
import defpackage.rlf;
import defpackage.saj;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/gift/payday/presentation/PaydayGiftBottomSheetActivity;", "Lpy1;", "Lbb40;", "Lrlf;", "<init>", "()V", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PaydayGiftBottomSheetActivity extends fzl implements bb40, rlf {
    public static final /* synthetic */ int c = 0;
    public azm b;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((PaydayGiftBottomSheetActivity) this.receiver).finish();
            return Unit.a;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-307020571, new Function2() { // from class: u400
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = PaydayGiftBottomSheetActivity.c;
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(-1232983660, new z7c(this.a, i2), aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
