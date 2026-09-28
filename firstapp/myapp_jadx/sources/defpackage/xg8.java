package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.paybill.ExclusiveOffersLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xg8 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        dh8.a aVar = dh8.y;
        view.getClass();
        int i = R.id.bo_channel_content;
        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.bo_channel_content, view);
        if (linearLayout != null) {
            i = R.id.channel;
            TextView textView = (TextView) h5e.a(R.id.channel, view);
            if (textView != null) {
                i = R.id.channel_content;
                TextView textView2 = (TextView) h5e.a(R.id.channel_content, view);
                if (textView2 != null) {
                    i = R.id.channel_icon;
                    ImageView imageView = (ImageView) h5e.a(R.id.channel_icon, view);
                    if (imageView != null) {
                        i = R.id.description_container;
                        LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.description_container, view);
                        if (linearLayout2 != null) {
                            i = R.id.divider;
                            View viewA = h5e.a(R.id.divider, view);
                            if (viewA != null) {
                                i = R.id.exclusive_layout;
                                ExclusiveOffersLayout exclusiveOffersLayout = (ExclusiveOffersLayout) h5e.a(R.id.exclusive_layout, view);
                                if (exclusiveOffersLayout != null) {
                                    i = R.id.note;
                                    if (((TextView) h5e.a(R.id.note, view)) != null) {
                                        i = R.id.top_container;
                                        LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.top_container, view);
                                        if (linearLayout3 != null) {
                                            i = R.id.top_view;
                                            TextView textView3 = (TextView) h5e.a(R.id.top_view, view);
                                            if (textView3 != null) {
                                                return new cvi((LinearLayout) view, linearLayout, textView, textView2, imageView, linearLayout2, viewA, exclusiveOffersLayout, linearLayout3, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
