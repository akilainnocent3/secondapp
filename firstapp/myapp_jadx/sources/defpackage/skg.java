package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.lgg.GiftGrabView;
import com.sportybet.plugin.realsports.data.GiftGrabButtonStatus;
import com.sportybet.plugin.realsports.data.GiftGrabUIState;
import com.sportybet.plugin.realsports.data.GiftGrabViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class skg extends saj implements Function1<GiftGrabUIState, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftGrabUIState giftGrabUIState) {
        GiftGrabUIState giftGrabUIState2 = giftGrabUIState;
        EventActivity eventActivity = (EventActivity) this.receiver;
        int i = EventActivity.U0;
        if (giftGrabUIState2 instanceof GiftGrabUIState.Data) {
            agd0 agd0Var = eventActivity.R;
            if (agd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            GiftGrabView giftGrabView = agd0Var.f;
            GiftGrabViewState state = ((GiftGrabUIState.Data) giftGrabUIState2).getState();
            blk blkVar = giftGrabView.I;
            state.getClass();
            if (!Intrinsics.g(giftGrabView.J, state)) {
                giftGrabView.J = state;
                if (state instanceof GiftGrabViewState.Idle) {
                    TextView textView = blkVar.z;
                    UiText title = ((GiftGrabViewState.Idle) state).getTitle();
                    Context context = giftGrabView.getContext();
                    context.getClass();
                    textView.setText(zch0.j(title.e(context), giftGrabView.getContext().getColor(R.color.gift_grab_progressbar), 10, null));
                    blkVar.w.setVisibility(0);
                    blkVar.B.setVisibility(8);
                    ImageView imageView = blkVar.v;
                    gbn imageService = giftGrabView.getImageService();
                    imageService.getClass();
                    Object tag = imageView.getTag(R.id.load_url_when_size_ready);
                    if (tag != null) {
                        if (!(tag instanceof lxs)) {
                            tag = null;
                        }
                        lxs lxsVar = (lxs) tag;
                        if (lxsVar != null) {
                            imageView.removeOnLayoutChangeListener(lxsVar);
                            imageView.setTag(R.id.load_url_when_size_ready, null);
                        }
                    }
                    if (!tbn.b(imageView, imageService, null)) {
                        lxs lxsVar2 = new lxs(imageService);
                        imageView.setTag(R.id.load_url_when_size_ready, lxsVar2);
                        imageView.addOnLayoutChangeListener(lxsVar2);
                    }
                } else {
                    if (!(state instanceof GiftGrabViewState.Running)) {
                        uhc.a();
                        return null;
                    }
                    Group group = blkVar.w;
                    ProgressButton progressButton = blkVar.f;
                    group.setVisibility(8);
                    blkVar.B.setVisibility(0);
                    TextView textView2 = blkVar.e;
                    GiftGrabViewState.Running running = (GiftGrabViewState.Running) state;
                    UiText title2 = running.getTitle();
                    Context context2 = giftGrabView.getContext();
                    context2.getClass();
                    textView2.setText(zch0.j(title2.e(context2), giftGrabView.getContext().getColor(R.color.gift_grab_progressbar), 10, null));
                    GiftGrabButtonStatus giftGrabButtonStatus = running.getGiftGrabButtonStatus();
                    if (giftGrabButtonStatus instanceof GiftGrabButtonStatus.Loaded) {
                        progressButton.setLoading(false);
                        progressButton.setEnabled(((GiftGrabButtonStatus.Loaded) running.getGiftGrabButtonStatus()).isEnable());
                    } else {
                        if (!(giftGrabButtonStatus instanceof GiftGrabButtonStatus.Loading)) {
                            uhc.a();
                            return null;
                        }
                        progressButton.setLoading(true);
                    }
                }
            }
        }
        eventActivity.i2();
        return Unit.a;
    }
}
