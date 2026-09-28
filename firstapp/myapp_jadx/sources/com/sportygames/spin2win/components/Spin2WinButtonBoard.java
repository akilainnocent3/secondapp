package com.sportygames.spin2win.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.jk2;
import defpackage.kya0;
import defpackage.lxa0;
import defpackage.op5;
import defpackage.tk30;
import defpackage.v4b0;
import defpackage.yp80;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u0012\u001a\u00020\u00112\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/sportygames/spin2win/components/Spin2WinButtonBoard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/sportygames/spin2win/model/local/LocalGameDetailsEntity;", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "betChipList", "", "chipType", "", "setButtonBoardData", "(Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;)V", "Lv4b0;", "vm", "setViewModel", "(Lv4b0;)V", "", "H", "Z", "getFbgApplied", "()Z", "setFbgApplied", "(Z)V", "fbgApplied", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Spin2WinButtonBoard extends ConstraintLayout {
    public static final /* synthetic */ int J = 0;
    public final yp80 F;
    public v4b0 G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean fbgApplied;
    public View I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spin2WinButtonBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_spin2_win_button_board, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.button_board;
        if (((ConstraintLayout) h5e.a(R.id.button_board, viewInflate)) != null) {
            i = R.id.chip_amount_1_12;
            TextView textView = (TextView) h5e.a(R.id.chip_amount_1_12, viewInflate);
            if (textView != null) {
                i = R.id.chip_amount_13_24;
                TextView textView2 = (TextView) h5e.a(R.id.chip_amount_13_24, viewInflate);
                if (textView2 != null) {
                    i = R.id.chip_amount_25_36;
                    TextView textView3 = (TextView) h5e.a(R.id.chip_amount_25_36, viewInflate);
                    if (textView3 != null) {
                        i = R.id.chip_amount_a;
                        TextView textView4 = (TextView) h5e.a(R.id.chip_amount_a, viewInflate);
                        if (textView4 != null) {
                            i = R.id.chip_amount_b;
                            TextView textView5 = (TextView) h5e.a(R.id.chip_amount_b, viewInflate);
                            if (textView5 != null) {
                                i = R.id.chip_amount_black;
                                TextView textView6 = (TextView) h5e.a(R.id.chip_amount_black, viewInflate);
                                if (textView6 != null) {
                                    i = R.id.chip_amount_c;
                                    TextView textView7 = (TextView) h5e.a(R.id.chip_amount_c, viewInflate);
                                    if (textView7 != null) {
                                        i = R.id.chip_amount_d;
                                        TextView textView8 = (TextView) h5e.a(R.id.chip_amount_d, viewInflate);
                                        if (textView8 != null) {
                                            i = R.id.chip_amount_e;
                                            TextView textView9 = (TextView) h5e.a(R.id.chip_amount_e, viewInflate);
                                            if (textView9 != null) {
                                                i = R.id.chip_amount_even;
                                                TextView textView10 = (TextView) h5e.a(R.id.chip_amount_even, viewInflate);
                                                if (textView10 != null) {
                                                    i = R.id.chip_amount_f;
                                                    TextView textView11 = (TextView) h5e.a(R.id.chip_amount_f, viewInflate);
                                                    if (textView11 != null) {
                                                        i = R.id.chip_amount_green;
                                                        TextView textView12 = (TextView) h5e.a(R.id.chip_amount_green, viewInflate);
                                                        if (textView12 != null) {
                                                            i = R.id.chip_amount_high;
                                                            TextView textView13 = (TextView) h5e.a(R.id.chip_amount_high, viewInflate);
                                                            if (textView13 != null) {
                                                                i = R.id.chip_amount_high_black;
                                                                TextView textView14 = (TextView) h5e.a(R.id.chip_amount_high_black, viewInflate);
                                                                if (textView14 != null) {
                                                                    i = R.id.chip_amount_high_red;
                                                                    TextView textView15 = (TextView) h5e.a(R.id.chip_amount_high_red, viewInflate);
                                                                    if (textView15 != null) {
                                                                        i = R.id.chip_amount_low;
                                                                        TextView textView16 = (TextView) h5e.a(R.id.chip_amount_low, viewInflate);
                                                                        if (textView16 != null) {
                                                                            i = R.id.chip_amount_low_black;
                                                                            TextView textView17 = (TextView) h5e.a(R.id.chip_amount_low_black, viewInflate);
                                                                            if (textView17 != null) {
                                                                                i = R.id.chip_amount_low_red;
                                                                                TextView textView18 = (TextView) h5e.a(R.id.chip_amount_low_red, viewInflate);
                                                                                if (textView18 != null) {
                                                                                    i = R.id.chip_amount_odd;
                                                                                    TextView textView19 = (TextView) h5e.a(R.id.chip_amount_odd, viewInflate);
                                                                                    if (textView19 != null) {
                                                                                        i = R.id.chip_amount_red;
                                                                                        TextView textView20 = (TextView) h5e.a(R.id.chip_amount_red, viewInflate);
                                                                                        if (textView20 != null) {
                                                                                            i = R.id.chip_image_1_12;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.chip_image_1_12, viewInflate);
                                                                                            if (constraintLayout != null) {
                                                                                                i = R.id.chip_image_13_24;
                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.chip_image_13_24, viewInflate);
                                                                                                if (constraintLayout2 != null) {
                                                                                                    i = R.id.chip_image_25_36;
                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.chip_image_25_36, viewInflate);
                                                                                                    if (constraintLayout3 != null) {
                                                                                                        i = R.id.chip_image_a;
                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.chip_image_a, viewInflate);
                                                                                                        if (constraintLayout4 != null) {
                                                                                                            i = R.id.chip_image_b;
                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.chip_image_b, viewInflate);
                                                                                                            if (constraintLayout5 != null) {
                                                                                                                i = R.id.chip_image_black;
                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.chip_image_black, viewInflate);
                                                                                                                if (constraintLayout6 != null) {
                                                                                                                    i = R.id.chip_image_c;
                                                                                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.chip_image_c, viewInflate);
                                                                                                                    if (constraintLayout7 != null) {
                                                                                                                        i = R.id.chip_image_d;
                                                                                                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.chip_image_d, viewInflate);
                                                                                                                        if (constraintLayout8 != null) {
                                                                                                                            i = R.id.chip_image_e;
                                                                                                                            ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.chip_image_e, viewInflate);
                                                                                                                            if (constraintLayout9 != null) {
                                                                                                                                i = R.id.chip_image_even;
                                                                                                                                ConstraintLayout constraintLayout10 = (ConstraintLayout) h5e.a(R.id.chip_image_even, viewInflate);
                                                                                                                                if (constraintLayout10 != null) {
                                                                                                                                    i = R.id.chip_image_f;
                                                                                                                                    ConstraintLayout constraintLayout11 = (ConstraintLayout) h5e.a(R.id.chip_image_f, viewInflate);
                                                                                                                                    if (constraintLayout11 != null) {
                                                                                                                                        i = R.id.chip_image_green;
                                                                                                                                        ConstraintLayout constraintLayout12 = (ConstraintLayout) h5e.a(R.id.chip_image_green, viewInflate);
                                                                                                                                        if (constraintLayout12 != null) {
                                                                                                                                            i = R.id.chip_image_high;
                                                                                                                                            ConstraintLayout constraintLayout13 = (ConstraintLayout) h5e.a(R.id.chip_image_high, viewInflate);
                                                                                                                                            if (constraintLayout13 != null) {
                                                                                                                                                i = R.id.chip_image_high_black;
                                                                                                                                                ConstraintLayout constraintLayout14 = (ConstraintLayout) h5e.a(R.id.chip_image_high_black, viewInflate);
                                                                                                                                                if (constraintLayout14 != null) {
                                                                                                                                                    i = R.id.chip_image_high_red;
                                                                                                                                                    ConstraintLayout constraintLayout15 = (ConstraintLayout) h5e.a(R.id.chip_image_high_red, viewInflate);
                                                                                                                                                    if (constraintLayout15 != null) {
                                                                                                                                                        i = R.id.chip_image_low;
                                                                                                                                                        ConstraintLayout constraintLayout16 = (ConstraintLayout) h5e.a(R.id.chip_image_low, viewInflate);
                                                                                                                                                        if (constraintLayout16 != null) {
                                                                                                                                                            i = R.id.chip_image_low_black;
                                                                                                                                                            ConstraintLayout constraintLayout17 = (ConstraintLayout) h5e.a(R.id.chip_image_low_black, viewInflate);
                                                                                                                                                            if (constraintLayout17 != null) {
                                                                                                                                                                i = R.id.chip_image_low_red;
                                                                                                                                                                ConstraintLayout constraintLayout18 = (ConstraintLayout) h5e.a(R.id.chip_image_low_red, viewInflate);
                                                                                                                                                                if (constraintLayout18 != null) {
                                                                                                                                                                    i = R.id.chip_image_odd;
                                                                                                                                                                    ConstraintLayout constraintLayout19 = (ConstraintLayout) h5e.a(R.id.chip_image_odd, viewInflate);
                                                                                                                                                                    if (constraintLayout19 != null) {
                                                                                                                                                                        i = R.id.chip_image_red;
                                                                                                                                                                        ConstraintLayout constraintLayout20 = (ConstraintLayout) h5e.a(R.id.chip_image_red, viewInflate);
                                                                                                                                                                        if (constraintLayout20 != null) {
                                                                                                                                                                            i = R.id.empty_board;
                                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.empty_board, viewInflate)) != null) {
                                                                                                                                                                                i = R.id.iv_1_12;
                                                                                                                                                                                ImageView imageView = (ImageView) h5e.a(R.id.iv_1_12, viewInflate);
                                                                                                                                                                                if (imageView != null) {
                                                                                                                                                                                    i = R.id.iv_13_24;
                                                                                                                                                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.iv_13_24, viewInflate);
                                                                                                                                                                                    if (imageView2 != null) {
                                                                                                                                                                                        i = R.id.iv_25_36;
                                                                                                                                                                                        ImageView imageView3 = (ImageView) h5e.a(R.id.iv_25_36, viewInflate);
                                                                                                                                                                                        if (imageView3 != null) {
                                                                                                                                                                                            i = R.id.iv_a;
                                                                                                                                                                                            ImageView imageView4 = (ImageView) h5e.a(R.id.iv_a, viewInflate);
                                                                                                                                                                                            if (imageView4 != null) {
                                                                                                                                                                                                i = R.id.iv_b;
                                                                                                                                                                                                ImageView imageView5 = (ImageView) h5e.a(R.id.iv_b, viewInflate);
                                                                                                                                                                                                if (imageView5 != null) {
                                                                                                                                                                                                    i = R.id.iv_black;
                                                                                                                                                                                                    ImageView imageView6 = (ImageView) h5e.a(R.id.iv_black, viewInflate);
                                                                                                                                                                                                    if (imageView6 != null) {
                                                                                                                                                                                                        i = R.id.iv_c;
                                                                                                                                                                                                        ImageView imageView7 = (ImageView) h5e.a(R.id.iv_c, viewInflate);
                                                                                                                                                                                                        if (imageView7 != null) {
                                                                                                                                                                                                            i = R.id.iv_d;
                                                                                                                                                                                                            ImageView imageView8 = (ImageView) h5e.a(R.id.iv_d, viewInflate);
                                                                                                                                                                                                            if (imageView8 != null) {
                                                                                                                                                                                                                i = R.id.iv_e;
                                                                                                                                                                                                                ImageView imageView9 = (ImageView) h5e.a(R.id.iv_e, viewInflate);
                                                                                                                                                                                                                if (imageView9 != null) {
                                                                                                                                                                                                                    i = R.id.iv_even;
                                                                                                                                                                                                                    ImageView imageView10 = (ImageView) h5e.a(R.id.iv_even, viewInflate);
                                                                                                                                                                                                                    if (imageView10 != null) {
                                                                                                                                                                                                                        i = R.id.iv_f;
                                                                                                                                                                                                                        ImageView imageView11 = (ImageView) h5e.a(R.id.iv_f, viewInflate);
                                                                                                                                                                                                                        if (imageView11 != null) {
                                                                                                                                                                                                                            i = R.id.iv_green;
                                                                                                                                                                                                                            ImageView imageView12 = (ImageView) h5e.a(R.id.iv_green, viewInflate);
                                                                                                                                                                                                                            if (imageView12 != null) {
                                                                                                                                                                                                                                i = R.id.iv_high;
                                                                                                                                                                                                                                ImageView imageView13 = (ImageView) h5e.a(R.id.iv_high, viewInflate);
                                                                                                                                                                                                                                if (imageView13 != null) {
                                                                                                                                                                                                                                    i = R.id.iv_high_black;
                                                                                                                                                                                                                                    ImageView imageView14 = (ImageView) h5e.a(R.id.iv_high_black, viewInflate);
                                                                                                                                                                                                                                    if (imageView14 != null) {
                                                                                                                                                                                                                                        i = R.id.iv_high_red;
                                                                                                                                                                                                                                        ImageView imageView15 = (ImageView) h5e.a(R.id.iv_high_red, viewInflate);
                                                                                                                                                                                                                                        if (imageView15 != null) {
                                                                                                                                                                                                                                            i = R.id.iv_low;
                                                                                                                                                                                                                                            ImageView imageView16 = (ImageView) h5e.a(R.id.iv_low, viewInflate);
                                                                                                                                                                                                                                            if (imageView16 != null) {
                                                                                                                                                                                                                                                i = R.id.iv_low_black;
                                                                                                                                                                                                                                                ImageView imageView17 = (ImageView) h5e.a(R.id.iv_low_black, viewInflate);
                                                                                                                                                                                                                                                if (imageView17 != null) {
                                                                                                                                                                                                                                                    i = R.id.iv_low_red;
                                                                                                                                                                                                                                                    ImageView imageView18 = (ImageView) h5e.a(R.id.iv_low_red, viewInflate);
                                                                                                                                                                                                                                                    if (imageView18 != null) {
                                                                                                                                                                                                                                                        i = R.id.iv_odd;
                                                                                                                                                                                                                                                        ImageView imageView19 = (ImageView) h5e.a(R.id.iv_odd, viewInflate);
                                                                                                                                                                                                                                                        if (imageView19 != null) {
                                                                                                                                                                                                                                                            i = R.id.iv_red;
                                                                                                                                                                                                                                                            ImageView imageView20 = (ImageView) h5e.a(R.id.iv_red, viewInflate);
                                                                                                                                                                                                                                                            if (imageView20 != null) {
                                                                                                                                                                                                                                                                i = R.id.number_1_12;
                                                                                                                                                                                                                                                                TextView textView21 = (TextView) h5e.a(R.id.number_1_12, viewInflate);
                                                                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                                                                    i = R.id.number_13_24;
                                                                                                                                                                                                                                                                    TextView textView22 = (TextView) h5e.a(R.id.number_13_24, viewInflate);
                                                                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                                                                        i = R.id.number_25_36;
                                                                                                                                                                                                                                                                        TextView textView23 = (TextView) h5e.a(R.id.number_25_36, viewInflate);
                                                                                                                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                                                                                                                            i = R.id.number_a;
                                                                                                                                                                                                                                                                            TextView textView24 = (TextView) h5e.a(R.id.number_a, viewInflate);
                                                                                                                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                                                                                                                i = R.id.number_b;
                                                                                                                                                                                                                                                                                TextView textView25 = (TextView) h5e.a(R.id.number_b, viewInflate);
                                                                                                                                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.number_black;
                                                                                                                                                                                                                                                                                    TextView textView26 = (TextView) h5e.a(R.id.number_black, viewInflate);
                                                                                                                                                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.number_c;
                                                                                                                                                                                                                                                                                        TextView textView27 = (TextView) h5e.a(R.id.number_c, viewInflate);
                                                                                                                                                                                                                                                                                        if (textView27 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.number_d;
                                                                                                                                                                                                                                                                                            TextView textView28 = (TextView) h5e.a(R.id.number_d, viewInflate);
                                                                                                                                                                                                                                                                                            if (textView28 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.number_e;
                                                                                                                                                                                                                                                                                                TextView textView29 = (TextView) h5e.a(R.id.number_e, viewInflate);
                                                                                                                                                                                                                                                                                                if (textView29 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.number_even;
                                                                                                                                                                                                                                                                                                    TextView textView30 = (TextView) h5e.a(R.id.number_even, viewInflate);
                                                                                                                                                                                                                                                                                                    if (textView30 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.number_f;
                                                                                                                                                                                                                                                                                                        TextView textView31 = (TextView) h5e.a(R.id.number_f, viewInflate);
                                                                                                                                                                                                                                                                                                        if (textView31 != null) {
                                                                                                                                                                                                                                                                                                            i = R.id.number_green;
                                                                                                                                                                                                                                                                                                            TextView textView32 = (TextView) h5e.a(R.id.number_green, viewInflate);
                                                                                                                                                                                                                                                                                                            if (textView32 != null) {
                                                                                                                                                                                                                                                                                                                i = R.id.number_high;
                                                                                                                                                                                                                                                                                                                TextView textView33 = (TextView) h5e.a(R.id.number_high, viewInflate);
                                                                                                                                                                                                                                                                                                                if (textView33 != null) {
                                                                                                                                                                                                                                                                                                                    i = R.id.number_high_black;
                                                                                                                                                                                                                                                                                                                    TextView textView34 = (TextView) h5e.a(R.id.number_high_black, viewInflate);
                                                                                                                                                                                                                                                                                                                    if (textView34 != null) {
                                                                                                                                                                                                                                                                                                                        i = R.id.number_high_red;
                                                                                                                                                                                                                                                                                                                        TextView textView35 = (TextView) h5e.a(R.id.number_high_red, viewInflate);
                                                                                                                                                                                                                                                                                                                        if (textView35 != null) {
                                                                                                                                                                                                                                                                                                                            i = R.id.number_low;
                                                                                                                                                                                                                                                                                                                            TextView textView36 = (TextView) h5e.a(R.id.number_low, viewInflate);
                                                                                                                                                                                                                                                                                                                            if (textView36 != null) {
                                                                                                                                                                                                                                                                                                                                i = R.id.number_low_black;
                                                                                                                                                                                                                                                                                                                                TextView textView37 = (TextView) h5e.a(R.id.number_low_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                if (textView37 != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.number_low_red;
                                                                                                                                                                                                                                                                                                                                    TextView textView38 = (TextView) h5e.a(R.id.number_low_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                    if (textView38 != null) {
                                                                                                                                                                                                                                                                                                                                        i = R.id.number_odd;
                                                                                                                                                                                                                                                                                                                                        TextView textView39 = (TextView) h5e.a(R.id.number_odd, viewInflate);
                                                                                                                                                                                                                                                                                                                                        if (textView39 != null) {
                                                                                                                                                                                                                                                                                                                                            i = R.id.number_red;
                                                                                                                                                                                                                                                                                                                                            TextView textView40 = (TextView) h5e.a(R.id.number_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                            if (textView40 != null) {
                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_1_12;
                                                                                                                                                                                                                                                                                                                                                TextView textView41 = (TextView) h5e.a(R.id.side_number_1_12, viewInflate);
                                                                                                                                                                                                                                                                                                                                                if (textView41 != null) {
                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_13_24;
                                                                                                                                                                                                                                                                                                                                                    TextView textView42 = (TextView) h5e.a(R.id.side_number_13_24, viewInflate);
                                                                                                                                                                                                                                                                                                                                                    if (textView42 != null) {
                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_25_36;
                                                                                                                                                                                                                                                                                                                                                        TextView textView43 = (TextView) h5e.a(R.id.side_number_25_36, viewInflate);
                                                                                                                                                                                                                                                                                                                                                        if (textView43 != null) {
                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_a;
                                                                                                                                                                                                                                                                                                                                                            TextView textView44 = (TextView) h5e.a(R.id.side_number_a, viewInflate);
                                                                                                                                                                                                                                                                                                                                                            if (textView44 != null) {
                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_b;
                                                                                                                                                                                                                                                                                                                                                                TextView textView45 = (TextView) h5e.a(R.id.side_number_b, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                if (textView45 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_black;
                                                                                                                                                                                                                                                                                                                                                                    TextView textView46 = (TextView) h5e.a(R.id.side_number_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                    if (textView46 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_c;
                                                                                                                                                                                                                                                                                                                                                                        TextView textView47 = (TextView) h5e.a(R.id.side_number_c, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                        if (textView47 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_d;
                                                                                                                                                                                                                                                                                                                                                                            TextView textView48 = (TextView) h5e.a(R.id.side_number_d, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                            if (textView48 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_e;
                                                                                                                                                                                                                                                                                                                                                                                TextView textView49 = (TextView) h5e.a(R.id.side_number_e, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                if (textView49 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_even;
                                                                                                                                                                                                                                                                                                                                                                                    TextView textView50 = (TextView) h5e.a(R.id.side_number_even, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                    if (textView50 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_f;
                                                                                                                                                                                                                                                                                                                                                                                        TextView textView51 = (TextView) h5e.a(R.id.side_number_f, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                        if (textView51 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_green;
                                                                                                                                                                                                                                                                                                                                                                                            TextView textView52 = (TextView) h5e.a(R.id.side_number_green, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                            if (textView52 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_high;
                                                                                                                                                                                                                                                                                                                                                                                                TextView textView53 = (TextView) h5e.a(R.id.side_number_high, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                if (textView53 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_high_black;
                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView54 = (TextView) h5e.a(R.id.side_number_high_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                    if (textView54 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_high_red;
                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView55 = (TextView) h5e.a(R.id.side_number_high_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                        if (textView55 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_low;
                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView56 = (TextView) h5e.a(R.id.side_number_low, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                            if (textView56 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_low_black;
                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView57 = (TextView) h5e.a(R.id.side_number_low_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                if (textView57 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_low_red;
                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView58 = (TextView) h5e.a(R.id.side_number_low_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView58 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_odd;
                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView59 = (TextView) h5e.a(R.id.side_number_odd, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView59 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_red;
                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView60 = (TextView) h5e.a(R.id.side_number_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView60 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_1_12;
                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout21 = (ConstraintLayout) h5e.a(R.id.tv_1_12, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout21 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_13_24;
                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout22 = (ConstraintLayout) h5e.a(R.id.tv_13_24, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout22 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_25_36;
                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout23 = (ConstraintLayout) h5e.a(R.id.tv_25_36, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout23 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_a;
                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout24 = (ConstraintLayout) h5e.a(R.id.tv_a, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout24 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_b;
                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout25 = (ConstraintLayout) h5e.a(R.id.tv_b, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout25 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_black;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout26 = (ConstraintLayout) h5e.a(R.id.tv_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout26 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_c;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout27 = (ConstraintLayout) h5e.a(R.id.tv_c, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout27 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_d;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout28 = (ConstraintLayout) h5e.a(R.id.tv_d, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout28 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_e;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout29 = (ConstraintLayout) h5e.a(R.id.tv_e, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout29 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_even;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout30 = (ConstraintLayout) h5e.a(R.id.tv_even, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout30 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_f;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout31 = (ConstraintLayout) h5e.a(R.id.tv_f, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout31 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_green;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout32 = (ConstraintLayout) h5e.a(R.id.tv_green, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout32 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_high;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout33 = (ConstraintLayout) h5e.a(R.id.tv_high, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout33 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_high_black;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout34 = (ConstraintLayout) h5e.a(R.id.tv_high_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout34 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_high_red;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout35 = (ConstraintLayout) h5e.a(R.id.tv_high_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout35 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_low;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout36 = (ConstraintLayout) h5e.a(R.id.tv_low, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout36 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_low_black;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout37 = (ConstraintLayout) h5e.a(R.id.tv_low_black, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout37 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_low_red;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout38 = (ConstraintLayout) h5e.a(R.id.tv_low_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout38 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_odd;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout39 = (ConstraintLayout) h5e.a(R.id.tv_odd, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout39 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_red;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout40 = (ConstraintLayout) h5e.a(R.id.tv_red, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout40 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                yp80 yp80Var = new yp80((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, constraintLayout7, constraintLayout8, constraintLayout9, constraintLayout10, constraintLayout11, constraintLayout12, constraintLayout13, constraintLayout14, constraintLayout15, constraintLayout16, constraintLayout17, constraintLayout18, constraintLayout19, constraintLayout20, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, constraintLayout21, constraintLayout22, constraintLayout23, constraintLayout24, constraintLayout25, constraintLayout26, constraintLayout27, constraintLayout28, constraintLayout29, constraintLayout30, constraintLayout31, constraintLayout32, constraintLayout33, constraintLayout34, constraintLayout35, constraintLayout36, constraintLayout37, constraintLayout38, constraintLayout39, constraintLayout40);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                this.F = yp80Var;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (attributeSet != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.q);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    typedArrayObtainStyledAttributes.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    typedArrayObtainStyledAttributes.recycle();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                E(b.k(yp80Var.e0, yp80Var.f0, yp80Var.g0), 1.17f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                E(b.k(yp80Var.n0, yp80Var.w0), 1.15f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView21 = yp80Var.x0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView22 = yp80Var.j0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView23 = yp80Var.p0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                E(b.k(imageView21, imageView22, imageView23), 1.16f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView24 = yp80Var.h0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView25 = yp80Var.i0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView26 = yp80Var.k0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView27 = yp80Var.l0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView28 = yp80Var.m0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView29 = yp80Var.o0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                E(b.k(imageView24, imageView25, imageView26, imageView27, imageView28, imageView29), 1.22f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                E(b.k(yp80Var.t0, yp80Var.q0), 1.14f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView30 = yp80Var.v0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView31 = yp80Var.u0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView32 = yp80Var.s0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView33 = yp80Var.r0;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                E(b.k(imageView30, imageView31, imageView32, imageView33), 1.18f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView[] imageViewArr = {imageView21, imageView22, imageView30, imageView31, imageView32, imageView33, imageView23, imageView24, imageView25, imageView26, imageView27, imageView28, imageView29};
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                for (int i2 = 0; i2 < 13; i2++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView34 = imageViewArr[i2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (imageView34 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        imageView34.setElevation(2.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                return;
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static void E(List list, float f) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            if (imageView != null) {
                imageView.setScaleX(f);
                imageView.setScaleY(1.41f);
            }
        }
    }

    public static boolean F(View view, Function1 function1) {
        Object tag = view.getTag();
        LocalGameDetailsEntity localGameDetailsEntity = tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null;
        if (localGameDetailsEntity != null) {
            return ((Boolean) function1.invoke(localGameDetailsEntity)).booleanValue();
        }
        return true;
    }

    public static void I(View view, Function2 function2) {
        Object tag = view.getTag();
        function2.invoke(tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setButtonBoardData$default(Spin2WinButtonBoard spin2WinButtonBoard, List list, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        if ((i & 4) != 0) {
            str = AnalyticsParam.DATA_NORMAL;
        }
        spin2WinButtonBoard.setButtonBoardData(list, arrayList, str);
    }

    public final void G(ImageView imageView, LocalGameDetailsEntity localGameDetailsEntity) {
        Integer num;
        Integer num2;
        Double betAmount;
        yp80 yp80Var = this.F;
        if (yp80Var != null) {
            yp80Var.e0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.f0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.g0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.n0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.w0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.x0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.j0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.t0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.q0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.v0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.u0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.s0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.r0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.h0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.i0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.k0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.l0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.m0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.o0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.p0.setVisibility(4);
        }
        int iIntValue = 0;
        if (((localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue()) > 0.0d) {
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        v4b0 v4b0Var = this.G;
        if (((v4b0Var == null || (num2 = v4b0Var.c) == null) ? 0 : num2.intValue()) > 0) {
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        v4b0 v4b0Var2 = this.G;
        if (v4b0Var2 != null && (num = v4b0Var2.c) != null) {
            iIntValue = num.intValue();
        }
        if (iIntValue == 0) {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        } else if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    public final void H(ConstraintLayout constraintLayout) {
        yp80 yp80Var = this.F;
        if (yp80Var != null) {
            yp80Var.m1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.n1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.o1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.v1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.E1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.B1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.y1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.p1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.q1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.s1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.t1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.u1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (yp80Var != null) {
            yp80Var.w1.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_white_board));
        }
        if (constraintLayout != null) {
            constraintLayout.setBackground(getContext().getDrawable(R.drawable.sg_spin2win_dark_board));
        }
    }

    public final void J() {
        yp80 yp80Var = this.F;
        if (yp80Var != null) {
            yp80Var.e0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.f0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.g0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.n0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.w0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.x0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.j0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.t0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.q0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.v0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.u0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.s0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.r0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.h0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.i0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.k0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.l0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.m0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.o0.setVisibility(4);
        }
        if (yp80Var != null) {
            yp80Var.p0.setVisibility(4);
        }
    }

    public final void K(ConstraintLayout constraintLayout) {
        View view;
        Context context = getContext();
        if (context == null || constraintLayout == null || LayoutInflater.from(context) == null || (view = this.I) == null) {
            return;
        }
        constraintLayout.removeView(view);
    }

    public final void L(TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, LocalGameDetailsEntity localGameDetailsEntity, ArrayList<Double> arrayList, String str) {
        Double betAmount;
        Double betAmount2;
        Double betAmount3;
        double dDoubleValue = 0.0d;
        if (((localGameDetailsEntity == null || (betAmount3 = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount3.doubleValue()) > 0.0d) {
            List<String> allBetAmountList = localGameDetailsEntity != null ? localGameDetailsEntity.getAllBetAmountList() : null;
            if (allBetAmountList != null && !allBetAmountList.isEmpty()) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                if (textView3 != null) {
                    textView3.setText(lxa0.a((localGameDetailsEntity == null || (betAmount2 = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount2.doubleValue()));
                }
                if (!Intrinsics.g(str, AnalyticsParam.DATA_NORMAL)) {
                    Toast.makeText(getContext(), "FBG chip type", 0).show();
                    return;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                if (localGameDetailsEntity != null && (betAmount = localGameDetailsEntity.getBetAmount()) != null) {
                    dDoubleValue = betAmount.doubleValue();
                }
                Context context = getContext();
                if (context != null) {
                    String strA = arrayList.isEmpty() ? "red" : jk2.a(dDoubleValue, arrayList);
                    if (constraintLayout != null) {
                        Map<Double, String> map = jk2.a;
                        strA.getClass();
                        Integer num = jk2.b.get(strA);
                        constraintLayout.setBackground(context.getDrawable(num != null ? num.intValue() : -1));
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
    }

    public final void M(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, LocalGameDetailsEntity localGameDetailsEntity) {
        TextView textView3;
        Double betAmount;
        Context context = getContext();
        if (context != null) {
            if (textView != null) {
                textView.setVisibility(4);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(4);
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            if (layoutInflaterFrom != null) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_fbg_s2w, (ViewGroup) constraintLayout, false);
                this.I = viewInflate;
                if (constraintLayout != null) {
                    constraintLayout.addView(viewInflate);
                }
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.f(constraintLayout);
                View view = this.I;
                bVar.h(view != null ? view.getId() : 0, 4, 0, 4, 2);
                View view2 = this.I;
                bVar.h(view2 != null ? view2.getId() : 0, 7, 0, 7, 10);
                bVar.b(constraintLayout);
                View view3 = this.I;
                if (view3 == null || (textView3 = (TextView) view3.findViewById(R.id.tv_fbg_s2w)) == null) {
                    return;
                }
                double dDoubleValue = (localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue();
                String str = "0.00";
                String str2 = true & true ? "0.00" : null;
                str2.getClass();
                try {
                    String str3 = new DecimalFormat(str2, SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                    str3.getClass();
                    str = str3;
                } catch (Exception unused) {
                }
                textView3.setText(str);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v19, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v21, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v23, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v33, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v37, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v39, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v15, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v17, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v23, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v25, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v27, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v29, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v31, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v33, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v35, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v37, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v39, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.sportygames.spin2win.components.Spin2WinButtonBoard] */
    public final void N(LocalGameDetailsEntity localGameDetailsEntity, ArrayList<Double> arrayList, String str) {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String betType;
        String lowerCase4;
        String lowerCase5;
        String category = localGameDetailsEntity != null ? localGameDetailsEntity.getCategory() : null;
        if (category != null) {
            int iHashCode = category.hashCode();
            yp80 yp80Var = this.F;
            switch (iHashCode) {
                case -1852945562:
                    if (category.equals("SECTOR")) {
                        String betType2 = localGameDetailsEntity.getBetType();
                        if (betType2 != null) {
                            lowerCase = betType2.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        } else {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            switch (lowerCase.hashCode()) {
                                case 97:
                                    if (lowerCase.equals("a")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.B0 : null, yp80Var != null ? yp80Var.V0 : null, yp80Var != null ? yp80Var.N : null, yp80Var != null ? yp80Var.e : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.p1 : null, yp80Var != null ? yp80Var.B0 : null, yp80Var != null ? yp80Var.V0 : null, yp80Var != null ? yp80Var.N : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case 98:
                                    if (lowerCase.equals("b")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.C0 : null, yp80Var != null ? yp80Var.W0 : null, yp80Var != null ? yp80Var.O : null, yp80Var != null ? yp80Var.f : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.q1 : null, yp80Var != null ? yp80Var.C0 : null, yp80Var != null ? yp80Var.W0 : null, yp80Var != null ? yp80Var.O : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case 99:
                                    if (lowerCase.equals("c")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.E0 : null, yp80Var != null ? yp80Var.Y0 : null, yp80Var != null ? yp80Var.Q : null, yp80Var != null ? yp80Var.v : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.s1 : null, yp80Var != null ? yp80Var.E0 : null, yp80Var != null ? yp80Var.Y0 : null, yp80Var != null ? yp80Var.Q : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case 100:
                                    if (lowerCase.equals("d")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.F0 : null, yp80Var != null ? yp80Var.Z0 : null, yp80Var != null ? yp80Var.R : null, yp80Var != null ? yp80Var.w : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.t1 : null, yp80Var != null ? yp80Var.F0 : null, yp80Var != null ? yp80Var.Z0 : null, yp80Var != null ? yp80Var.R : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                    if (lowerCase.equals("e")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.G0 : null, yp80Var != null ? yp80Var.a1 : null, yp80Var != null ? yp80Var.S : null, yp80Var != null ? yp80Var.y : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.u1 : null, yp80Var != null ? yp80Var.G0 : null, yp80Var != null ? yp80Var.a1 : null, yp80Var != null ? yp80Var.S : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                    if (lowerCase.equals("f")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.I0 : null, yp80Var != null ? yp80Var.c1 : null, yp80Var != null ? yp80Var.U : null, yp80Var != null ? yp80Var.A : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.w1 : null, yp80Var != null ? yp80Var.I0 : null, yp80Var != null ? yp80Var.c1 : null, yp80Var != null ? yp80Var.U : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case -901346537:
                    if (category.equals("HIGH_LOW")) {
                        String betType3 = localGameDetailsEntity.getBetType();
                        if (betType3 != null) {
                            lowerCase2 = betType3.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                        } else {
                            lowerCase2 = null;
                        }
                        if (!Intrinsics.g(lowerCase2, "high")) {
                            if (Intrinsics.g(lowerCase2, "low")) {
                                if (!str.equals("fbg")) {
                                    L(yp80Var != null ? yp80Var.N0 : null, yp80Var != null ? yp80Var.h1 : null, yp80Var != null ? yp80Var.Z : null, yp80Var != null ? yp80Var.F : null, localGameDetailsEntity, arrayList, str);
                                } else {
                                    M(yp80Var != null ? yp80Var.B1 : null, yp80Var != null ? yp80Var.N0 : null, yp80Var != null ? yp80Var.h1 : null, yp80Var != null ? yp80Var.Z : null, localGameDetailsEntity);
                                }
                            }
                        } else if (!str.equals("fbg")) {
                            L(yp80Var != null ? yp80Var.K0 : null, yp80Var != null ? yp80Var.e1 : null, yp80Var != null ? yp80Var.W : null, yp80Var != null ? yp80Var.C : null, localGameDetailsEntity, arrayList, str);
                        } else {
                            M(yp80Var != null ? yp80Var.y1 : null, yp80Var != null ? yp80Var.K0 : null, yp80Var != null ? yp80Var.e1 : null, yp80Var != null ? yp80Var.W : null, localGameDetailsEntity);
                        }
                        break;
                    }
                    break;
                case -338441228:
                    if (category.equals("HIGH_LOW_COLOUR")) {
                        String betType4 = localGameDetailsEntity.getBetType();
                        if (betType4 != null) {
                            lowerCase3 = betType4.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                        } else {
                            lowerCase3 = null;
                        }
                        if (lowerCase3 != null) {
                            switch (lowerCase3.hashCode()) {
                                case -1684921228:
                                    if (lowerCase3.equals("high_red")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.M0 : null, yp80Var != null ? yp80Var.g1 : null, yp80Var != null ? yp80Var.Y : null, yp80Var != null ? yp80Var.E : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.A1 : null, yp80Var != null ? yp80Var.M0 : null, yp80Var != null ? yp80Var.g1 : null, yp80Var != null ? yp80Var.Y : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case -700790956:
                                    if (lowerCase3.equals("low_black")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.O0 : null, yp80Var != null ? yp80Var.i1 : null, yp80Var != null ? yp80Var.a0 : null, yp80Var != null ? yp80Var.G : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.C1 : null, yp80Var != null ? yp80Var.O0 : null, yp80Var != null ? yp80Var.i1 : null, yp80Var != null ? yp80Var.a0 : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case -21197022:
                                    if (lowerCase3.equals("high_black")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.L0 : null, yp80Var != null ? yp80Var.f1 : null, yp80Var != null ? yp80Var.X : null, yp80Var != null ? yp80Var.D : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.z1 : null, yp80Var != null ? yp80Var.L0 : null, yp80Var != null ? yp80Var.f1 : null, yp80Var != null ? yp80Var.X : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                                case 356827430:
                                    if (lowerCase3.equals("low_red")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.P0 : null, yp80Var != null ? yp80Var.j1 : null, yp80Var != null ? yp80Var.b0 : null, yp80Var != null ? yp80Var.H : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.D1 : null, yp80Var != null ? yp80Var.P0 : null, yp80Var != null ? yp80Var.j1 : null, yp80Var != null ? yp80Var.b0 : null, localGameDetailsEntity);
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                case 65241624:
                    if (category.equals("DOZEN") && (betType = localGameDetailsEntity.getBetType()) != null) {
                        int iHashCode2 = betType.hashCode();
                        if (iHashCode2 != 1504573) {
                            if (iHashCode2 != 46816717) {
                                if (iHashCode2 == 47799853 && betType.equals("25-36")) {
                                    if (!str.equals("fbg")) {
                                        L(yp80Var != null ? yp80Var.A0 : null, yp80Var != null ? yp80Var.U0 : null, yp80Var != null ? yp80Var.M : null, yp80Var != null ? yp80Var.d : null, localGameDetailsEntity, arrayList, str);
                                    } else {
                                        M(yp80Var != null ? yp80Var.o1 : null, yp80Var != null ? yp80Var.A0 : null, yp80Var != null ? yp80Var.U0 : null, yp80Var != null ? yp80Var.M : null, localGameDetailsEntity);
                                    }
                                }
                                break;
                            } else if (betType.equals("13-24")) {
                                if (!str.equals("fbg")) {
                                    L(yp80Var != null ? yp80Var.z0 : null, yp80Var != null ? yp80Var.T0 : null, yp80Var != null ? yp80Var.L : null, yp80Var != null ? yp80Var.c : null, localGameDetailsEntity, arrayList, str);
                                } else {
                                    M(yp80Var != null ? yp80Var.n1 : null, yp80Var != null ? yp80Var.z0 : null, yp80Var != null ? yp80Var.T0 : null, yp80Var != null ? yp80Var.L : null, localGameDetailsEntity);
                                }
                                break;
                            }
                        } else {
                            if (betType.equals("1-12")) {
                                if (!str.equals("fbg")) {
                                    L(yp80Var != null ? yp80Var.y0 : null, yp80Var != null ? yp80Var.S0 : null, yp80Var != null ? yp80Var.K : null, yp80Var != null ? yp80Var.b : null, localGameDetailsEntity, arrayList, str);
                                } else {
                                    M(yp80Var != null ? yp80Var.m1 : null, yp80Var != null ? yp80Var.y0 : null, yp80Var != null ? yp80Var.S0 : null, yp80Var != null ? yp80Var.K : null, localGameDetailsEntity);
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 1061088362:
                    if (category.equals("EVEN_ODD")) {
                        String betType5 = localGameDetailsEntity.getBetType();
                        if (betType5 != null) {
                            lowerCase4 = betType5.toLowerCase(Locale.ROOT);
                            lowerCase4.getClass();
                        } else {
                            lowerCase4 = null;
                        }
                        if (!Intrinsics.g(lowerCase4, "even")) {
                            if (Intrinsics.g(lowerCase4, "odd")) {
                                if (!str.equals("fbg")) {
                                    L(yp80Var != null ? yp80Var.Q0 : null, yp80Var != null ? yp80Var.k1 : null, yp80Var != null ? yp80Var.c0 : null, yp80Var != null ? yp80Var.I : null, localGameDetailsEntity, arrayList, str);
                                } else {
                                    M(yp80Var != null ? yp80Var.E1 : null, yp80Var != null ? yp80Var.Q0 : null, yp80Var != null ? yp80Var.k1 : null, yp80Var != null ? yp80Var.c0 : null, localGameDetailsEntity);
                                }
                            }
                        } else if (!str.equals("fbg")) {
                            L(yp80Var != null ? yp80Var.H0 : null, yp80Var != null ? yp80Var.b1 : null, yp80Var != null ? yp80Var.T : null, yp80Var != null ? yp80Var.z : null, localGameDetailsEntity, arrayList, str);
                        } else {
                            M(yp80Var != null ? yp80Var.v1 : null, yp80Var != null ? yp80Var.H0 : null, yp80Var != null ? yp80Var.b1 : null, yp80Var != null ? yp80Var.T : null, localGameDetailsEntity);
                        }
                        break;
                    }
                    break;
                case 1993454028:
                    if (category.equals("COLOUR")) {
                        String betType6 = localGameDetailsEntity.getBetType();
                        if (betType6 != null) {
                            lowerCase5 = betType6.toLowerCase(Locale.ROOT);
                            lowerCase5.getClass();
                        } else {
                            lowerCase5 = null;
                        }
                        if (lowerCase5 != null) {
                            int iHashCode3 = lowerCase5.hashCode();
                            if (iHashCode3 != 112785) {
                                if (iHashCode3 != 93818879) {
                                    if (iHashCode3 == 98619139 && lowerCase5.equals("green")) {
                                        if (!str.equals("fbg")) {
                                            L(yp80Var != null ? yp80Var.J0 : null, yp80Var != null ? yp80Var.d1 : null, yp80Var != null ? yp80Var.V : null, yp80Var != null ? yp80Var.B : null, localGameDetailsEntity, arrayList, str);
                                        } else {
                                            M(yp80Var != null ? yp80Var.x1 : null, yp80Var != null ? yp80Var.J0 : null, yp80Var != null ? yp80Var.d1 : null, yp80Var != null ? yp80Var.V : null, localGameDetailsEntity);
                                        }
                                    }
                                    break;
                                } else if (lowerCase5.equals("black")) {
                                    if (!str.equals("fbg")) {
                                        L(yp80Var != null ? yp80Var.D0 : null, yp80Var != null ? yp80Var.X0 : null, yp80Var != null ? yp80Var.P : null, yp80Var != null ? yp80Var.i : null, localGameDetailsEntity, arrayList, str);
                                    } else {
                                        M(yp80Var != null ? yp80Var.r1 : null, yp80Var != null ? yp80Var.D0 : null, yp80Var != null ? yp80Var.X0 : null, yp80Var != null ? yp80Var.P : null, localGameDetailsEntity);
                                    }
                                    break;
                                }
                            } else if (lowerCase5.equals("red")) {
                                if (!str.equals("fbg")) {
                                    L(yp80Var != null ? yp80Var.R0 : null, yp80Var != null ? yp80Var.l1 : null, yp80Var != null ? yp80Var.d0 : null, yp80Var != null ? yp80Var.J : null, localGameDetailsEntity, arrayList, str);
                                } else {
                                    M(yp80Var != null ? yp80Var.F1 : null, yp80Var != null ? yp80Var.R0 : null, yp80Var != null ? yp80Var.l1 : null, yp80Var != null ? yp80Var.d0 : null, localGameDetailsEntity);
                                }
                                break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    public final boolean getFbgApplied() {
        return this.fbgApplied;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setButtonBoardData(List<LocalGameDetailsEntity> data, ArrayList<Double> betChipList, String chipType) {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String betType;
        String lowerCase4;
        String lowerCase5;
        chipType.getClass();
        if (data == null || data.isEmpty()) {
            return;
        }
        int size = data.size();
        for (int i = 0; i < size; i++) {
            String category = data.get(i).getCategory();
            if (category != null) {
                int iHashCode = category.hashCode();
                yp80 yp80Var = this.F;
                switch (iHashCode) {
                    case -1852945562:
                        if (!category.equals("SECTOR")) {
                            break;
                        } else {
                            String betType2 = data.get(i).getBetType();
                            if (betType2 != null) {
                                lowerCase = betType2.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = null;
                            }
                            if (lowerCase == null) {
                                break;
                            } else {
                                switch (lowerCase.hashCode()) {
                                    case 97:
                                        if (lowerCase.equals("a")) {
                                            if (yp80Var != null) {
                                                yp80Var.p1.setTag(data.get(i));
                                                Unit unit = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.B0);
                                                Unit unit2 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.V0);
                                                Unit unit3 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.B0 : null, yp80Var != null ? yp80Var.V0 : null, yp80Var != null ? yp80Var.N : null, yp80Var != null ? yp80Var.e : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.p1 : null);
                                        }
                                        break;
                                    case 98:
                                        if (lowerCase.equals("b")) {
                                            if (yp80Var != null) {
                                                yp80Var.q1.setTag(data.get(i));
                                                Unit unit4 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.C0);
                                                Unit unit5 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.W0);
                                                Unit unit6 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.C0 : null, yp80Var != null ? yp80Var.W0 : null, yp80Var != null ? yp80Var.O : null, yp80Var != null ? yp80Var.f : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.q1 : null);
                                        }
                                        break;
                                    case 99:
                                        if (lowerCase.equals("c")) {
                                            if (yp80Var != null) {
                                                yp80Var.s1.setTag(data.get(i));
                                                Unit unit7 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.E0);
                                                Unit unit8 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.Y0);
                                                Unit unit9 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.E0 : null, yp80Var != null ? yp80Var.Y0 : null, yp80Var != null ? yp80Var.Q : null, yp80Var != null ? yp80Var.v : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.s1 : null);
                                        }
                                        break;
                                    case 100:
                                        if (lowerCase.equals("d")) {
                                            if (yp80Var != null) {
                                                yp80Var.t1.setTag(data.get(i));
                                                Unit unit10 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.F0);
                                                Unit unit11 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.Z0);
                                                Unit unit12 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.F0 : null, yp80Var != null ? yp80Var.Z0 : null, yp80Var != null ? yp80Var.R : null, yp80Var != null ? yp80Var.w : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.t1 : null);
                                        }
                                        break;
                                    case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                        if (lowerCase.equals("e")) {
                                            if (yp80Var != null) {
                                                yp80Var.u1.setTag(data.get(i));
                                                Unit unit13 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.G0);
                                                Unit unit14 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.a1);
                                                Unit unit15 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.G0 : null, yp80Var != null ? yp80Var.a1 : null, yp80Var != null ? yp80Var.S : null, yp80Var != null ? yp80Var.y : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.u1 : null);
                                        }
                                        break;
                                    case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                        if (lowerCase.equals("f")) {
                                            if (yp80Var != null) {
                                                yp80Var.w1.setTag(data.get(i));
                                                Unit unit16 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.I0);
                                                Unit unit17 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                kya0.a(data.get(i), yp80Var.c1);
                                                Unit unit18 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.I0 : null, yp80Var != null ? yp80Var.c1 : null, yp80Var != null ? yp80Var.U : null, yp80Var != null ? yp80Var.A : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.w1 : null);
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    case -901346537:
                        if (category.equals("HIGH_LOW")) {
                            String betType3 = data.get(i).getBetType();
                            if (betType3 != null) {
                                lowerCase2 = betType3.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                            } else {
                                lowerCase2 = null;
                            }
                            if (Intrinsics.g(lowerCase2, "high")) {
                                if (yp80Var != null) {
                                    yp80Var.y1.setTag(data.get(i));
                                    Unit unit19 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView = yp80Var.K0;
                                    op5 op5Var = op5.a;
                                    Context context = getContext();
                                    String string = context != null ? context.getString(R.string.key_high) : null;
                                    if (string == null) {
                                        string = "";
                                    }
                                    textView.setText(op5.c(op5Var, string, String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit20 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView2 = yp80Var.e1;
                                    op5 op5Var2 = op5.a;
                                    Context context2 = getContext();
                                    String string2 = context2 != null ? context2.getString(R.string.key_high) : null;
                                    textView2.setText(op5.c(op5Var2, string2 != null ? string2 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit21 = Unit.a;
                                }
                                L(yp80Var != null ? yp80Var.K0 : null, yp80Var != null ? yp80Var.e1 : null, yp80Var != null ? yp80Var.W : null, yp80Var != null ? yp80Var.C : null, data.get(i), betChipList, chipType);
                                K(yp80Var != null ? yp80Var.y1 : null);
                            } else if (Intrinsics.g(lowerCase2, "low")) {
                                if (yp80Var != null) {
                                    yp80Var.B1.setTag(data.get(i));
                                    Unit unit22 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView3 = yp80Var.N0;
                                    op5 op5Var3 = op5.a;
                                    Context context3 = getContext();
                                    String string3 = context3 != null ? context3.getString(R.string.key_low) : null;
                                    if (string3 == null) {
                                        string3 = "";
                                    }
                                    textView3.setText(op5.c(op5Var3, string3, String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit23 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView4 = yp80Var.h1;
                                    op5 op5Var4 = op5.a;
                                    Context context4 = getContext();
                                    String string4 = context4 != null ? context4.getString(R.string.key_low) : null;
                                    textView4.setText(op5.c(op5Var4, string4 != null ? string4 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit24 = Unit.a;
                                }
                                L(yp80Var != null ? yp80Var.N0 : null, yp80Var != null ? yp80Var.h1 : null, yp80Var != null ? yp80Var.Z : null, yp80Var != null ? yp80Var.F : null, data.get(i), betChipList, chipType);
                                K(yp80Var != null ? yp80Var.B1 : null);
                            }
                        }
                        break;
                    case -338441228:
                        if (!category.equals("HIGH_LOW_COLOUR")) {
                            break;
                        } else {
                            String betType4 = data.get(i).getBetType();
                            if (betType4 != null) {
                                lowerCase3 = betType4.toLowerCase(Locale.ROOT);
                                lowerCase3.getClass();
                            } else {
                                lowerCase3 = null;
                            }
                            if (lowerCase3 == null) {
                                break;
                            } else {
                                switch (lowerCase3.hashCode()) {
                                    case -1684921228:
                                        if (lowerCase3.equals("high_red")) {
                                            if (yp80Var != null) {
                                                yp80Var.A1.setTag(data.get(i));
                                                Unit unit25 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.A1.setBackgroundColor(getContext().getColor(R.color.sg_color_e41826));
                                                Unit unit26 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView5 = yp80Var.M0;
                                                op5 op5Var5 = op5.a;
                                                Context context5 = getContext();
                                                String string5 = context5 != null ? context5.getString(R.string.key_high_red) : null;
                                                if (string5 == null) {
                                                    string5 = "";
                                                }
                                                textView5.setText(c.p(op5.c(op5Var5, string5, String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit27 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView6 = yp80Var.g1;
                                                op5 op5Var6 = op5.a;
                                                Context context6 = getContext();
                                                String string6 = context6 != null ? context6.getString(R.string.key_high_red) : null;
                                                textView6.setText(c.p(op5.c(op5Var6, string6 != null ? string6 : "", String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit28 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.M0 : null, yp80Var != null ? yp80Var.g1 : null, yp80Var != null ? yp80Var.Y : null, yp80Var != null ? yp80Var.E : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.A1 : null);
                                        }
                                        break;
                                    case -700790956:
                                        if (lowerCase3.equals("low_black")) {
                                            if (yp80Var != null) {
                                                yp80Var.C1.setTag(data.get(i));
                                                Unit unit29 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.C1.setBackgroundColor(getContext().getColor(R.color.sg_color_1c1e25));
                                                Unit unit30 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView7 = yp80Var.O0;
                                                op5 op5Var7 = op5.a;
                                                Context context7 = getContext();
                                                String string7 = context7 != null ? context7.getString(R.string.key_low_black) : null;
                                                if (string7 == null) {
                                                    string7 = "";
                                                }
                                                textView7.setText(c.p(op5.c(op5Var7, string7, String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit31 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView8 = yp80Var.i1;
                                                op5 op5Var8 = op5.a;
                                                Context context8 = getContext();
                                                String string8 = context8 != null ? context8.getString(R.string.key_low_black) : null;
                                                textView8.setText(c.p(op5.c(op5Var8, string8 != null ? string8 : "", String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit32 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.O0 : null, yp80Var != null ? yp80Var.i1 : null, yp80Var != null ? yp80Var.a0 : null, yp80Var != null ? yp80Var.G : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.C1 : null);
                                        }
                                        break;
                                    case -21197022:
                                        if (lowerCase3.equals("high_black")) {
                                            if (yp80Var != null) {
                                                yp80Var.z1.setTag(data.get(i));
                                                Unit unit33 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.z1.setBackgroundColor(getContext().getColor(R.color.sg_color_1c1e25));
                                                Unit unit34 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView9 = yp80Var.L0;
                                                op5 op5Var9 = op5.a;
                                                Context context9 = getContext();
                                                String string9 = context9 != null ? context9.getString(R.string.key_high_black) : null;
                                                if (string9 == null) {
                                                    string9 = "";
                                                }
                                                textView9.setText(c.p(op5.c(op5Var9, string9, String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit35 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView10 = yp80Var.f1;
                                                op5 op5Var10 = op5.a;
                                                Context context10 = getContext();
                                                String string10 = context10 != null ? context10.getString(R.string.key_high_black) : null;
                                                textView10.setText(c.p(op5.c(op5Var10, string10 != null ? string10 : "", String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit36 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.L0 : null, yp80Var != null ? yp80Var.f1 : null, yp80Var != null ? yp80Var.X : null, yp80Var != null ? yp80Var.D : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.z1 : null);
                                        }
                                        break;
                                    case 356827430:
                                        if (lowerCase3.equals("low_red")) {
                                            if (yp80Var != null) {
                                                yp80Var.D1.setTag(data.get(i));
                                                Unit unit37 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.D1.setBackgroundColor(getContext().getColor(R.color.sg_color_e41826));
                                                Unit unit38 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView11 = yp80Var.P0;
                                                op5 op5Var11 = op5.a;
                                                Context context11 = getContext();
                                                String string11 = context11 != null ? context11.getString(R.string.key_low_red) : null;
                                                if (string11 == null) {
                                                    string11 = "";
                                                }
                                                textView11.setText(c.p(op5.c(op5Var11, string11, String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit39 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView12 = yp80Var.j1;
                                                op5 op5Var12 = op5.a;
                                                Context context12 = getContext();
                                                String string12 = context12 != null ? context12.getString(R.string.key_low_red) : null;
                                                textView12.setText(c.p(op5.c(op5Var12, string12 != null ? string12 : "", String.valueOf(data.get(i).getLocalizedTitle())), " ", "\n", false));
                                                Unit unit40 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.P0 : null, yp80Var != null ? yp80Var.j1 : null, yp80Var != null ? yp80Var.b0 : null, yp80Var != null ? yp80Var.H : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.D1 : null);
                                        }
                                        break;
                                }
                            }
                        }
                        break;
                    case 65241624:
                        if (category.equals("DOZEN") && (betType = data.get(i).getBetType()) != null) {
                            int iHashCode2 = betType.hashCode();
                            if (iHashCode2 != 1504573) {
                                if (iHashCode2 != 46816717) {
                                    if (iHashCode2 == 47799853 && betType.equals("25-36")) {
                                        if (yp80Var != null) {
                                            yp80Var.o1.setTag(data.get(i));
                                            Unit unit41 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            kya0.a(data.get(i), yp80Var.A0);
                                            Unit unit42 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            kya0.a(data.get(i), yp80Var.U0);
                                            Unit unit43 = Unit.a;
                                        }
                                        L(yp80Var != null ? yp80Var.A0 : null, yp80Var != null ? yp80Var.U0 : null, yp80Var != null ? yp80Var.M : null, yp80Var != null ? yp80Var.d : null, data.get(i), betChipList, chipType);
                                        K(yp80Var != null ? yp80Var.o1 : null);
                                    }
                                } else if (betType.equals("13-24")) {
                                    if (yp80Var != null) {
                                        yp80Var.n1.setTag(data.get(i));
                                        Unit unit44 = Unit.a;
                                    }
                                    if (yp80Var != null) {
                                        kya0.a(data.get(i), yp80Var.z0);
                                        Unit unit45 = Unit.a;
                                    }
                                    if (yp80Var != null) {
                                        kya0.a(data.get(i), yp80Var.T0);
                                        Unit unit46 = Unit.a;
                                    }
                                    L(yp80Var != null ? yp80Var.z0 : null, yp80Var != null ? yp80Var.T0 : null, yp80Var != null ? yp80Var.L : null, yp80Var != null ? yp80Var.c : null, data.get(i), betChipList, chipType);
                                    K(yp80Var != null ? yp80Var.n1 : null);
                                }
                            } else if (betType.equals("1-12")) {
                                if (yp80Var != null) {
                                    yp80Var.m1.setTag(data.get(i));
                                    Unit unit47 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    kya0.a(data.get(i), yp80Var.y0);
                                    Unit unit48 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    kya0.a(data.get(i), yp80Var.S0);
                                    Unit unit49 = Unit.a;
                                }
                                L(yp80Var != null ? yp80Var.y0 : null, yp80Var != null ? yp80Var.S0 : null, yp80Var != null ? yp80Var.K : null, yp80Var != null ? yp80Var.b : null, data.get(i), betChipList, chipType);
                                K(yp80Var != null ? yp80Var.m1 : null);
                            }
                        }
                        break;
                    case 1061088362:
                        if (category.equals("EVEN_ODD")) {
                            String betType5 = data.get(i).getBetType();
                            if (betType5 != null) {
                                lowerCase4 = betType5.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                            } else {
                                lowerCase4 = null;
                            }
                            if (Intrinsics.g(lowerCase4, "even")) {
                                if (yp80Var != null) {
                                    yp80Var.v1.setTag(data.get(i));
                                    Unit unit50 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView13 = yp80Var.H0;
                                    op5 op5Var13 = op5.a;
                                    Context context13 = getContext();
                                    String string13 = context13 != null ? context13.getString(R.string.key_even) : null;
                                    if (string13 == null) {
                                        string13 = "";
                                    }
                                    textView13.setText(op5.c(op5Var13, string13, String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit51 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView14 = yp80Var.b1;
                                    op5 op5Var14 = op5.a;
                                    Context context14 = getContext();
                                    String string14 = context14 != null ? context14.getString(R.string.key_even) : null;
                                    textView14.setText(op5.c(op5Var14, string14 != null ? string14 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit52 = Unit.a;
                                }
                                L(yp80Var != null ? yp80Var.H0 : null, yp80Var != null ? yp80Var.b1 : null, yp80Var != null ? yp80Var.T : null, yp80Var != null ? yp80Var.z : null, data.get(i), betChipList, chipType);
                                K(yp80Var != null ? yp80Var.v1 : null);
                            } else if (Intrinsics.g(lowerCase4, "odd")) {
                                if (yp80Var != null) {
                                    yp80Var.E1.setTag(data.get(i));
                                    Unit unit53 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView15 = yp80Var.Q0;
                                    op5 op5Var15 = op5.a;
                                    Context context15 = getContext();
                                    String string15 = context15 != null ? context15.getString(R.string.key_odd) : null;
                                    if (string15 == null) {
                                        string15 = "";
                                    }
                                    textView15.setText(op5.c(op5Var15, string15, String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit54 = Unit.a;
                                }
                                if (yp80Var != null) {
                                    TextView textView16 = yp80Var.k1;
                                    op5 op5Var16 = op5.a;
                                    Context context16 = getContext();
                                    String string16 = context16 != null ? context16.getString(R.string.key_odd) : null;
                                    textView16.setText(op5.c(op5Var16, string16 != null ? string16 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                    Unit unit55 = Unit.a;
                                }
                                L(yp80Var != null ? yp80Var.Q0 : null, yp80Var != null ? yp80Var.k1 : null, yp80Var != null ? yp80Var.c0 : null, yp80Var != null ? yp80Var.I : null, data.get(i), betChipList, chipType);
                                K(yp80Var != null ? yp80Var.E1 : null);
                            }
                        }
                        break;
                    case 1993454028:
                        if (category.equals("COLOUR")) {
                            String betType6 = data.get(i).getBetType();
                            if (betType6 != null) {
                                lowerCase5 = betType6.toLowerCase(Locale.ROOT);
                                lowerCase5.getClass();
                            } else {
                                lowerCase5 = null;
                            }
                            if (lowerCase5 != null) {
                                int iHashCode3 = lowerCase5.hashCode();
                                if (iHashCode3 != 112785) {
                                    if (iHashCode3 != 93818879) {
                                        if (iHashCode3 == 98619139 && lowerCase5.equals("green")) {
                                            if (yp80Var != null) {
                                                yp80Var.x1.setTag(data.get(i));
                                                Unit unit56 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                yp80Var.x1.setBackgroundColor(getContext().getColor(R.color.sg_color_109737));
                                                Unit unit57 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView17 = yp80Var.J0;
                                                op5 op5Var17 = op5.a;
                                                Context context17 = getContext();
                                                String string17 = context17 != null ? context17.getString(R.string.key_green_with_zero) : null;
                                                if (string17 == null) {
                                                    string17 = "";
                                                }
                                                textView17.setText(op5.c(op5Var17, string17, String.valueOf(data.get(i).getLocalizedTitle())));
                                                Unit unit58 = Unit.a;
                                            }
                                            if (yp80Var != null) {
                                                TextView textView18 = yp80Var.d1;
                                                op5 op5Var18 = op5.a;
                                                Context context18 = getContext();
                                                String string18 = context18 != null ? context18.getString(R.string.key_green_with_zero) : null;
                                                textView18.setText(op5.c(op5Var18, string18 != null ? string18 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                                Unit unit59 = Unit.a;
                                            }
                                            L(yp80Var != null ? yp80Var.J0 : null, yp80Var != null ? yp80Var.d1 : null, yp80Var != null ? yp80Var.V : null, yp80Var != null ? yp80Var.B : null, data.get(i), betChipList, chipType);
                                            K(yp80Var != null ? yp80Var.x1 : null);
                                        }
                                    } else if (lowerCase5.equals("black")) {
                                        if (yp80Var != null) {
                                            yp80Var.r1.setTag(data.get(i));
                                            Unit unit60 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            yp80Var.r1.setBackgroundColor(getContext().getColor(R.color.sg_color_1c1e25));
                                            Unit unit61 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            TextView textView19 = yp80Var.D0;
                                            op5 op5Var19 = op5.a;
                                            Context context19 = getContext();
                                            String string19 = context19 != null ? context19.getString(R.string.key_black) : null;
                                            if (string19 == null) {
                                                string19 = "";
                                            }
                                            textView19.setText(op5.c(op5Var19, string19, String.valueOf(data.get(i).getLocalizedTitle())));
                                            Unit unit62 = Unit.a;
                                        }
                                        if (yp80Var != null) {
                                            TextView textView20 = yp80Var.X0;
                                            op5 op5Var20 = op5.a;
                                            Context context20 = getContext();
                                            String string20 = context20 != null ? context20.getString(R.string.key_black) : null;
                                            textView20.setText(op5.c(op5Var20, string20 != null ? string20 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                            Unit unit63 = Unit.a;
                                        }
                                        L(yp80Var != null ? yp80Var.D0 : null, yp80Var != null ? yp80Var.X0 : null, yp80Var != null ? yp80Var.P : null, yp80Var != null ? yp80Var.i : null, data.get(i), betChipList, chipType);
                                        K(yp80Var != null ? yp80Var.r1 : null);
                                    }
                                } else if (lowerCase5.equals("red")) {
                                    if (yp80Var != null) {
                                        yp80Var.F1.setTag(data.get(i));
                                        Unit unit64 = Unit.a;
                                    }
                                    if (yp80Var != null) {
                                        yp80Var.F1.setBackgroundColor(getContext().getColor(R.color.sg_color_e41826));
                                        Unit unit65 = Unit.a;
                                    }
                                    if (yp80Var != null) {
                                        TextView textView21 = yp80Var.R0;
                                        op5 op5Var21 = op5.a;
                                        Context context21 = getContext();
                                        String string21 = context21 != null ? context21.getString(R.string.key_red) : null;
                                        if (string21 == null) {
                                            string21 = "";
                                        }
                                        textView21.setText(op5.c(op5Var21, string21, String.valueOf(data.get(i).getLocalizedTitle())));
                                        Unit unit66 = Unit.a;
                                    }
                                    if (yp80Var != null) {
                                        TextView textView22 = yp80Var.l1;
                                        op5 op5Var22 = op5.a;
                                        Context context22 = getContext();
                                        String string22 = context22 != null ? context22.getString(R.string.key_red) : null;
                                        textView22.setText(op5.c(op5Var22, string22 != null ? string22 : "", String.valueOf(data.get(i).getLocalizedTitle())));
                                        Unit unit67 = Unit.a;
                                    }
                                    L(yp80Var != null ? yp80Var.R0 : null, yp80Var != null ? yp80Var.l1 : null, yp80Var != null ? yp80Var.d0 : null, yp80Var != null ? yp80Var.J : null, data.get(i), betChipList, chipType);
                                    K(yp80Var != null ? yp80Var.F1 : null);
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void setFbgApplied(boolean z) {
        this.fbgApplied = z;
    }

    public final void setViewModel(v4b0 vm) {
        vm.getClass();
        this.G = vm;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Spin2WinButtonBoard(Context context) {
        this(context, null);
        context.getClass();
    }
}
