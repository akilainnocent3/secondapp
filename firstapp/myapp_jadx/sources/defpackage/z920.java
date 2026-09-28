package defpackage;

import android.widget.ImageView;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class z920<T> implements myh {
    public final /* synthetic */ x920 a;

    public z920(x920 x920Var) {
        this.a = x920Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        ca20.b bVar;
        UIState uIState = (UIState) obj;
        if (!(uIState instanceof UIState.Loading)) {
            boolean z = uIState instanceof UIState.Error;
            x920 x920Var = this.a;
            if (z) {
                zyf0.c(1, ((UIState.Error) uIState).getError().getMessage());
                ca20 ca20Var = x920Var.C;
                if (ca20Var != null && (bVar = ca20Var.e) != null) {
                    g2p g2pVar = bVar.a;
                    g2pVar.f.setVisibility(8);
                    ImageView imageView = g2pVar.c;
                    imageView.setVisibility(0);
                    imageView.setClickable(true);
                }
            } else if (uIState instanceof UIState.Success) {
                BookingData bookingData = (BookingData) ((UIState.Success) uIState).getData();
                if (x920Var.i.hasPersonalPage()) {
                    String str = bookingData.shareCode;
                    str.getClass();
                    if (str.length() > 0) {
                        eja0 eja0Var = (eja0) x920Var.E.getValue();
                        String str2 = bookingData.shareCode;
                        str2.getClass();
                        eja0Var.x1(str2);
                    } else {
                        Boolean bool = Boolean.TRUE;
                        Boolean bool2 = Boolean.FALSE;
                        zha0 zha0Var = new zha0(bool, bool2, bool2, x920Var.i.getLastNickName(), x920Var.i.getAvatarUrl());
                        String str3 = bookingData.shareURL;
                        str3.getClass();
                        String str4 = bookingData.shareCode;
                        str4.getClass();
                        x920Var.n0(zha0Var, str3, str4);
                    }
                } else {
                    Boolean bool3 = Boolean.TRUE;
                    Boolean bool4 = Boolean.FALSE;
                    zha0 zha0Var2 = new zha0(bool3, bool4, bool4, x920Var.i.getLastNickName(), x920Var.i.getAvatarUrl());
                    String str5 = bookingData.shareURL;
                    str5.getClass();
                    String str6 = bookingData.shareCode;
                    str6.getClass();
                    x920Var.n0(zha0Var2, str5, str6);
                }
            }
        }
        return Unit.a;
    }
}
