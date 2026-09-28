package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.RoundTicketBetInfoLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b060 implements View.OnClickListener {
    public final /* synthetic */ RoundTicketBetInfoLayout a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        int i = RoundTicketBetInfoLayout.B;
        Object tag = view.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            RoundTicketBetInfoLayout roundTicketBetInfoLayout = this.a;
            PopupWindow popupWindow2 = roundTicketBetInfoLayout.A;
            if (popupWindow2 != null) {
                ((TextView) popupWindow2.getContentView().findViewById(R.id.status_text)).setText(str);
                popupWindow = roundTicketBetInfoLayout.A;
            } else {
                View viewInflate = LayoutInflater.from(roundTicketBetInfoLayout.getContext()).inflate(R.layout.layout_selection_status_popup, (ViewGroup) null);
                ((TextView) viewInflate.findViewById(R.id.status_text)).setText(str);
                PopupWindow popupWindow3 = new PopupWindow(viewInflate, -2, -2);
                roundTicketBetInfoLayout.A = popupWindow3;
                popupWindow3.setOutsideTouchable(true);
                popupWindow = roundTicketBetInfoLayout.A;
            }
            popupWindow.showAsDropDown(view);
        }
    }
}
