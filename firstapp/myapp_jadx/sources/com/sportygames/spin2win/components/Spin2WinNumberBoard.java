package com.sportygames.spin2win.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.jk2;
import defpackage.kya0;
import defpackage.pw;
import defpackage.tk30;
import defpackage.v4b0;
import defpackage.zp80;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/sportygames/spin2win/components/Spin2WinNumberBoard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/sportygames/spin2win/model/local/LocalGameDetailsEntity;", "filterData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "betChipList", "", "setNumberBoardData", "(Ljava/util/List;Ljava/util/ArrayList;)V", "Lv4b0;", "vm", "setViewModel", "(Lv4b0;)V", "Lzp80;", "F", "Lzp80;", "getBinding", "()Lzp80;", "setBinding", "(Lzp80;)V", "binding", "", "I", "Z", "getFbgApplied", "()Z", "setFbgApplied", "(Z)V", "fbgApplied", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Spin2WinNumberBoard extends ConstraintLayout {
    public static final /* synthetic */ int K = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public zp80 binding;
    public final ImageView[] G;
    public v4b0 H;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean fbgApplied;
    public View J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spin2WinNumberBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.G = new ImageView[0];
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_spin2_win_number_board, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.board_layout;
        if (((ConstraintLayout) h5e.a(R.id.board_layout, viewInflate)) != null) {
            i = R.id.chip_amount_1;
            TextView textView = (TextView) h5e.a(R.id.chip_amount_1, viewInflate);
            if (textView != null) {
                i = R.id.chip_amount_10;
                TextView textView2 = (TextView) h5e.a(R.id.chip_amount_10, viewInflate);
                if (textView2 != null) {
                    i = R.id.chip_amount_11;
                    TextView textView3 = (TextView) h5e.a(R.id.chip_amount_11, viewInflate);
                    if (textView3 != null) {
                        i = R.id.chip_amount_12;
                        TextView textView4 = (TextView) h5e.a(R.id.chip_amount_12, viewInflate);
                        if (textView4 != null) {
                            i = R.id.chip_amount_13;
                            TextView textView5 = (TextView) h5e.a(R.id.chip_amount_13, viewInflate);
                            if (textView5 != null) {
                                i = R.id.chip_amount_14;
                                TextView textView6 = (TextView) h5e.a(R.id.chip_amount_14, viewInflate);
                                if (textView6 != null) {
                                    i = R.id.chip_amount_15;
                                    TextView textView7 = (TextView) h5e.a(R.id.chip_amount_15, viewInflate);
                                    if (textView7 != null) {
                                        i = R.id.chip_amount_16;
                                        TextView textView8 = (TextView) h5e.a(R.id.chip_amount_16, viewInflate);
                                        if (textView8 != null) {
                                            i = R.id.chip_amount_17;
                                            TextView textView9 = (TextView) h5e.a(R.id.chip_amount_17, viewInflate);
                                            if (textView9 != null) {
                                                i = R.id.chip_amount_18;
                                                TextView textView10 = (TextView) h5e.a(R.id.chip_amount_18, viewInflate);
                                                if (textView10 != null) {
                                                    i = R.id.chip_amount_19;
                                                    TextView textView11 = (TextView) h5e.a(R.id.chip_amount_19, viewInflate);
                                                    if (textView11 != null) {
                                                        i = R.id.chip_amount_2;
                                                        TextView textView12 = (TextView) h5e.a(R.id.chip_amount_2, viewInflate);
                                                        if (textView12 != null) {
                                                            i = R.id.chip_amount_20;
                                                            TextView textView13 = (TextView) h5e.a(R.id.chip_amount_20, viewInflate);
                                                            if (textView13 != null) {
                                                                i = R.id.chip_amount_21;
                                                                TextView textView14 = (TextView) h5e.a(R.id.chip_amount_21, viewInflate);
                                                                if (textView14 != null) {
                                                                    i = R.id.chip_amount_22;
                                                                    TextView textView15 = (TextView) h5e.a(R.id.chip_amount_22, viewInflate);
                                                                    if (textView15 != null) {
                                                                        i = R.id.chip_amount_23;
                                                                        TextView textView16 = (TextView) h5e.a(R.id.chip_amount_23, viewInflate);
                                                                        if (textView16 != null) {
                                                                            i = R.id.chip_amount_24;
                                                                            TextView textView17 = (TextView) h5e.a(R.id.chip_amount_24, viewInflate);
                                                                            if (textView17 != null) {
                                                                                i = R.id.chip_amount_25;
                                                                                TextView textView18 = (TextView) h5e.a(R.id.chip_amount_25, viewInflate);
                                                                                if (textView18 != null) {
                                                                                    i = R.id.chip_amount_26;
                                                                                    TextView textView19 = (TextView) h5e.a(R.id.chip_amount_26, viewInflate);
                                                                                    if (textView19 != null) {
                                                                                        i = R.id.chip_amount_27;
                                                                                        TextView textView20 = (TextView) h5e.a(R.id.chip_amount_27, viewInflate);
                                                                                        if (textView20 != null) {
                                                                                            i = R.id.chip_amount_28;
                                                                                            TextView textView21 = (TextView) h5e.a(R.id.chip_amount_28, viewInflate);
                                                                                            if (textView21 != null) {
                                                                                                i = R.id.chip_amount_29;
                                                                                                TextView textView22 = (TextView) h5e.a(R.id.chip_amount_29, viewInflate);
                                                                                                if (textView22 != null) {
                                                                                                    i = R.id.chip_amount_3;
                                                                                                    TextView textView23 = (TextView) h5e.a(R.id.chip_amount_3, viewInflate);
                                                                                                    if (textView23 != null) {
                                                                                                        i = R.id.chip_amount_30;
                                                                                                        TextView textView24 = (TextView) h5e.a(R.id.chip_amount_30, viewInflate);
                                                                                                        if (textView24 != null) {
                                                                                                            i = R.id.chip_amount_31;
                                                                                                            TextView textView25 = (TextView) h5e.a(R.id.chip_amount_31, viewInflate);
                                                                                                            if (textView25 != null) {
                                                                                                                i = R.id.chip_amount_32;
                                                                                                                TextView textView26 = (TextView) h5e.a(R.id.chip_amount_32, viewInflate);
                                                                                                                if (textView26 != null) {
                                                                                                                    i = R.id.chip_amount_33;
                                                                                                                    TextView textView27 = (TextView) h5e.a(R.id.chip_amount_33, viewInflate);
                                                                                                                    if (textView27 != null) {
                                                                                                                        i = R.id.chip_amount_34;
                                                                                                                        TextView textView28 = (TextView) h5e.a(R.id.chip_amount_34, viewInflate);
                                                                                                                        if (textView28 != null) {
                                                                                                                            i = R.id.chip_amount_35;
                                                                                                                            TextView textView29 = (TextView) h5e.a(R.id.chip_amount_35, viewInflate);
                                                                                                                            if (textView29 != null) {
                                                                                                                                i = R.id.chip_amount_36;
                                                                                                                                TextView textView30 = (TextView) h5e.a(R.id.chip_amount_36, viewInflate);
                                                                                                                                if (textView30 != null) {
                                                                                                                                    i = R.id.chip_amount_4;
                                                                                                                                    TextView textView31 = (TextView) h5e.a(R.id.chip_amount_4, viewInflate);
                                                                                                                                    if (textView31 != null) {
                                                                                                                                        i = R.id.chip_amount_5;
                                                                                                                                        TextView textView32 = (TextView) h5e.a(R.id.chip_amount_5, viewInflate);
                                                                                                                                        if (textView32 != null) {
                                                                                                                                            i = R.id.chip_amount_6;
                                                                                                                                            TextView textView33 = (TextView) h5e.a(R.id.chip_amount_6, viewInflate);
                                                                                                                                            if (textView33 != null) {
                                                                                                                                                i = R.id.chip_amount_7;
                                                                                                                                                TextView textView34 = (TextView) h5e.a(R.id.chip_amount_7, viewInflate);
                                                                                                                                                if (textView34 != null) {
                                                                                                                                                    i = R.id.chip_amount_8;
                                                                                                                                                    TextView textView35 = (TextView) h5e.a(R.id.chip_amount_8, viewInflate);
                                                                                                                                                    if (textView35 != null) {
                                                                                                                                                        i = R.id.chip_amount_9;
                                                                                                                                                        TextView textView36 = (TextView) h5e.a(R.id.chip_amount_9, viewInflate);
                                                                                                                                                        if (textView36 != null) {
                                                                                                                                                            i = R.id.chip_image_1;
                                                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.chip_image_1, viewInflate);
                                                                                                                                                            if (constraintLayout != null) {
                                                                                                                                                                i = R.id.chip_image_10;
                                                                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.chip_image_10, viewInflate);
                                                                                                                                                                if (constraintLayout2 != null) {
                                                                                                                                                                    i = R.id.chip_image_11;
                                                                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.chip_image_11, viewInflate);
                                                                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                                                                        i = R.id.chip_image_12;
                                                                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.chip_image_12, viewInflate);
                                                                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                                                                            i = R.id.chip_image_13;
                                                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.chip_image_13, viewInflate);
                                                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                                                i = R.id.chip_image_14;
                                                                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.chip_image_14, viewInflate);
                                                                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                                                                    i = R.id.chip_image_15;
                                                                                                                                                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.chip_image_15, viewInflate);
                                                                                                                                                                                    if (constraintLayout7 != null) {
                                                                                                                                                                                        i = R.id.chip_image_16;
                                                                                                                                                                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.chip_image_16, viewInflate);
                                                                                                                                                                                        if (constraintLayout8 != null) {
                                                                                                                                                                                            i = R.id.chip_image_17;
                                                                                                                                                                                            ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.chip_image_17, viewInflate);
                                                                                                                                                                                            if (constraintLayout9 != null) {
                                                                                                                                                                                                i = R.id.chip_image_18;
                                                                                                                                                                                                ConstraintLayout constraintLayout10 = (ConstraintLayout) h5e.a(R.id.chip_image_18, viewInflate);
                                                                                                                                                                                                if (constraintLayout10 != null) {
                                                                                                                                                                                                    i = R.id.chip_image_19;
                                                                                                                                                                                                    ConstraintLayout constraintLayout11 = (ConstraintLayout) h5e.a(R.id.chip_image_19, viewInflate);
                                                                                                                                                                                                    if (constraintLayout11 != null) {
                                                                                                                                                                                                        i = R.id.chip_image_2;
                                                                                                                                                                                                        ConstraintLayout constraintLayout12 = (ConstraintLayout) h5e.a(R.id.chip_image_2, viewInflate);
                                                                                                                                                                                                        if (constraintLayout12 != null) {
                                                                                                                                                                                                            i = R.id.chip_image_20;
                                                                                                                                                                                                            ConstraintLayout constraintLayout13 = (ConstraintLayout) h5e.a(R.id.chip_image_20, viewInflate);
                                                                                                                                                                                                            if (constraintLayout13 != null) {
                                                                                                                                                                                                                i = R.id.chip_image_21;
                                                                                                                                                                                                                ConstraintLayout constraintLayout14 = (ConstraintLayout) h5e.a(R.id.chip_image_21, viewInflate);
                                                                                                                                                                                                                if (constraintLayout14 != null) {
                                                                                                                                                                                                                    i = R.id.chip_image_22;
                                                                                                                                                                                                                    ConstraintLayout constraintLayout15 = (ConstraintLayout) h5e.a(R.id.chip_image_22, viewInflate);
                                                                                                                                                                                                                    if (constraintLayout15 != null) {
                                                                                                                                                                                                                        i = R.id.chip_image_23;
                                                                                                                                                                                                                        ConstraintLayout constraintLayout16 = (ConstraintLayout) h5e.a(R.id.chip_image_23, viewInflate);
                                                                                                                                                                                                                        if (constraintLayout16 != null) {
                                                                                                                                                                                                                            i = R.id.chip_image_24;
                                                                                                                                                                                                                            ConstraintLayout constraintLayout17 = (ConstraintLayout) h5e.a(R.id.chip_image_24, viewInflate);
                                                                                                                                                                                                                            if (constraintLayout17 != null) {
                                                                                                                                                                                                                                i = R.id.chip_image_25;
                                                                                                                                                                                                                                ConstraintLayout constraintLayout18 = (ConstraintLayout) h5e.a(R.id.chip_image_25, viewInflate);
                                                                                                                                                                                                                                if (constraintLayout18 != null) {
                                                                                                                                                                                                                                    i = R.id.chip_image_26;
                                                                                                                                                                                                                                    ConstraintLayout constraintLayout19 = (ConstraintLayout) h5e.a(R.id.chip_image_26, viewInflate);
                                                                                                                                                                                                                                    if (constraintLayout19 != null) {
                                                                                                                                                                                                                                        i = R.id.chip_image_27;
                                                                                                                                                                                                                                        ConstraintLayout constraintLayout20 = (ConstraintLayout) h5e.a(R.id.chip_image_27, viewInflate);
                                                                                                                                                                                                                                        if (constraintLayout20 != null) {
                                                                                                                                                                                                                                            i = R.id.chip_image_28;
                                                                                                                                                                                                                                            ConstraintLayout constraintLayout21 = (ConstraintLayout) h5e.a(R.id.chip_image_28, viewInflate);
                                                                                                                                                                                                                                            if (constraintLayout21 != null) {
                                                                                                                                                                                                                                                i = R.id.chip_image_29;
                                                                                                                                                                                                                                                ConstraintLayout constraintLayout22 = (ConstraintLayout) h5e.a(R.id.chip_image_29, viewInflate);
                                                                                                                                                                                                                                                if (constraintLayout22 != null) {
                                                                                                                                                                                                                                                    i = R.id.chip_image_3;
                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout23 = (ConstraintLayout) h5e.a(R.id.chip_image_3, viewInflate);
                                                                                                                                                                                                                                                    if (constraintLayout23 != null) {
                                                                                                                                                                                                                                                        i = R.id.chip_image_30;
                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout24 = (ConstraintLayout) h5e.a(R.id.chip_image_30, viewInflate);
                                                                                                                                                                                                                                                        if (constraintLayout24 != null) {
                                                                                                                                                                                                                                                            i = R.id.chip_image_31;
                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout25 = (ConstraintLayout) h5e.a(R.id.chip_image_31, viewInflate);
                                                                                                                                                                                                                                                            if (constraintLayout25 != null) {
                                                                                                                                                                                                                                                                i = R.id.chip_image_32;
                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout26 = (ConstraintLayout) h5e.a(R.id.chip_image_32, viewInflate);
                                                                                                                                                                                                                                                                if (constraintLayout26 != null) {
                                                                                                                                                                                                                                                                    i = R.id.chip_image_33;
                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout27 = (ConstraintLayout) h5e.a(R.id.chip_image_33, viewInflate);
                                                                                                                                                                                                                                                                    if (constraintLayout27 != null) {
                                                                                                                                                                                                                                                                        i = R.id.chip_image_34;
                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout28 = (ConstraintLayout) h5e.a(R.id.chip_image_34, viewInflate);
                                                                                                                                                                                                                                                                        if (constraintLayout28 != null) {
                                                                                                                                                                                                                                                                            i = R.id.chip_image_35;
                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout29 = (ConstraintLayout) h5e.a(R.id.chip_image_35, viewInflate);
                                                                                                                                                                                                                                                                            if (constraintLayout29 != null) {
                                                                                                                                                                                                                                                                                i = R.id.chip_image_36;
                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout30 = (ConstraintLayout) h5e.a(R.id.chip_image_36, viewInflate);
                                                                                                                                                                                                                                                                                if (constraintLayout30 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.chip_image_4;
                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout31 = (ConstraintLayout) h5e.a(R.id.chip_image_4, viewInflate);
                                                                                                                                                                                                                                                                                    if (constraintLayout31 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.chip_image_5;
                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout32 = (ConstraintLayout) h5e.a(R.id.chip_image_5, viewInflate);
                                                                                                                                                                                                                                                                                        if (constraintLayout32 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.chip_image_6;
                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout33 = (ConstraintLayout) h5e.a(R.id.chip_image_6, viewInflate);
                                                                                                                                                                                                                                                                                            if (constraintLayout33 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.chip_image_7;
                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout34 = (ConstraintLayout) h5e.a(R.id.chip_image_7, viewInflate);
                                                                                                                                                                                                                                                                                                if (constraintLayout34 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.chip_image_8;
                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout35 = (ConstraintLayout) h5e.a(R.id.chip_image_8, viewInflate);
                                                                                                                                                                                                                                                                                                    if (constraintLayout35 != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.chip_image_9;
                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout36 = (ConstraintLayout) h5e.a(R.id.chip_image_9, viewInflate);
                                                                                                                                                                                                                                                                                                        if (constraintLayout36 != null) {
                                                                                                                                                                                                                                                                                                            i = R.id.iv_1;
                                                                                                                                                                                                                                                                                                            ImageView imageView = (ImageView) h5e.a(R.id.iv_1, viewInflate);
                                                                                                                                                                                                                                                                                                            if (imageView != null) {
                                                                                                                                                                                                                                                                                                                i = R.id.iv_10;
                                                                                                                                                                                                                                                                                                                ImageView imageView2 = (ImageView) h5e.a(R.id.iv_10, viewInflate);
                                                                                                                                                                                                                                                                                                                if (imageView2 != null) {
                                                                                                                                                                                                                                                                                                                    i = R.id.iv_11;
                                                                                                                                                                                                                                                                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.iv_11, viewInflate);
                                                                                                                                                                                                                                                                                                                    if (imageView3 != null) {
                                                                                                                                                                                                                                                                                                                        i = R.id.iv_12;
                                                                                                                                                                                                                                                                                                                        ImageView imageView4 = (ImageView) h5e.a(R.id.iv_12, viewInflate);
                                                                                                                                                                                                                                                                                                                        if (imageView4 != null) {
                                                                                                                                                                                                                                                                                                                            i = R.id.iv_13;
                                                                                                                                                                                                                                                                                                                            ImageView imageView5 = (ImageView) h5e.a(R.id.iv_13, viewInflate);
                                                                                                                                                                                                                                                                                                                            if (imageView5 != null) {
                                                                                                                                                                                                                                                                                                                                i = R.id.iv_14;
                                                                                                                                                                                                                                                                                                                                ImageView imageView6 = (ImageView) h5e.a(R.id.iv_14, viewInflate);
                                                                                                                                                                                                                                                                                                                                if (imageView6 != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_15;
                                                                                                                                                                                                                                                                                                                                    ImageView imageView7 = (ImageView) h5e.a(R.id.iv_15, viewInflate);
                                                                                                                                                                                                                                                                                                                                    if (imageView7 != null) {
                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_16;
                                                                                                                                                                                                                                                                                                                                        ImageView imageView8 = (ImageView) h5e.a(R.id.iv_16, viewInflate);
                                                                                                                                                                                                                                                                                                                                        if (imageView8 != null) {
                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_17;
                                                                                                                                                                                                                                                                                                                                            ImageView imageView9 = (ImageView) h5e.a(R.id.iv_17, viewInflate);
                                                                                                                                                                                                                                                                                                                                            if (imageView9 != null) {
                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_18;
                                                                                                                                                                                                                                                                                                                                                ImageView imageView10 = (ImageView) h5e.a(R.id.iv_18, viewInflate);
                                                                                                                                                                                                                                                                                                                                                if (imageView10 != null) {
                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_19;
                                                                                                                                                                                                                                                                                                                                                    ImageView imageView11 = (ImageView) h5e.a(R.id.iv_19, viewInflate);
                                                                                                                                                                                                                                                                                                                                                    if (imageView11 != null) {
                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_2;
                                                                                                                                                                                                                                                                                                                                                        ImageView imageView12 = (ImageView) h5e.a(R.id.iv_2, viewInflate);
                                                                                                                                                                                                                                                                                                                                                        if (imageView12 != null) {
                                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_20;
                                                                                                                                                                                                                                                                                                                                                            ImageView imageView13 = (ImageView) h5e.a(R.id.iv_20, viewInflate);
                                                                                                                                                                                                                                                                                                                                                            if (imageView13 != null) {
                                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_21;
                                                                                                                                                                                                                                                                                                                                                                ImageView imageView14 = (ImageView) h5e.a(R.id.iv_21, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                if (imageView14 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_22;
                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView15 = (ImageView) h5e.a(R.id.iv_22, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                    if (imageView15 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_23;
                                                                                                                                                                                                                                                                                                                                                                        ImageView imageView16 = (ImageView) h5e.a(R.id.iv_23, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                        if (imageView16 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_24;
                                                                                                                                                                                                                                                                                                                                                                            ImageView imageView17 = (ImageView) h5e.a(R.id.iv_24, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                            if (imageView17 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_25;
                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView18 = (ImageView) h5e.a(R.id.iv_25, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                if (imageView18 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_26;
                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView19 = (ImageView) h5e.a(R.id.iv_26, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                    if (imageView19 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_27;
                                                                                                                                                                                                                                                                                                                                                                                        ImageView imageView20 = (ImageView) h5e.a(R.id.iv_27, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                        if (imageView20 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_28;
                                                                                                                                                                                                                                                                                                                                                                                            ImageView imageView21 = (ImageView) h5e.a(R.id.iv_28, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                            if (imageView21 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_29;
                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView22 = (ImageView) h5e.a(R.id.iv_29, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                if (imageView22 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_3;
                                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView23 = (ImageView) h5e.a(R.id.iv_3, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                    if (imageView23 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_30;
                                                                                                                                                                                                                                                                                                                                                                                                        ImageView imageView24 = (ImageView) h5e.a(R.id.iv_30, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView24 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_31;
                                                                                                                                                                                                                                                                                                                                                                                                            ImageView imageView25 = (ImageView) h5e.a(R.id.iv_31, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                            if (imageView25 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_32;
                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView26 = (ImageView) h5e.a(R.id.iv_32, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                if (imageView26 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_33;
                                                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView27 = (ImageView) h5e.a(R.id.iv_33, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                    if (imageView27 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_34;
                                                                                                                                                                                                                                                                                                                                                                                                                        ImageView imageView28 = (ImageView) h5e.a(R.id.iv_34, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView28 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_35;
                                                                                                                                                                                                                                                                                                                                                                                                                            ImageView imageView29 = (ImageView) h5e.a(R.id.iv_35, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                            if (imageView29 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_36;
                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView30 = (ImageView) h5e.a(R.id.iv_36, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                if (imageView30 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_4;
                                                                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView31 = (ImageView) h5e.a(R.id.iv_4, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (imageView31 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_5;
                                                                                                                                                                                                                                                                                                                                                                                                                                        ImageView imageView32 = (ImageView) h5e.a(R.id.iv_5, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView32 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.iv_6;
                                                                                                                                                                                                                                                                                                                                                                                                                                            ImageView imageView33 = (ImageView) h5e.a(R.id.iv_6, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (imageView33 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.iv_7;
                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView34 = (ImageView) h5e.a(R.id.iv_7, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (imageView34 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.iv_8;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView35 = (ImageView) h5e.a(R.id.iv_8, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (imageView35 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.iv_9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        ImageView imageView36 = (ImageView) h5e.a(R.id.iv_9, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView36 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView37 = (TextView) h5e.a(R.id.number_1, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView37 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView38 = (TextView) h5e.a(R.id.number_10, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView38 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView39 = (TextView) h5e.a(R.id.number_11, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView39 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView40 = (TextView) h5e.a(R.id.number_12, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView40 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView41 = (TextView) h5e.a(R.id.number_13, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView41 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_14;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView42 = (TextView) h5e.a(R.id.number_14, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView42 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView43 = (TextView) h5e.a(R.id.number_15, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView43 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_16;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView44 = (TextView) h5e.a(R.id.number_16, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView44 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_17;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView45 = (TextView) h5e.a(R.id.number_17, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView45 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_18;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView46 = (TextView) h5e.a(R.id.number_18, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView46 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView47 = (TextView) h5e.a(R.id.number_19, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView47 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView48 = (TextView) h5e.a(R.id.number_2, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView48 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_20;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView49 = (TextView) h5e.a(R.id.number_20, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView49 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_21;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView50 = (TextView) h5e.a(R.id.number_21, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView50 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_22;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView51 = (TextView) h5e.a(R.id.number_22, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView51 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_23;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView52 = (TextView) h5e.a(R.id.number_23, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView52 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_24;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView53 = (TextView) h5e.a(R.id.number_24, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView53 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_25;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView54 = (TextView) h5e.a(R.id.number_25, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView54 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_26;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView55 = (TextView) h5e.a(R.id.number_26, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView55 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_27;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView56 = (TextView) h5e.a(R.id.number_27, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView56 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_28;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView57 = (TextView) h5e.a(R.id.number_28, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView57 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_29;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView58 = (TextView) h5e.a(R.id.number_29, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView58 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView59 = (TextView) h5e.a(R.id.number_3, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView59 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_30;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView60 = (TextView) h5e.a(R.id.number_30, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView60 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_31;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView61 = (TextView) h5e.a(R.id.number_31, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView61 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_32;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView62 = (TextView) h5e.a(R.id.number_32, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView62 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_33;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView63 = (TextView) h5e.a(R.id.number_33, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView63 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_34;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView64 = (TextView) h5e.a(R.id.number_34, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView64 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_35;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView65 = (TextView) h5e.a(R.id.number_35, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView65 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_36;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView66 = (TextView) h5e.a(R.id.number_36, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView66 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView67 = (TextView) h5e.a(R.id.number_4, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView67 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_5;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView68 = (TextView) h5e.a(R.id.number_5, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView68 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView69 = (TextView) h5e.a(R.id.number_6, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView69 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.number_7;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView70 = (TextView) h5e.a(R.id.number_7, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView70 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.number_8;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView71 = (TextView) h5e.a(R.id.number_8, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView71 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.number_9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView72 = (TextView) h5e.a(R.id.number_9, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView72 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.number_board;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.number_board, viewInflate)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView73 = (TextView) h5e.a(R.id.side_number_1, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView73 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView74 = (TextView) h5e.a(R.id.side_number_10, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView74 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView75 = (TextView) h5e.a(R.id.side_number_11, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView75 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView76 = (TextView) h5e.a(R.id.side_number_12, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView76 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView77 = (TextView) h5e.a(R.id.side_number_13, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView77 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_14;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView78 = (TextView) h5e.a(R.id.side_number_14, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView78 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView79 = (TextView) h5e.a(R.id.side_number_15, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView79 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_16;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView80 = (TextView) h5e.a(R.id.side_number_16, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView80 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_17;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView81 = (TextView) h5e.a(R.id.side_number_17, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView81 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_18;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView82 = (TextView) h5e.a(R.id.side_number_18, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView82 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView83 = (TextView) h5e.a(R.id.side_number_19, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView83 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView84 = (TextView) h5e.a(R.id.side_number_2, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView84 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_20;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView85 = (TextView) h5e.a(R.id.side_number_20, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView85 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_21;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView86 = (TextView) h5e.a(R.id.side_number_21, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView86 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_22;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView87 = (TextView) h5e.a(R.id.side_number_22, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView87 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_23;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView88 = (TextView) h5e.a(R.id.side_number_23, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView88 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_24;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView89 = (TextView) h5e.a(R.id.side_number_24, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView89 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_25;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView90 = (TextView) h5e.a(R.id.side_number_25, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView90 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_26;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView91 = (TextView) h5e.a(R.id.side_number_26, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView91 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_27;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView92 = (TextView) h5e.a(R.id.side_number_27, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView92 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_28;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView93 = (TextView) h5e.a(R.id.side_number_28, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView93 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_29;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView94 = (TextView) h5e.a(R.id.side_number_29, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView94 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView95 = (TextView) h5e.a(R.id.side_number_3, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView95 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_30;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView96 = (TextView) h5e.a(R.id.side_number_30, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView96 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_31;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView97 = (TextView) h5e.a(R.id.side_number_31, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView97 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_32;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView98 = (TextView) h5e.a(R.id.side_number_32, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView98 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_33;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView99 = (TextView) h5e.a(R.id.side_number_33, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView99 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_34;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView100 = (TextView) h5e.a(R.id.side_number_34, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView100 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_35;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView101 = (TextView) h5e.a(R.id.side_number_35, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView101 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_36;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView102 = (TextView) h5e.a(R.id.side_number_36, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView102 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView103 = (TextView) h5e.a(R.id.side_number_4, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView103 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_5;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView104 = (TextView) h5e.a(R.id.side_number_5, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView104 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.side_number_6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                TextView textView105 = (TextView) h5e.a(R.id.side_number_6, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (textView105 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.side_number_7;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView106 = (TextView) h5e.a(R.id.side_number_7, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (textView106 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.side_number_8;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        TextView textView107 = (TextView) h5e.a(R.id.side_number_8, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (textView107 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.side_number_9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            TextView textView108 = (TextView) h5e.a(R.id.side_number_9, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (textView108 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout37 = (ConstraintLayout) h5e.a(R.id.tv_1, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout37 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_10;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout38 = (ConstraintLayout) h5e.a(R.id.tv_10, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout38 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_11;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout39 = (ConstraintLayout) h5e.a(R.id.tv_11, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout39 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_12;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout40 = (ConstraintLayout) h5e.a(R.id.tv_12, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout40 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_13;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout41 = (ConstraintLayout) h5e.a(R.id.tv_13, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout41 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_14;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout42 = (ConstraintLayout) h5e.a(R.id.tv_14, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout42 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_15;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout43 = (ConstraintLayout) h5e.a(R.id.tv_15, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout43 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_16;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout44 = (ConstraintLayout) h5e.a(R.id.tv_16, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout44 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_17;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout45 = (ConstraintLayout) h5e.a(R.id.tv_17, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout45 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_18;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout46 = (ConstraintLayout) h5e.a(R.id.tv_18, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout46 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_19;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout47 = (ConstraintLayout) h5e.a(R.id.tv_19, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout47 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout48 = (ConstraintLayout) h5e.a(R.id.tv_2, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout48 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_20;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout49 = (ConstraintLayout) h5e.a(R.id.tv_20, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout49 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_21;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout50 = (ConstraintLayout) h5e.a(R.id.tv_21, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout50 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_22;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout51 = (ConstraintLayout) h5e.a(R.id.tv_22, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout51 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_23;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout52 = (ConstraintLayout) h5e.a(R.id.tv_23, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout52 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_24;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout53 = (ConstraintLayout) h5e.a(R.id.tv_24, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout53 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_25;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout54 = (ConstraintLayout) h5e.a(R.id.tv_25, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout54 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_26;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout55 = (ConstraintLayout) h5e.a(R.id.tv_26, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout55 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_27;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout56 = (ConstraintLayout) h5e.a(R.id.tv_27, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout56 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_28;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout57 = (ConstraintLayout) h5e.a(R.id.tv_28, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout57 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_29;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout58 = (ConstraintLayout) h5e.a(R.id.tv_29, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout58 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout59 = (ConstraintLayout) h5e.a(R.id.tv_3, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout59 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_30;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout60 = (ConstraintLayout) h5e.a(R.id.tv_30, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout60 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_31;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout61 = (ConstraintLayout) h5e.a(R.id.tv_31, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout61 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_32;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout62 = (ConstraintLayout) h5e.a(R.id.tv_32, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout62 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_33;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout63 = (ConstraintLayout) h5e.a(R.id.tv_33, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout63 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_34;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout64 = (ConstraintLayout) h5e.a(R.id.tv_34, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout64 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_35;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout65 = (ConstraintLayout) h5e.a(R.id.tv_35, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout65 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_36;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout66 = (ConstraintLayout) h5e.a(R.id.tv_36, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout66 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout67 = (ConstraintLayout) h5e.a(R.id.tv_4, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout67 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_5;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout68 = (ConstraintLayout) h5e.a(R.id.tv_5, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout68 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i = R.id.tv_6;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ConstraintLayout constraintLayout69 = (ConstraintLayout) h5e.a(R.id.tv_6, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (constraintLayout69 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i = R.id.tv_7;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout70 = (ConstraintLayout) h5e.a(R.id.tv_7, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (constraintLayout70 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i = R.id.tv_8;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ConstraintLayout constraintLayout71 = (ConstraintLayout) h5e.a(R.id.tv_8, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (constraintLayout71 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i = R.id.tv_9;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ConstraintLayout constraintLayout72 = (ConstraintLayout) h5e.a(R.id.tv_9, viewInflate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (constraintLayout72 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                this.binding = new zp80((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, textView33, textView34, textView35, textView36, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, constraintLayout7, constraintLayout8, constraintLayout9, constraintLayout10, constraintLayout11, constraintLayout12, constraintLayout13, constraintLayout14, constraintLayout15, constraintLayout16, constraintLayout17, constraintLayout18, constraintLayout19, constraintLayout20, constraintLayout21, constraintLayout22, constraintLayout23, constraintLayout24, constraintLayout25, constraintLayout26, constraintLayout27, constraintLayout28, constraintLayout29, constraintLayout30, constraintLayout31, constraintLayout32, constraintLayout33, constraintLayout34, constraintLayout35, constraintLayout36, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24, imageView25, imageView26, imageView27, imageView28, imageView29, imageView30, imageView31, imageView32, imageView33, imageView34, imageView35, imageView36, textView37, textView38, textView39, textView40, textView41, textView42, textView43, textView44, textView45, textView46, textView47, textView48, textView49, textView50, textView51, textView52, textView53, textView54, textView55, textView56, textView57, textView58, textView59, textView60, textView61, textView62, textView63, textView64, textView65, textView66, textView67, textView68, textView69, textView70, textView71, textView72, textView73, textView74, textView75, textView76, textView77, textView78, textView79, textView80, textView81, textView82, textView83, textView84, textView85, textView86, textView87, textView88, textView89, textView90, textView91, textView92, textView93, textView94, textView95, textView96, textView97, textView98, textView99, textView100, textView101, textView102, textView103, textView104, textView105, textView106, textView107, textView108, constraintLayout37, constraintLayout38, constraintLayout39, constraintLayout40, constraintLayout41, constraintLayout42, constraintLayout43, constraintLayout44, constraintLayout45, constraintLayout46, constraintLayout47, constraintLayout48, constraintLayout49, constraintLayout50, constraintLayout51, constraintLayout52, constraintLayout53, constraintLayout54, constraintLayout55, constraintLayout56, constraintLayout57, constraintLayout58, constraintLayout59, constraintLayout60, constraintLayout61, constraintLayout62, constraintLayout63, constraintLayout64, constraintLayout65, constraintLayout66, constraintLayout67, constraintLayout68, constraintLayout69, constraintLayout70, constraintLayout71, constraintLayout72);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (attributeSet != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.r);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    typedArrayObtainStyledAttributes.getClass();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    typedArrayObtainStyledAttributes.recycle();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView37 = zp80Var != null ? zp80Var.K0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var2 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView38 = zp80Var2 != null ? zp80Var2.V0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var3 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView39 = zp80Var3 != null ? zp80Var3.g1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var4 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView40 = zp80Var4 != null ? zp80Var4.o1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var5 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView41 = zp80Var5 != null ? zp80Var5.p1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var6 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView42 = zp80Var6 != null ? zp80Var6.q1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var7 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView43 = zp80Var7 != null ? zp80Var7.r1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var8 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView44 = zp80Var8 != null ? zp80Var8.s1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var9 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView45 = zp80Var9 != null ? zp80Var9.t1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var10 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView46 = zp80Var10 != null ? zp80Var10.L0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var11 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView47 = zp80Var11 != null ? zp80Var11.M0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var12 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView48 = zp80Var12 != null ? zp80Var12.N0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var13 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView49 = zp80Var13 != null ? zp80Var13.O0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var14 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView50 = zp80Var14 != null ? zp80Var14.P0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var15 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView51 = zp80Var15 != null ? zp80Var15.Q0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var16 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView52 = zp80Var16 != null ? zp80Var16.R0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var17 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView53 = zp80Var17 != null ? zp80Var17.S0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var18 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView54 = zp80Var18 != null ? zp80Var18.T0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var19 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView55 = zp80Var19 != null ? zp80Var19.U0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var20 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView56 = zp80Var20 != null ? zp80Var20.W0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var21 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView57 = zp80Var21 != null ? zp80Var21.X0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var22 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView58 = zp80Var22 != null ? zp80Var22.Y0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var23 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView59 = zp80Var23 != null ? zp80Var23.Z0 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var24 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView60 = zp80Var24 != null ? zp80Var24.a1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var25 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView61 = zp80Var25 != null ? zp80Var25.b1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var26 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView62 = zp80Var26 != null ? zp80Var26.c1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var27 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView63 = zp80Var27 != null ? zp80Var27.d1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var28 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView64 = zp80Var28 != null ? zp80Var28.e1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var29 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView65 = zp80Var29 != null ? zp80Var29.f1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var30 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView66 = zp80Var30 != null ? zp80Var30.h1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var31 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView67 = zp80Var31 != null ? zp80Var31.i1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var32 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView68 = zp80Var32 != null ? zp80Var32.j1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var33 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView69 = zp80Var33 != null ? zp80Var33.k1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var34 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView70 = zp80Var34 != null ? zp80Var34.l1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var35 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView imageView71 = zp80Var35 != null ? zp80Var35.m1 : null;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                zp80 zp80Var36 = this.binding;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView[] imageViewArr = {imageView37, imageView38, imageView39, imageView40, imageView41, imageView42, imageView43, imageView44, imageView45, imageView46, imageView47, imageView48, imageView49, imageView50, imageView51, imageView52, imageView53, imageView54, imageView55, imageView56, imageView57, imageView58, imageView59, imageView60, imageView61, imageView62, imageView63, imageView64, imageView65, imageView66, imageView67, imageView68, imageView69, imageView70, imageView71, zp80Var36 != null ? zp80Var36.n1 : null};
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                this.G = imageViewArr;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                for (int i2 = 0; i2 < 36; i2++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ImageView imageView72 = imageViewArr[i2];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (imageView72 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        imageView72.setBackground(getContext().getDrawable(R.drawable.glow));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ImageView[] imageViewArr2 = this.G;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (imageViewArr2 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    for (ImageView imageView73 : imageViewArr2) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView73 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            imageView73.setScaleX(1.215f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView73 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            imageView73.setScaleY(1.43f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (imageView73 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            imageView73.setTranslationZ(5.0f);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                M();
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

    public static boolean E(View view, Function1 function1) {
        Object tag = view.getTag();
        LocalGameDetailsEntity localGameDetailsEntity = tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null;
        if (localGameDetailsEntity != null) {
            return ((Boolean) function1.invoke(localGameDetailsEntity)).booleanValue();
        }
        return true;
    }

    public static void J(ImageView[] imageViewArr) {
        for (ImageView imageView : imageViewArr) {
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    public static void L(View view, Function2 function2) {
        Object tag = view.getTag();
        function2.invoke(tag instanceof LocalGameDetailsEntity ? (LocalGameDetailsEntity) tag : null, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setNumberBoardData$default(Spin2WinNumberBoard spin2WinNumberBoard, List list, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = null;
        }
        spin2WinNumberBoard.setNumberBoardData(list, arrayList);
    }

    public final void F(ArrayList arrayList, ArrayList arrayList2) {
        Context context;
        if (arrayList == null || arrayList.isEmpty() || (context = getContext()) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Integer value = ((LocalGameDetailsEntity) arrayList.get(i)).getValue();
            if (value != null && value.intValue() == 1) {
                zp80 zp80Var = this.binding;
                if (zp80Var != null) {
                    zp80Var.O2.setTag(arrayList.get(i));
                    Unit unit = Unit.a;
                }
                zp80 zp80Var2 = this.binding;
                if (zp80Var2 != null) {
                    zp80Var2.K0.setTag(arrayList.get(i));
                    Unit unit2 = Unit.a;
                }
                zp80 zp80Var3 = this.binding;
                if (zp80Var3 != null) {
                    zp80Var3.O2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit3 = Unit.a;
                }
                zp80 zp80Var4 = this.binding;
                if (zp80Var4 != null) {
                    zp80Var4.u1.setText("");
                    Unit unit4 = Unit.a;
                }
                zp80 zp80Var5 = this.binding;
                if (zp80Var5 != null) {
                    zp80Var5.e2.setText("");
                    Unit unit5 = Unit.a;
                }
                zp80 zp80Var6 = this.binding;
                O(zp80Var6 != null ? zp80Var6.u1 : null, zp80Var6 != null ? zp80Var6.e2 : null, zp80Var6 != null ? zp80Var6.a0 : null, zp80Var6 != null ? zp80Var6.b : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 2) {
                zp80 zp80Var7 = this.binding;
                if (zp80Var7 != null) {
                    zp80Var7.Z2.setTag(arrayList.get(i));
                    Unit unit6 = Unit.a;
                }
                zp80 zp80Var8 = this.binding;
                if (zp80Var8 != null) {
                    zp80Var8.V0.setTag(arrayList.get(i));
                    Unit unit7 = Unit.a;
                }
                zp80 zp80Var9 = this.binding;
                if (zp80Var9 != null) {
                    zp80Var9.Z2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit8 = Unit.a;
                }
                zp80 zp80Var10 = this.binding;
                if (zp80Var10 != null) {
                    zp80Var10.F1.setText("");
                    Unit unit9 = Unit.a;
                }
                zp80 zp80Var11 = this.binding;
                if (zp80Var11 != null) {
                    zp80Var11.p2.setText("");
                    Unit unit10 = Unit.a;
                }
                zp80 zp80Var12 = this.binding;
                O(zp80Var12 != null ? zp80Var12.F1 : null, zp80Var12 != null ? zp80Var12.p2 : null, zp80Var12 != null ? zp80Var12.l0 : null, zp80Var12 != null ? zp80Var12.B : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 3) {
                zp80 zp80Var13 = this.binding;
                if (zp80Var13 != null) {
                    zp80Var13.k3.setTag(arrayList.get(i));
                    Unit unit11 = Unit.a;
                }
                zp80 zp80Var14 = this.binding;
                if (zp80Var14 != null) {
                    zp80Var14.g1.setTag(arrayList.get(i));
                    Unit unit12 = Unit.a;
                }
                zp80 zp80Var15 = this.binding;
                if (zp80Var15 != null) {
                    zp80Var15.k3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit13 = Unit.a;
                }
                zp80 zp80Var16 = this.binding;
                if (zp80Var16 != null) {
                    zp80Var16.Q1.setText("");
                    Unit unit14 = Unit.a;
                }
                zp80 zp80Var17 = this.binding;
                if (zp80Var17 != null) {
                    zp80Var17.A2.setText("");
                    Unit unit15 = Unit.a;
                }
                zp80 zp80Var18 = this.binding;
                O(zp80Var18 != null ? zp80Var18.Q1 : null, zp80Var18 != null ? zp80Var18.A2 : null, zp80Var18 != null ? zp80Var18.w0 : null, zp80Var18 != null ? zp80Var18.M : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 4) {
                zp80 zp80Var19 = this.binding;
                if (zp80Var19 != null) {
                    zp80Var19.s3.setTag(arrayList.get(i));
                    Unit unit16 = Unit.a;
                }
                zp80 zp80Var20 = this.binding;
                if (zp80Var20 != null) {
                    zp80Var20.o1.setTag(arrayList.get(i));
                    Unit unit17 = Unit.a;
                }
                zp80 zp80Var21 = this.binding;
                if (zp80Var21 != null) {
                    zp80Var21.s3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit18 = Unit.a;
                }
                zp80 zp80Var22 = this.binding;
                if (zp80Var22 != null) {
                    zp80Var22.Y1.setText("");
                    Unit unit19 = Unit.a;
                }
                zp80 zp80Var23 = this.binding;
                if (zp80Var23 != null) {
                    zp80Var23.I2.setText("");
                    Unit unit20 = Unit.a;
                }
                zp80 zp80Var24 = this.binding;
                O(zp80Var24 != null ? zp80Var24.Y1 : null, zp80Var24 != null ? zp80Var24.I2 : null, zp80Var24 != null ? zp80Var24.E0 : null, zp80Var24 != null ? zp80Var24.U : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 5) {
                zp80 zp80Var25 = this.binding;
                if (zp80Var25 != null) {
                    zp80Var25.t3.setTag(arrayList.get(i));
                    Unit unit21 = Unit.a;
                }
                zp80 zp80Var26 = this.binding;
                if (zp80Var26 != null) {
                    zp80Var26.p1.setTag(arrayList.get(i));
                    Unit unit22 = Unit.a;
                }
                zp80 zp80Var27 = this.binding;
                if (zp80Var27 != null) {
                    zp80Var27.t3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit23 = Unit.a;
                }
                zp80 zp80Var28 = this.binding;
                if (zp80Var28 != null) {
                    zp80Var28.Z1.setText("");
                    Unit unit24 = Unit.a;
                }
                zp80 zp80Var29 = this.binding;
                if (zp80Var29 != null) {
                    zp80Var29.J2.setText("");
                    Unit unit25 = Unit.a;
                }
                zp80 zp80Var30 = this.binding;
                O(zp80Var30 != null ? zp80Var30.Z1 : null, zp80Var30 != null ? zp80Var30.J2 : null, zp80Var30 != null ? zp80Var30.F0 : null, zp80Var30 != null ? zp80Var30.V : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 6) {
                zp80 zp80Var31 = this.binding;
                if (zp80Var31 != null) {
                    zp80Var31.u3.setTag(arrayList.get(i));
                    Unit unit26 = Unit.a;
                }
                zp80 zp80Var32 = this.binding;
                if (zp80Var32 != null) {
                    zp80Var32.q1.setTag(arrayList.get(i));
                    Unit unit27 = Unit.a;
                }
                zp80 zp80Var33 = this.binding;
                if (zp80Var33 != null) {
                    zp80Var33.u3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit28 = Unit.a;
                }
                zp80 zp80Var34 = this.binding;
                if (zp80Var34 != null) {
                    zp80Var34.a2.setText("");
                    Unit unit29 = Unit.a;
                }
                zp80 zp80Var35 = this.binding;
                if (zp80Var35 != null) {
                    zp80Var35.K2.setText("");
                    Unit unit30 = Unit.a;
                }
                zp80 zp80Var36 = this.binding;
                O(zp80Var36 != null ? zp80Var36.a2 : null, zp80Var36 != null ? zp80Var36.K2 : null, zp80Var36 != null ? zp80Var36.G0 : null, zp80Var36 != null ? zp80Var36.W : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 7) {
                zp80 zp80Var37 = this.binding;
                if (zp80Var37 != null) {
                    zp80Var37.v3.setTag(arrayList.get(i));
                    Unit unit31 = Unit.a;
                }
                zp80 zp80Var38 = this.binding;
                if (zp80Var38 != null) {
                    zp80Var38.r1.setTag(arrayList.get(i));
                    Unit unit32 = Unit.a;
                }
                zp80 zp80Var39 = this.binding;
                if (zp80Var39 != null) {
                    zp80Var39.v3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit33 = Unit.a;
                }
                zp80 zp80Var40 = this.binding;
                if (zp80Var40 != null) {
                    zp80Var40.b2.setText("");
                    Unit unit34 = Unit.a;
                }
                zp80 zp80Var41 = this.binding;
                if (zp80Var41 != null) {
                    zp80Var41.L2.setText("");
                    Unit unit35 = Unit.a;
                }
                zp80 zp80Var42 = this.binding;
                O(zp80Var42 != null ? zp80Var42.b2 : null, zp80Var42 != null ? zp80Var42.L2 : null, zp80Var42 != null ? zp80Var42.H0 : null, zp80Var42 != null ? zp80Var42.X : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 8) {
                zp80 zp80Var43 = this.binding;
                if (zp80Var43 != null) {
                    zp80Var43.w3.setTag(arrayList.get(i));
                    Unit unit36 = Unit.a;
                }
                zp80 zp80Var44 = this.binding;
                if (zp80Var44 != null) {
                    zp80Var44.s1.setTag(arrayList.get(i));
                    Unit unit37 = Unit.a;
                }
                zp80 zp80Var45 = this.binding;
                if (zp80Var45 != null) {
                    zp80Var45.w3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit38 = Unit.a;
                }
                zp80 zp80Var46 = this.binding;
                if (zp80Var46 != null) {
                    zp80Var46.c2.setText("");
                    Unit unit39 = Unit.a;
                }
                zp80 zp80Var47 = this.binding;
                if (zp80Var47 != null) {
                    zp80Var47.M2.setText("");
                    Unit unit40 = Unit.a;
                }
                zp80 zp80Var48 = this.binding;
                O(zp80Var48 != null ? zp80Var48.c2 : null, zp80Var48 != null ? zp80Var48.M2 : null, zp80Var48 != null ? zp80Var48.I0 : null, zp80Var48 != null ? zp80Var48.Y : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 9) {
                zp80 zp80Var49 = this.binding;
                if (zp80Var49 != null) {
                    zp80Var49.x3.setTag(arrayList.get(i));
                    Unit unit41 = Unit.a;
                }
                zp80 zp80Var50 = this.binding;
                if (zp80Var50 != null) {
                    zp80Var50.t1.setTag(arrayList.get(i));
                    Unit unit42 = Unit.a;
                }
                zp80 zp80Var51 = this.binding;
                if (zp80Var51 != null) {
                    zp80Var51.x3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit43 = Unit.a;
                }
                zp80 zp80Var52 = this.binding;
                if (zp80Var52 != null) {
                    zp80Var52.d2.setText("");
                    Unit unit44 = Unit.a;
                }
                zp80 zp80Var53 = this.binding;
                if (zp80Var53 != null) {
                    zp80Var53.N2.setText("");
                    Unit unit45 = Unit.a;
                }
                zp80 zp80Var54 = this.binding;
                O(zp80Var54 != null ? zp80Var54.d2 : null, zp80Var54 != null ? zp80Var54.N2 : null, zp80Var54 != null ? zp80Var54.J0 : null, zp80Var54 != null ? zp80Var54.Z : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 10) {
                zp80 zp80Var55 = this.binding;
                if (zp80Var55 != null) {
                    zp80Var55.P2.setTag(arrayList.get(i));
                    Unit unit46 = Unit.a;
                }
                zp80 zp80Var56 = this.binding;
                if (zp80Var56 != null) {
                    zp80Var56.L0.setTag(arrayList.get(i));
                    Unit unit47 = Unit.a;
                }
                zp80 zp80Var57 = this.binding;
                if (zp80Var57 != null) {
                    zp80Var57.P2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit48 = Unit.a;
                }
                zp80 zp80Var58 = this.binding;
                if (zp80Var58 != null) {
                    zp80Var58.v1.setText("");
                    Unit unit49 = Unit.a;
                }
                zp80 zp80Var59 = this.binding;
                if (zp80Var59 != null) {
                    zp80Var59.f2.setText("");
                    Unit unit50 = Unit.a;
                }
                zp80 zp80Var60 = this.binding;
                O(zp80Var60 != null ? zp80Var60.v1 : null, zp80Var60 != null ? zp80Var60.f2 : null, zp80Var60 != null ? zp80Var60.b0 : null, zp80Var60 != null ? zp80Var60.c : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 11) {
                zp80 zp80Var61 = this.binding;
                if (zp80Var61 != null) {
                    zp80Var61.Q2.setTag(arrayList.get(i));
                    Unit unit51 = Unit.a;
                }
                zp80 zp80Var62 = this.binding;
                if (zp80Var62 != null) {
                    zp80Var62.M0.setTag(arrayList.get(i));
                    Unit unit52 = Unit.a;
                }
                zp80 zp80Var63 = this.binding;
                if (zp80Var63 != null) {
                    zp80Var63.Q2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit53 = Unit.a;
                }
                zp80 zp80Var64 = this.binding;
                if (zp80Var64 != null) {
                    zp80Var64.w1.setText("");
                    Unit unit54 = Unit.a;
                }
                zp80 zp80Var65 = this.binding;
                if (zp80Var65 != null) {
                    zp80Var65.g2.setText("");
                    Unit unit55 = Unit.a;
                }
                zp80 zp80Var66 = this.binding;
                O(zp80Var66 != null ? zp80Var66.w1 : null, zp80Var66 != null ? zp80Var66.g2 : null, zp80Var66 != null ? zp80Var66.c0 : null, zp80Var66 != null ? zp80Var66.d : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 12) {
                zp80 zp80Var67 = this.binding;
                if (zp80Var67 != null) {
                    zp80Var67.R2.setTag(arrayList.get(i));
                    Unit unit56 = Unit.a;
                }
                zp80 zp80Var68 = this.binding;
                if (zp80Var68 != null) {
                    zp80Var68.N0.setTag(arrayList.get(i));
                    Unit unit57 = Unit.a;
                }
                zp80 zp80Var69 = this.binding;
                if (zp80Var69 != null) {
                    zp80Var69.R2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit58 = Unit.a;
                }
                zp80 zp80Var70 = this.binding;
                if (zp80Var70 != null) {
                    zp80Var70.x1.setText("");
                    Unit unit59 = Unit.a;
                }
                zp80 zp80Var71 = this.binding;
                if (zp80Var71 != null) {
                    zp80Var71.h2.setText("");
                    Unit unit60 = Unit.a;
                }
                zp80 zp80Var72 = this.binding;
                O(zp80Var72 != null ? zp80Var72.x1 : null, zp80Var72 != null ? zp80Var72.h2 : null, zp80Var72 != null ? zp80Var72.d0 : null, zp80Var72 != null ? zp80Var72.e : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 13) {
                zp80 zp80Var73 = this.binding;
                if (zp80Var73 != null) {
                    zp80Var73.S2.setTag(arrayList.get(i));
                    Unit unit61 = Unit.a;
                }
                zp80 zp80Var74 = this.binding;
                if (zp80Var74 != null) {
                    zp80Var74.O0.setTag(arrayList.get(i));
                    Unit unit62 = Unit.a;
                }
                zp80 zp80Var75 = this.binding;
                if (zp80Var75 != null) {
                    zp80Var75.S2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit63 = Unit.a;
                }
                zp80 zp80Var76 = this.binding;
                if (zp80Var76 != null) {
                    zp80Var76.y1.setText("");
                    Unit unit64 = Unit.a;
                }
                zp80 zp80Var77 = this.binding;
                if (zp80Var77 != null) {
                    zp80Var77.i2.setText("");
                    Unit unit65 = Unit.a;
                }
                zp80 zp80Var78 = this.binding;
                O(zp80Var78 != null ? zp80Var78.y1 : null, zp80Var78 != null ? zp80Var78.i2 : null, zp80Var78 != null ? zp80Var78.e0 : null, zp80Var78 != null ? zp80Var78.f : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 14) {
                zp80 zp80Var79 = this.binding;
                if (zp80Var79 != null) {
                    zp80Var79.T2.setTag(arrayList.get(i));
                    Unit unit66 = Unit.a;
                }
                zp80 zp80Var80 = this.binding;
                if (zp80Var80 != null) {
                    zp80Var80.P0.setTag(arrayList.get(i));
                    Unit unit67 = Unit.a;
                }
                zp80 zp80Var81 = this.binding;
                if (zp80Var81 != null) {
                    zp80Var81.T2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit68 = Unit.a;
                }
                zp80 zp80Var82 = this.binding;
                if (zp80Var82 != null) {
                    zp80Var82.z1.setText("");
                    Unit unit69 = Unit.a;
                }
                zp80 zp80Var83 = this.binding;
                if (zp80Var83 != null) {
                    zp80Var83.j2.setText("");
                    Unit unit70 = Unit.a;
                }
                zp80 zp80Var84 = this.binding;
                O(zp80Var84 != null ? zp80Var84.z1 : null, zp80Var84 != null ? zp80Var84.j2 : null, zp80Var84 != null ? zp80Var84.f0 : null, zp80Var84 != null ? zp80Var84.i : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 15) {
                zp80 zp80Var85 = this.binding;
                if (zp80Var85 != null) {
                    zp80Var85.U2.setTag(arrayList.get(i));
                    Unit unit71 = Unit.a;
                }
                zp80 zp80Var86 = this.binding;
                if (zp80Var86 != null) {
                    zp80Var86.Q0.setTag(arrayList.get(i));
                    Unit unit72 = Unit.a;
                }
                zp80 zp80Var87 = this.binding;
                if (zp80Var87 != null) {
                    zp80Var87.U2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit73 = Unit.a;
                }
                zp80 zp80Var88 = this.binding;
                if (zp80Var88 != null) {
                    zp80Var88.A1.setText("");
                    Unit unit74 = Unit.a;
                }
                zp80 zp80Var89 = this.binding;
                if (zp80Var89 != null) {
                    zp80Var89.k2.setText("");
                    Unit unit75 = Unit.a;
                }
                zp80 zp80Var90 = this.binding;
                O(zp80Var90 != null ? zp80Var90.A1 : null, zp80Var90 != null ? zp80Var90.k2 : null, zp80Var90 != null ? zp80Var90.g0 : null, zp80Var90 != null ? zp80Var90.v : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 16) {
                zp80 zp80Var91 = this.binding;
                if (zp80Var91 != null) {
                    zp80Var91.V2.setTag(arrayList.get(i));
                    Unit unit76 = Unit.a;
                }
                zp80 zp80Var92 = this.binding;
                if (zp80Var92 != null) {
                    zp80Var92.R0.setTag(arrayList.get(i));
                    Unit unit77 = Unit.a;
                }
                zp80 zp80Var93 = this.binding;
                if (zp80Var93 != null) {
                    zp80Var93.V2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit78 = Unit.a;
                }
                zp80 zp80Var94 = this.binding;
                if (zp80Var94 != null) {
                    zp80Var94.B1.setText("");
                    Unit unit79 = Unit.a;
                }
                zp80 zp80Var95 = this.binding;
                if (zp80Var95 != null) {
                    zp80Var95.l2.setText("");
                    Unit unit80 = Unit.a;
                }
                zp80 zp80Var96 = this.binding;
                O(zp80Var96 != null ? zp80Var96.B1 : null, zp80Var96 != null ? zp80Var96.l2 : null, zp80Var96 != null ? zp80Var96.h0 : null, zp80Var96 != null ? zp80Var96.w : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 17) {
                zp80 zp80Var97 = this.binding;
                if (zp80Var97 != null) {
                    zp80Var97.W2.setTag(arrayList.get(i));
                    Unit unit81 = Unit.a;
                }
                zp80 zp80Var98 = this.binding;
                if (zp80Var98 != null) {
                    zp80Var98.S0.setTag(arrayList.get(i));
                    Unit unit82 = Unit.a;
                }
                zp80 zp80Var99 = this.binding;
                if (zp80Var99 != null) {
                    zp80Var99.W2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit83 = Unit.a;
                }
                zp80 zp80Var100 = this.binding;
                if (zp80Var100 != null) {
                    zp80Var100.C1.setText("");
                    Unit unit84 = Unit.a;
                }
                zp80 zp80Var101 = this.binding;
                if (zp80Var101 != null) {
                    zp80Var101.m2.setText("");
                    Unit unit85 = Unit.a;
                }
                zp80 zp80Var102 = this.binding;
                O(zp80Var102 != null ? zp80Var102.C1 : null, zp80Var102 != null ? zp80Var102.m2 : null, zp80Var102 != null ? zp80Var102.i0 : null, zp80Var102 != null ? zp80Var102.y : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 18) {
                zp80 zp80Var103 = this.binding;
                if (zp80Var103 != null) {
                    zp80Var103.X2.setTag(arrayList.get(i));
                    Unit unit86 = Unit.a;
                }
                zp80 zp80Var104 = this.binding;
                if (zp80Var104 != null) {
                    zp80Var104.T0.setTag(arrayList.get(i));
                    Unit unit87 = Unit.a;
                }
                zp80 zp80Var105 = this.binding;
                if (zp80Var105 != null) {
                    zp80Var105.X2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit88 = Unit.a;
                }
                zp80 zp80Var106 = this.binding;
                if (zp80Var106 != null) {
                    zp80Var106.D1.setText("");
                    Unit unit89 = Unit.a;
                }
                zp80 zp80Var107 = this.binding;
                if (zp80Var107 != null) {
                    zp80Var107.n2.setText("");
                    Unit unit90 = Unit.a;
                }
                zp80 zp80Var108 = this.binding;
                O(zp80Var108 != null ? zp80Var108.D1 : null, zp80Var108 != null ? zp80Var108.n2 : null, zp80Var108 != null ? zp80Var108.j0 : null, zp80Var108 != null ? zp80Var108.z : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 19) {
                zp80 zp80Var109 = this.binding;
                if (zp80Var109 != null) {
                    zp80Var109.Y2.setTag(arrayList.get(i));
                    Unit unit91 = Unit.a;
                }
                zp80 zp80Var110 = this.binding;
                if (zp80Var110 != null) {
                    zp80Var110.U0.setTag(arrayList.get(i));
                    Unit unit92 = Unit.a;
                }
                zp80 zp80Var111 = this.binding;
                if (zp80Var111 != null) {
                    zp80Var111.Y2.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit93 = Unit.a;
                }
                zp80 zp80Var112 = this.binding;
                if (zp80Var112 != null) {
                    zp80Var112.E1.setText("");
                    Unit unit94 = Unit.a;
                }
                zp80 zp80Var113 = this.binding;
                if (zp80Var113 != null) {
                    zp80Var113.o2.setText("");
                    Unit unit95 = Unit.a;
                }
                zp80 zp80Var114 = this.binding;
                O(zp80Var114 != null ? zp80Var114.E1 : null, zp80Var114 != null ? zp80Var114.o2 : null, zp80Var114 != null ? zp80Var114.k0 : null, zp80Var114 != null ? zp80Var114.A : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 20) {
                zp80 zp80Var115 = this.binding;
                if (zp80Var115 != null) {
                    zp80Var115.a3.setTag(arrayList.get(i));
                    Unit unit96 = Unit.a;
                }
                zp80 zp80Var116 = this.binding;
                if (zp80Var116 != null) {
                    zp80Var116.W0.setTag(arrayList.get(i));
                    Unit unit97 = Unit.a;
                }
                zp80 zp80Var117 = this.binding;
                if (zp80Var117 != null) {
                    zp80Var117.a3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit98 = Unit.a;
                }
                zp80 zp80Var118 = this.binding;
                if (zp80Var118 != null) {
                    zp80Var118.G1.setText("");
                    Unit unit99 = Unit.a;
                }
                zp80 zp80Var119 = this.binding;
                if (zp80Var119 != null) {
                    zp80Var119.q2.setText("");
                    Unit unit100 = Unit.a;
                }
                zp80 zp80Var120 = this.binding;
                O(zp80Var120 != null ? zp80Var120.G1 : null, zp80Var120 != null ? zp80Var120.q2 : null, zp80Var120 != null ? zp80Var120.m0 : null, zp80Var120 != null ? zp80Var120.C : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 21) {
                zp80 zp80Var121 = this.binding;
                if (zp80Var121 != null) {
                    zp80Var121.b3.setTag(arrayList.get(i));
                    Unit unit101 = Unit.a;
                }
                zp80 zp80Var122 = this.binding;
                if (zp80Var122 != null) {
                    zp80Var122.X0.setTag(arrayList.get(i));
                    Unit unit102 = Unit.a;
                }
                zp80 zp80Var123 = this.binding;
                if (zp80Var123 != null) {
                    zp80Var123.b3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit103 = Unit.a;
                }
                zp80 zp80Var124 = this.binding;
                if (zp80Var124 != null) {
                    zp80Var124.H1.setText("");
                    Unit unit104 = Unit.a;
                }
                zp80 zp80Var125 = this.binding;
                if (zp80Var125 != null) {
                    zp80Var125.r2.setText("");
                    Unit unit105 = Unit.a;
                }
                zp80 zp80Var126 = this.binding;
                O(zp80Var126 != null ? zp80Var126.H1 : null, zp80Var126 != null ? zp80Var126.r2 : null, zp80Var126 != null ? zp80Var126.n0 : null, zp80Var126 != null ? zp80Var126.D : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 22) {
                zp80 zp80Var127 = this.binding;
                if (zp80Var127 != null) {
                    zp80Var127.c3.setTag(arrayList.get(i));
                    Unit unit106 = Unit.a;
                }
                zp80 zp80Var128 = this.binding;
                if (zp80Var128 != null) {
                    zp80Var128.Y0.setTag(arrayList.get(i));
                    Unit unit107 = Unit.a;
                }
                zp80 zp80Var129 = this.binding;
                if (zp80Var129 != null) {
                    zp80Var129.c3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit108 = Unit.a;
                }
                zp80 zp80Var130 = this.binding;
                if (zp80Var130 != null) {
                    zp80Var130.I1.setText("");
                    Unit unit109 = Unit.a;
                }
                zp80 zp80Var131 = this.binding;
                if (zp80Var131 != null) {
                    zp80Var131.s2.setText("");
                    Unit unit110 = Unit.a;
                }
                zp80 zp80Var132 = this.binding;
                O(zp80Var132 != null ? zp80Var132.I1 : null, zp80Var132 != null ? zp80Var132.s2 : null, zp80Var132 != null ? zp80Var132.o0 : null, zp80Var132 != null ? zp80Var132.E : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 23) {
                zp80 zp80Var133 = this.binding;
                if (zp80Var133 != null) {
                    zp80Var133.d3.setTag(arrayList.get(i));
                    Unit unit111 = Unit.a;
                }
                zp80 zp80Var134 = this.binding;
                if (zp80Var134 != null) {
                    zp80Var134.Z0.setTag(arrayList.get(i));
                    Unit unit112 = Unit.a;
                }
                zp80 zp80Var135 = this.binding;
                if (zp80Var135 != null) {
                    zp80Var135.d3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit113 = Unit.a;
                }
                zp80 zp80Var136 = this.binding;
                if (zp80Var136 != null) {
                    zp80Var136.J1.setText("");
                    Unit unit114 = Unit.a;
                }
                zp80 zp80Var137 = this.binding;
                if (zp80Var137 != null) {
                    zp80Var137.t2.setText("");
                    Unit unit115 = Unit.a;
                }
                zp80 zp80Var138 = this.binding;
                O(zp80Var138 != null ? zp80Var138.J1 : null, zp80Var138 != null ? zp80Var138.t2 : null, zp80Var138 != null ? zp80Var138.p0 : null, zp80Var138 != null ? zp80Var138.F : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 24) {
                zp80 zp80Var139 = this.binding;
                if (zp80Var139 != null) {
                    zp80Var139.e3.setTag(arrayList.get(i));
                    Unit unit116 = Unit.a;
                }
                zp80 zp80Var140 = this.binding;
                if (zp80Var140 != null) {
                    zp80Var140.a1.setTag(arrayList.get(i));
                    Unit unit117 = Unit.a;
                }
                zp80 zp80Var141 = this.binding;
                if (zp80Var141 != null) {
                    zp80Var141.e3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit118 = Unit.a;
                }
                zp80 zp80Var142 = this.binding;
                if (zp80Var142 != null) {
                    zp80Var142.K1.setText("");
                    Unit unit119 = Unit.a;
                }
                zp80 zp80Var143 = this.binding;
                if (zp80Var143 != null) {
                    zp80Var143.u2.setText("");
                    Unit unit120 = Unit.a;
                }
                zp80 zp80Var144 = this.binding;
                O(zp80Var144 != null ? zp80Var144.K1 : null, zp80Var144 != null ? zp80Var144.u2 : null, zp80Var144 != null ? zp80Var144.q0 : null, zp80Var144 != null ? zp80Var144.G : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 25) {
                zp80 zp80Var145 = this.binding;
                if (zp80Var145 != null) {
                    zp80Var145.f3.setTag(arrayList.get(i));
                    Unit unit121 = Unit.a;
                }
                zp80 zp80Var146 = this.binding;
                if (zp80Var146 != null) {
                    zp80Var146.b1.setTag(arrayList.get(i));
                    Unit unit122 = Unit.a;
                }
                zp80 zp80Var147 = this.binding;
                if (zp80Var147 != null) {
                    zp80Var147.f3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit123 = Unit.a;
                }
                zp80 zp80Var148 = this.binding;
                if (zp80Var148 != null) {
                    zp80Var148.L1.setText("");
                    Unit unit124 = Unit.a;
                }
                zp80 zp80Var149 = this.binding;
                if (zp80Var149 != null) {
                    zp80Var149.v2.setText("");
                    Unit unit125 = Unit.a;
                }
                zp80 zp80Var150 = this.binding;
                O(zp80Var150 != null ? zp80Var150.L1 : null, zp80Var150 != null ? zp80Var150.v2 : null, zp80Var150 != null ? zp80Var150.r0 : null, zp80Var150 != null ? zp80Var150.H : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 26) {
                zp80 zp80Var151 = this.binding;
                if (zp80Var151 != null) {
                    zp80Var151.g3.setTag(arrayList.get(i));
                    Unit unit126 = Unit.a;
                }
                zp80 zp80Var152 = this.binding;
                if (zp80Var152 != null) {
                    zp80Var152.c1.setTag(arrayList.get(i));
                    Unit unit127 = Unit.a;
                }
                zp80 zp80Var153 = this.binding;
                if (zp80Var153 != null) {
                    zp80Var153.g3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit128 = Unit.a;
                }
                zp80 zp80Var154 = this.binding;
                if (zp80Var154 != null) {
                    zp80Var154.M1.setText("");
                    Unit unit129 = Unit.a;
                }
                zp80 zp80Var155 = this.binding;
                if (zp80Var155 != null) {
                    zp80Var155.w2.setText("");
                    Unit unit130 = Unit.a;
                }
                zp80 zp80Var156 = this.binding;
                O(zp80Var156 != null ? zp80Var156.M1 : null, zp80Var156 != null ? zp80Var156.w2 : null, zp80Var156 != null ? zp80Var156.s0 : null, zp80Var156 != null ? zp80Var156.I : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 27) {
                zp80 zp80Var157 = this.binding;
                if (zp80Var157 != null) {
                    zp80Var157.h3.setTag(arrayList.get(i));
                    Unit unit131 = Unit.a;
                }
                zp80 zp80Var158 = this.binding;
                if (zp80Var158 != null) {
                    zp80Var158.d1.setTag(arrayList.get(i));
                    Unit unit132 = Unit.a;
                }
                zp80 zp80Var159 = this.binding;
                if (zp80Var159 != null) {
                    zp80Var159.h3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit133 = Unit.a;
                }
                zp80 zp80Var160 = this.binding;
                if (zp80Var160 != null) {
                    zp80Var160.N1.setText("");
                    Unit unit134 = Unit.a;
                }
                zp80 zp80Var161 = this.binding;
                if (zp80Var161 != null) {
                    zp80Var161.x2.setText("");
                    Unit unit135 = Unit.a;
                }
                zp80 zp80Var162 = this.binding;
                O(zp80Var162 != null ? zp80Var162.N1 : null, zp80Var162 != null ? zp80Var162.x2 : null, zp80Var162 != null ? zp80Var162.t0 : null, zp80Var162 != null ? zp80Var162.J : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 28) {
                zp80 zp80Var163 = this.binding;
                if (zp80Var163 != null) {
                    zp80Var163.i3.setTag(arrayList.get(i));
                    Unit unit136 = Unit.a;
                }
                zp80 zp80Var164 = this.binding;
                if (zp80Var164 != null) {
                    zp80Var164.e1.setTag(arrayList.get(i));
                    Unit unit137 = Unit.a;
                }
                zp80 zp80Var165 = this.binding;
                if (zp80Var165 != null) {
                    zp80Var165.i3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit138 = Unit.a;
                }
                zp80 zp80Var166 = this.binding;
                if (zp80Var166 != null) {
                    zp80Var166.O1.setText("");
                    Unit unit139 = Unit.a;
                }
                zp80 zp80Var167 = this.binding;
                if (zp80Var167 != null) {
                    zp80Var167.y2.setText("");
                    Unit unit140 = Unit.a;
                }
                zp80 zp80Var168 = this.binding;
                O(zp80Var168 != null ? zp80Var168.O1 : null, zp80Var168 != null ? zp80Var168.y2 : null, zp80Var168 != null ? zp80Var168.u0 : null, zp80Var168 != null ? zp80Var168.K : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 29) {
                zp80 zp80Var169 = this.binding;
                if (zp80Var169 != null) {
                    zp80Var169.j3.setTag(arrayList.get(i));
                    Unit unit141 = Unit.a;
                }
                zp80 zp80Var170 = this.binding;
                if (zp80Var170 != null) {
                    zp80Var170.f1.setTag(arrayList.get(i));
                    Unit unit142 = Unit.a;
                }
                zp80 zp80Var171 = this.binding;
                if (zp80Var171 != null) {
                    zp80Var171.j3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit143 = Unit.a;
                }
                zp80 zp80Var172 = this.binding;
                if (zp80Var172 != null) {
                    zp80Var172.P1.setText("");
                    Unit unit144 = Unit.a;
                }
                zp80 zp80Var173 = this.binding;
                if (zp80Var173 != null) {
                    zp80Var173.z2.setText("");
                    Unit unit145 = Unit.a;
                }
                zp80 zp80Var174 = this.binding;
                O(zp80Var174 != null ? zp80Var174.P1 : null, zp80Var174 != null ? zp80Var174.z2 : null, zp80Var174 != null ? zp80Var174.v0 : null, zp80Var174 != null ? zp80Var174.L : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 30) {
                zp80 zp80Var175 = this.binding;
                if (zp80Var175 != null) {
                    zp80Var175.l3.setTag(arrayList.get(i));
                    Unit unit146 = Unit.a;
                }
                zp80 zp80Var176 = this.binding;
                if (zp80Var176 != null) {
                    zp80Var176.h1.setTag(arrayList.get(i));
                    Unit unit147 = Unit.a;
                }
                zp80 zp80Var177 = this.binding;
                if (zp80Var177 != null) {
                    zp80Var177.l3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit148 = Unit.a;
                }
                zp80 zp80Var178 = this.binding;
                if (zp80Var178 != null) {
                    zp80Var178.R1.setText("");
                    Unit unit149 = Unit.a;
                }
                zp80 zp80Var179 = this.binding;
                if (zp80Var179 != null) {
                    zp80Var179.B2.setText("");
                    Unit unit150 = Unit.a;
                }
                zp80 zp80Var180 = this.binding;
                O(zp80Var180 != null ? zp80Var180.R1 : null, zp80Var180 != null ? zp80Var180.B2 : null, zp80Var180 != null ? zp80Var180.x0 : null, zp80Var180 != null ? zp80Var180.N : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 31) {
                zp80 zp80Var181 = this.binding;
                if (zp80Var181 != null) {
                    zp80Var181.m3.setTag(arrayList.get(i));
                    Unit unit151 = Unit.a;
                }
                zp80 zp80Var182 = this.binding;
                if (zp80Var182 != null) {
                    zp80Var182.i1.setTag(arrayList.get(i));
                    Unit unit152 = Unit.a;
                }
                zp80 zp80Var183 = this.binding;
                if (zp80Var183 != null) {
                    zp80Var183.m3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit153 = Unit.a;
                }
                zp80 zp80Var184 = this.binding;
                if (zp80Var184 != null) {
                    zp80Var184.S1.setText("");
                    Unit unit154 = Unit.a;
                }
                zp80 zp80Var185 = this.binding;
                if (zp80Var185 != null) {
                    zp80Var185.C2.setText("");
                    Unit unit155 = Unit.a;
                }
                zp80 zp80Var186 = this.binding;
                O(zp80Var186 != null ? zp80Var186.S1 : null, zp80Var186 != null ? zp80Var186.C2 : null, zp80Var186 != null ? zp80Var186.y0 : null, zp80Var186 != null ? zp80Var186.O : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 32) {
                zp80 zp80Var187 = this.binding;
                if (zp80Var187 != null) {
                    zp80Var187.n3.setTag(arrayList.get(i));
                    Unit unit156 = Unit.a;
                }
                zp80 zp80Var188 = this.binding;
                if (zp80Var188 != null) {
                    zp80Var188.j1.setTag(arrayList.get(i));
                    Unit unit157 = Unit.a;
                }
                zp80 zp80Var189 = this.binding;
                if (zp80Var189 != null) {
                    zp80Var189.n3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit158 = Unit.a;
                }
                zp80 zp80Var190 = this.binding;
                if (zp80Var190 != null) {
                    zp80Var190.T1.setText("");
                    Unit unit159 = Unit.a;
                }
                zp80 zp80Var191 = this.binding;
                if (zp80Var191 != null) {
                    zp80Var191.D2.setText("");
                    Unit unit160 = Unit.a;
                }
                zp80 zp80Var192 = this.binding;
                O(zp80Var192 != null ? zp80Var192.T1 : null, zp80Var192 != null ? zp80Var192.D2 : null, zp80Var192 != null ? zp80Var192.z0 : null, zp80Var192 != null ? zp80Var192.P : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 33) {
                zp80 zp80Var193 = this.binding;
                if (zp80Var193 != null) {
                    zp80Var193.o3.setTag(arrayList.get(i));
                    Unit unit161 = Unit.a;
                }
                zp80 zp80Var194 = this.binding;
                if (zp80Var194 != null) {
                    zp80Var194.k1.setTag(arrayList.get(i));
                    Unit unit162 = Unit.a;
                }
                zp80 zp80Var195 = this.binding;
                if (zp80Var195 != null) {
                    zp80Var195.o3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit163 = Unit.a;
                }
                zp80 zp80Var196 = this.binding;
                if (zp80Var196 != null) {
                    zp80Var196.U1.setText("");
                    Unit unit164 = Unit.a;
                }
                zp80 zp80Var197 = this.binding;
                if (zp80Var197 != null) {
                    zp80Var197.E2.setText("");
                    Unit unit165 = Unit.a;
                }
                zp80 zp80Var198 = this.binding;
                O(zp80Var198 != null ? zp80Var198.U1 : null, zp80Var198 != null ? zp80Var198.E2 : null, zp80Var198 != null ? zp80Var198.A0 : null, zp80Var198 != null ? zp80Var198.Q : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 34) {
                zp80 zp80Var199 = this.binding;
                if (zp80Var199 != null) {
                    zp80Var199.p3.setTag(arrayList.get(i));
                    Unit unit166 = Unit.a;
                }
                zp80 zp80Var200 = this.binding;
                if (zp80Var200 != null) {
                    zp80Var200.l1.setTag(arrayList.get(i));
                    Unit unit167 = Unit.a;
                }
                zp80 zp80Var201 = this.binding;
                if (zp80Var201 != null) {
                    zp80Var201.p3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit168 = Unit.a;
                }
                zp80 zp80Var202 = this.binding;
                if (zp80Var202 != null) {
                    zp80Var202.V1.setText("");
                    Unit unit169 = Unit.a;
                }
                zp80 zp80Var203 = this.binding;
                if (zp80Var203 != null) {
                    zp80Var203.F2.setText("");
                    Unit unit170 = Unit.a;
                }
                zp80 zp80Var204 = this.binding;
                O(zp80Var204 != null ? zp80Var204.V1 : null, zp80Var204 != null ? zp80Var204.F2 : null, zp80Var204 != null ? zp80Var204.B0 : null, zp80Var204 != null ? zp80Var204.R : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 35) {
                zp80 zp80Var205 = this.binding;
                if (zp80Var205 != null) {
                    zp80Var205.q3.setTag(arrayList.get(i));
                    Unit unit171 = Unit.a;
                }
                zp80 zp80Var206 = this.binding;
                if (zp80Var206 != null) {
                    zp80Var206.m1.setTag(arrayList.get(i));
                    Unit unit172 = Unit.a;
                }
                zp80 zp80Var207 = this.binding;
                if (zp80Var207 != null) {
                    zp80Var207.q3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit173 = Unit.a;
                }
                zp80 zp80Var208 = this.binding;
                if (zp80Var208 != null) {
                    zp80Var208.W1.setText("");
                    Unit unit174 = Unit.a;
                }
                zp80 zp80Var209 = this.binding;
                if (zp80Var209 != null) {
                    zp80Var209.G2.setText("");
                    Unit unit175 = Unit.a;
                }
                zp80 zp80Var210 = this.binding;
                O(zp80Var210 != null ? zp80Var210.W1 : null, zp80Var210 != null ? zp80Var210.G2 : null, zp80Var210 != null ? zp80Var210.C0 : null, zp80Var210 != null ? zp80Var210.S : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            } else if (value != null && value.intValue() == 36) {
                zp80 zp80Var211 = this.binding;
                if (zp80Var211 != null) {
                    zp80Var211.r3.setTag(arrayList.get(i));
                    Unit unit176 = Unit.a;
                }
                zp80 zp80Var212 = this.binding;
                if (zp80Var212 != null) {
                    zp80Var212.n1.setTag(arrayList.get(i));
                    Unit unit177 = Unit.a;
                }
                zp80 zp80Var213 = this.binding;
                if (zp80Var213 != null) {
                    zp80Var213.r3.setBackground(context.getDrawable(R.color.default_spin2win_board));
                    Unit unit178 = Unit.a;
                }
                zp80 zp80Var214 = this.binding;
                if (zp80Var214 != null) {
                    zp80Var214.X1.setText("");
                    Unit unit179 = Unit.a;
                }
                zp80 zp80Var215 = this.binding;
                if (zp80Var215 != null) {
                    zp80Var215.H2.setText("");
                    Unit unit180 = Unit.a;
                }
                zp80 zp80Var216 = this.binding;
                O(zp80Var216 != null ? zp80Var216.X1 : null, zp80Var216 != null ? zp80Var216.H2 : null, zp80Var216 != null ? zp80Var216.D0 : null, zp80Var216 != null ? zp80Var216.T : null, (LocalGameDetailsEntity) arrayList.get(i), arrayList2);
            }
        }
        Unit unit181 = Unit.a;
    }

    public final void G(ImageView imageView, LocalGameDetailsEntity localGameDetailsEntity) {
        Integer num;
        Integer num2;
        Double betAmount;
        ImageView[] imageViewArr = this.G;
        if (imageViewArr != null) {
            int iIntValue = 0;
            for (ImageView imageView2 : imageViewArr) {
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
            }
            if (((localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue()) > 0.0d) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            v4b0 v4b0Var = this.H;
            if (((v4b0Var == null || (num2 = v4b0Var.c) == null) ? 0 : num2.intValue()) > 0) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            v4b0 v4b0Var2 = this.H;
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
    }

    public final ImageView[] H(String str) {
        ImageView[] imageViewArr = new ImageView[36];
        ImageView[] imageViewArr2 = this.G;
        if (imageViewArr2 != null) {
            int length = imageViewArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                ImageView imageView = imageViewArr2[i2];
                String lowerCase = null;
                Object tag = imageView != null ? imageView.getTag() : null;
                if (imageView != null) {
                    tag.getClass();
                    String color = ((LocalGameDetailsEntity) tag).getColor();
                    if (color != null) {
                        lowerCase = color.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    if (Intrinsics.g(lowerCase, str)) {
                        imageViewArr[i] = imageView;
                        i++;
                    }
                }
            }
        }
        return imageViewArr;
    }

    public final ImageView[] I(int i, int i2, String str) {
        ImageView[] imageViewArr = new ImageView[36];
        ImageView[] imageViewArr2 = this.G;
        if (imageViewArr2 != null) {
            int length = imageViewArr2.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                ImageView imageView = imageViewArr2[i4];
                String lowerCase = null;
                Object tag = imageView != null ? imageView.getTag() : null;
                if (imageView != null) {
                    tag.getClass();
                    LocalGameDetailsEntity localGameDetailsEntity = (LocalGameDetailsEntity) tag;
                    String color = localGameDetailsEntity.getColor();
                    if (color != null) {
                        lowerCase = color.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    if (Intrinsics.g(lowerCase, str)) {
                        Integer value = localGameDetailsEntity.getValue();
                        if ((value != null ? value.intValue() : 0) >= i) {
                            Integer value2 = localGameDetailsEntity.getValue();
                            if ((value2 != null ? value2.intValue() : 0) <= i2) {
                                imageViewArr[i3] = imageView;
                                i3++;
                            }
                        }
                    }
                }
            }
        }
        return imageViewArr;
    }

    public final void K(ImageView[] imageViewArr) {
        M();
        for (ImageView imageView : imageViewArr) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    public final void M() {
        ImageView[] imageViewArr = this.G;
        if (imageViewArr != null) {
            for (ImageView imageView : imageViewArr) {
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }
    }

    public final void N(ConstraintLayout constraintLayout) {
        View view;
        Context context = getContext();
        if (context == null || constraintLayout == null || LayoutInflater.from(context) == null || (view = this.J) == null) {
            return;
        }
        constraintLayout.removeView(view);
    }

    public final void O(TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, LocalGameDetailsEntity localGameDetailsEntity, ArrayList<Double> arrayList) {
        String strA;
        Double betAmount;
        Double betAmount2;
        if (((localGameDetailsEntity == null || (betAmount2 = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount2.doubleValue()) > 0.0d) {
            List<String> allBetAmountList = localGameDetailsEntity != null ? localGameDetailsEntity.getAllBetAmountList() : null;
            if (allBetAmountList != null && !allBetAmountList.isEmpty()) {
                if (textView != null) {
                    textView.setVisibility(4);
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
                    TreeMap treeMap = pw.a;
                    textView3.setText(pw.l((localGameDetailsEntity == null || (betAmount = localGameDetailsEntity.getBetAmount()) == null) ? 0.0d : betAmount.doubleValue()));
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                Double betAmount3 = localGameDetailsEntity != null ? localGameDetailsEntity.getBetAmount() : null;
                Context context = getContext();
                if (context != null) {
                    if (arrayList.isEmpty()) {
                        strA = "red";
                    } else {
                        Map<Double, String> map = jk2.a;
                        strA = jk2.a(betAmount3 != null ? betAmount3.doubleValue() : 0.0d, arrayList);
                    }
                    if (constraintLayout != null) {
                        Map<Double, String> map2 = jk2.a;
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

    public final void P(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, LocalGameDetailsEntity localGameDetailsEntity) {
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
                this.J = viewInflate;
                if (constraintLayout != null) {
                    constraintLayout.addView(viewInflate);
                }
                b bVar = new b();
                bVar.f(constraintLayout);
                View view = this.J;
                bVar.h(view != null ? view.getId() : 0, 4, 0, 4, 5);
                View view2 = this.J;
                bVar.h(view2 != null ? view2.getId() : 0, 7, 0, 7, 5);
                bVar.b(constraintLayout);
                View view3 = this.J;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v103, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v107, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v111, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v115, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v119, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v123, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v127, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v131, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v135, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v139, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v143, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v147, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v151, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v155, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v159, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v163, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v167, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v171, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v175, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v179, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v183, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v187, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v19, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v191, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v195, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v199, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v203, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v207, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v211, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v215, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v219, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v223, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v227, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v23, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v231, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v235, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v239, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v243, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v247, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v251, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v255, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v259, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v263, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v267, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v271, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v275, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v279, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v283, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v287, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v31, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v39, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v43, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v47, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v51, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v55, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v59, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v63, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v67, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v71, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v75, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v79, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v83, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v87, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v91, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v95, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r4v99, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.sportygames.spin2win.components.Spin2WinNumberBoard] */
    public final void Q(LocalGameDetailsEntity localGameDetailsEntity, ArrayList<Double> arrayList, String str) {
        Integer value = localGameDetailsEntity != null ? localGameDetailsEntity.getValue() : null;
        if (value != null && value.intValue() == 1) {
            boolean zG = Intrinsics.g(str, "fbg");
            zp80 zp80Var = this.binding;
            if (zG) {
                P(zp80Var != null ? zp80Var.O2 : null, zp80Var != null ? zp80Var.u1 : null, zp80Var != null ? zp80Var.e2 : null, zp80Var != null ? zp80Var.a0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var != null ? zp80Var.u1 : null, zp80Var != null ? zp80Var.e2 : null, zp80Var != null ? zp80Var.a0 : null, zp80Var != null ? zp80Var.b : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 2) {
            boolean zG2 = Intrinsics.g(str, "fbg");
            zp80 zp80Var2 = this.binding;
            if (zG2) {
                P(zp80Var2 != null ? zp80Var2.Z2 : null, zp80Var2 != null ? zp80Var2.F1 : null, zp80Var2 != null ? zp80Var2.p2 : null, zp80Var2 != null ? zp80Var2.l0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var2 != null ? zp80Var2.F1 : null, zp80Var2 != null ? zp80Var2.p2 : null, zp80Var2 != null ? zp80Var2.l0 : null, zp80Var2 != null ? zp80Var2.B : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 3) {
            boolean zG3 = Intrinsics.g(str, "fbg");
            zp80 zp80Var3 = this.binding;
            if (zG3) {
                P(zp80Var3 != null ? zp80Var3.k3 : null, zp80Var3 != null ? zp80Var3.Q1 : null, zp80Var3 != null ? zp80Var3.A2 : null, zp80Var3 != null ? zp80Var3.w0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var3 != null ? zp80Var3.Q1 : null, zp80Var3 != null ? zp80Var3.A2 : null, zp80Var3 != null ? zp80Var3.w0 : null, zp80Var3 != null ? zp80Var3.M : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 4) {
            boolean zG4 = Intrinsics.g(str, "fbg");
            zp80 zp80Var4 = this.binding;
            if (zG4) {
                P(zp80Var4 != null ? zp80Var4.s3 : null, zp80Var4 != null ? zp80Var4.Y1 : null, zp80Var4 != null ? zp80Var4.I2 : null, zp80Var4 != null ? zp80Var4.E0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var4 != null ? zp80Var4.Y1 : null, zp80Var4 != null ? zp80Var4.I2 : null, zp80Var4 != null ? zp80Var4.E0 : null, zp80Var4 != null ? zp80Var4.U : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 5) {
            boolean zG5 = Intrinsics.g(str, "fbg");
            zp80 zp80Var5 = this.binding;
            if (zG5) {
                P(zp80Var5 != null ? zp80Var5.t3 : null, zp80Var5 != null ? zp80Var5.Z1 : null, zp80Var5 != null ? zp80Var5.J2 : null, zp80Var5 != null ? zp80Var5.F0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var5 != null ? zp80Var5.Z1 : null, zp80Var5 != null ? zp80Var5.J2 : null, zp80Var5 != null ? zp80Var5.F0 : null, zp80Var5 != null ? zp80Var5.V : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 6) {
            boolean zG6 = Intrinsics.g(str, "fbg");
            zp80 zp80Var6 = this.binding;
            if (zG6) {
                P(zp80Var6 != null ? zp80Var6.u3 : null, zp80Var6 != null ? zp80Var6.a2 : null, zp80Var6 != null ? zp80Var6.K2 : null, zp80Var6 != null ? zp80Var6.G0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var6 != null ? zp80Var6.a2 : null, zp80Var6 != null ? zp80Var6.K2 : null, zp80Var6 != null ? zp80Var6.G0 : null, zp80Var6 != null ? zp80Var6.W : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 7) {
            boolean zG7 = Intrinsics.g(str, "fbg");
            zp80 zp80Var7 = this.binding;
            if (zG7) {
                P(zp80Var7 != null ? zp80Var7.v3 : null, zp80Var7 != null ? zp80Var7.b2 : null, zp80Var7 != null ? zp80Var7.L2 : null, zp80Var7 != null ? zp80Var7.H0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var7 != null ? zp80Var7.b2 : null, zp80Var7 != null ? zp80Var7.L2 : null, zp80Var7 != null ? zp80Var7.H0 : null, zp80Var7 != null ? zp80Var7.X : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 8) {
            boolean zG8 = Intrinsics.g(str, "fbg");
            zp80 zp80Var8 = this.binding;
            if (zG8) {
                P(zp80Var8 != null ? zp80Var8.w3 : null, zp80Var8 != null ? zp80Var8.c2 : null, zp80Var8 != null ? zp80Var8.M2 : null, zp80Var8 != null ? zp80Var8.I0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var8 != null ? zp80Var8.c2 : null, zp80Var8 != null ? zp80Var8.M2 : null, zp80Var8 != null ? zp80Var8.I0 : null, zp80Var8 != null ? zp80Var8.Y : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 9) {
            boolean zG9 = Intrinsics.g(str, "fbg");
            zp80 zp80Var9 = this.binding;
            if (zG9) {
                P(zp80Var9 != null ? zp80Var9.x3 : null, zp80Var9 != null ? zp80Var9.d2 : null, zp80Var9 != null ? zp80Var9.N2 : null, zp80Var9 != null ? zp80Var9.J0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var9 != null ? zp80Var9.d2 : null, zp80Var9 != null ? zp80Var9.N2 : null, zp80Var9 != null ? zp80Var9.J0 : null, zp80Var9 != null ? zp80Var9.Z : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 10) {
            boolean zG10 = Intrinsics.g(str, "fbg");
            zp80 zp80Var10 = this.binding;
            if (zG10) {
                P(zp80Var10 != null ? zp80Var10.P2 : null, zp80Var10 != null ? zp80Var10.v1 : null, zp80Var10 != null ? zp80Var10.f2 : null, zp80Var10 != null ? zp80Var10.b0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var10 != null ? zp80Var10.v1 : null, zp80Var10 != null ? zp80Var10.f2 : null, zp80Var10 != null ? zp80Var10.b0 : null, zp80Var10 != null ? zp80Var10.c : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 11) {
            boolean zG11 = Intrinsics.g(str, "fbg");
            zp80 zp80Var11 = this.binding;
            if (zG11) {
                P(zp80Var11 != null ? zp80Var11.Q2 : null, zp80Var11 != null ? zp80Var11.w1 : null, zp80Var11 != null ? zp80Var11.g2 : null, zp80Var11 != null ? zp80Var11.c0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var11 != null ? zp80Var11.w1 : null, zp80Var11 != null ? zp80Var11.g2 : null, zp80Var11 != null ? zp80Var11.c0 : null, zp80Var11 != null ? zp80Var11.d : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 12) {
            boolean zG12 = Intrinsics.g(str, "fbg");
            zp80 zp80Var12 = this.binding;
            if (zG12) {
                P(zp80Var12 != null ? zp80Var12.R2 : null, zp80Var12 != null ? zp80Var12.x1 : null, zp80Var12 != null ? zp80Var12.h2 : null, zp80Var12 != null ? zp80Var12.d0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var12 != null ? zp80Var12.x1 : null, zp80Var12 != null ? zp80Var12.h2 : null, zp80Var12 != null ? zp80Var12.d0 : null, zp80Var12 != null ? zp80Var12.e : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 13) {
            boolean zG13 = Intrinsics.g(str, "fbg");
            zp80 zp80Var13 = this.binding;
            if (zG13) {
                P(zp80Var13 != null ? zp80Var13.S2 : null, zp80Var13 != null ? zp80Var13.y1 : null, zp80Var13 != null ? zp80Var13.i2 : null, zp80Var13 != null ? zp80Var13.e0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var13 != null ? zp80Var13.y1 : null, zp80Var13 != null ? zp80Var13.i2 : null, zp80Var13 != null ? zp80Var13.e0 : null, zp80Var13 != null ? zp80Var13.f : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 14) {
            boolean zG14 = Intrinsics.g(str, "fbg");
            zp80 zp80Var14 = this.binding;
            if (zG14) {
                P(zp80Var14 != null ? zp80Var14.T2 : null, zp80Var14 != null ? zp80Var14.z1 : null, zp80Var14 != null ? zp80Var14.j2 : null, zp80Var14 != null ? zp80Var14.f0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var14 != null ? zp80Var14.z1 : null, zp80Var14 != null ? zp80Var14.j2 : null, zp80Var14 != null ? zp80Var14.f0 : null, zp80Var14 != null ? zp80Var14.i : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 15) {
            boolean zG15 = Intrinsics.g(str, "fbg");
            zp80 zp80Var15 = this.binding;
            if (zG15) {
                P(zp80Var15 != null ? zp80Var15.U2 : null, zp80Var15 != null ? zp80Var15.A1 : null, zp80Var15 != null ? zp80Var15.k2 : null, zp80Var15 != null ? zp80Var15.g0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var15 != null ? zp80Var15.A1 : null, zp80Var15 != null ? zp80Var15.k2 : null, zp80Var15 != null ? zp80Var15.g0 : null, zp80Var15 != null ? zp80Var15.v : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 16) {
            boolean zG16 = Intrinsics.g(str, "fbg");
            zp80 zp80Var16 = this.binding;
            if (zG16) {
                P(zp80Var16 != null ? zp80Var16.V2 : null, zp80Var16 != null ? zp80Var16.B1 : null, zp80Var16 != null ? zp80Var16.l2 : null, zp80Var16 != null ? zp80Var16.h0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var16 != null ? zp80Var16.B1 : null, zp80Var16 != null ? zp80Var16.l2 : null, zp80Var16 != null ? zp80Var16.h0 : null, zp80Var16 != null ? zp80Var16.w : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 17) {
            boolean zG17 = Intrinsics.g(str, "fbg");
            zp80 zp80Var17 = this.binding;
            if (zG17) {
                P(zp80Var17 != null ? zp80Var17.W2 : null, zp80Var17 != null ? zp80Var17.C1 : null, zp80Var17 != null ? zp80Var17.m2 : null, zp80Var17 != null ? zp80Var17.i0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var17 != null ? zp80Var17.C1 : null, zp80Var17 != null ? zp80Var17.m2 : null, zp80Var17 != null ? zp80Var17.i0 : null, zp80Var17 != null ? zp80Var17.y : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 18) {
            boolean zG18 = Intrinsics.g(str, "fbg");
            zp80 zp80Var18 = this.binding;
            if (zG18) {
                P(zp80Var18 != null ? zp80Var18.X2 : null, zp80Var18 != null ? zp80Var18.D1 : null, zp80Var18 != null ? zp80Var18.n2 : null, zp80Var18 != null ? zp80Var18.j0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var18 != null ? zp80Var18.D1 : null, zp80Var18 != null ? zp80Var18.n2 : null, zp80Var18 != null ? zp80Var18.j0 : null, zp80Var18 != null ? zp80Var18.z : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 19) {
            boolean zG19 = Intrinsics.g(str, "fbg");
            zp80 zp80Var19 = this.binding;
            if (zG19) {
                P(zp80Var19 != null ? zp80Var19.Y2 : null, zp80Var19 != null ? zp80Var19.E1 : null, zp80Var19 != null ? zp80Var19.o2 : null, zp80Var19 != null ? zp80Var19.k0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var19 != null ? zp80Var19.E1 : null, zp80Var19 != null ? zp80Var19.o2 : null, zp80Var19 != null ? zp80Var19.k0 : null, zp80Var19 != null ? zp80Var19.A : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 20) {
            boolean zG20 = Intrinsics.g(str, "fbg");
            zp80 zp80Var20 = this.binding;
            if (zG20) {
                P(zp80Var20 != null ? zp80Var20.a3 : null, zp80Var20 != null ? zp80Var20.G1 : null, zp80Var20 != null ? zp80Var20.q2 : null, zp80Var20 != null ? zp80Var20.m0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var20 != null ? zp80Var20.G1 : null, zp80Var20 != null ? zp80Var20.q2 : null, zp80Var20 != null ? zp80Var20.m0 : null, zp80Var20 != null ? zp80Var20.C : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 21) {
            boolean zG21 = Intrinsics.g(str, "fbg");
            zp80 zp80Var21 = this.binding;
            if (zG21) {
                P(zp80Var21 != null ? zp80Var21.b3 : null, zp80Var21 != null ? zp80Var21.H1 : null, zp80Var21 != null ? zp80Var21.r2 : null, zp80Var21 != null ? zp80Var21.n0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var21 != null ? zp80Var21.H1 : null, zp80Var21 != null ? zp80Var21.r2 : null, zp80Var21 != null ? zp80Var21.n0 : null, zp80Var21 != null ? zp80Var21.D : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 22) {
            boolean zG22 = Intrinsics.g(str, "fbg");
            zp80 zp80Var22 = this.binding;
            if (zG22) {
                P(zp80Var22 != null ? zp80Var22.c3 : null, zp80Var22 != null ? zp80Var22.I1 : null, zp80Var22 != null ? zp80Var22.s2 : null, zp80Var22 != null ? zp80Var22.o0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var22 != null ? zp80Var22.I1 : null, zp80Var22 != null ? zp80Var22.s2 : null, zp80Var22 != null ? zp80Var22.o0 : null, zp80Var22 != null ? zp80Var22.E : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 23) {
            boolean zG23 = Intrinsics.g(str, "fbg");
            zp80 zp80Var23 = this.binding;
            if (zG23) {
                P(zp80Var23 != null ? zp80Var23.d3 : null, zp80Var23 != null ? zp80Var23.J1 : null, zp80Var23 != null ? zp80Var23.t2 : null, zp80Var23 != null ? zp80Var23.p0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var23 != null ? zp80Var23.J1 : null, zp80Var23 != null ? zp80Var23.t2 : null, zp80Var23 != null ? zp80Var23.p0 : null, zp80Var23 != null ? zp80Var23.F : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 24) {
            boolean zG24 = Intrinsics.g(str, "fbg");
            zp80 zp80Var24 = this.binding;
            if (zG24) {
                P(zp80Var24 != null ? zp80Var24.e3 : null, zp80Var24 != null ? zp80Var24.K1 : null, zp80Var24 != null ? zp80Var24.u2 : null, zp80Var24 != null ? zp80Var24.q0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var24 != null ? zp80Var24.K1 : null, zp80Var24 != null ? zp80Var24.u2 : null, zp80Var24 != null ? zp80Var24.q0 : null, zp80Var24 != null ? zp80Var24.G : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 25) {
            boolean zG25 = Intrinsics.g(str, "fbg");
            zp80 zp80Var25 = this.binding;
            if (zG25) {
                P(zp80Var25 != null ? zp80Var25.f3 : null, zp80Var25 != null ? zp80Var25.L1 : null, zp80Var25 != null ? zp80Var25.v2 : null, zp80Var25 != null ? zp80Var25.r0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var25 != null ? zp80Var25.L1 : null, zp80Var25 != null ? zp80Var25.v2 : null, zp80Var25 != null ? zp80Var25.r0 : null, zp80Var25 != null ? zp80Var25.H : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 26) {
            boolean zG26 = Intrinsics.g(str, "fbg");
            zp80 zp80Var26 = this.binding;
            if (zG26) {
                P(zp80Var26 != null ? zp80Var26.g3 : null, zp80Var26 != null ? zp80Var26.M1 : null, zp80Var26 != null ? zp80Var26.w2 : null, zp80Var26 != null ? zp80Var26.s0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var26 != null ? zp80Var26.M1 : null, zp80Var26 != null ? zp80Var26.w2 : null, zp80Var26 != null ? zp80Var26.s0 : null, zp80Var26 != null ? zp80Var26.I : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 27) {
            boolean zG27 = Intrinsics.g(str, "fbg");
            zp80 zp80Var27 = this.binding;
            if (zG27) {
                P(zp80Var27 != null ? zp80Var27.h3 : null, zp80Var27 != null ? zp80Var27.N1 : null, zp80Var27 != null ? zp80Var27.x2 : null, zp80Var27 != null ? zp80Var27.t0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var27 != null ? zp80Var27.N1 : null, zp80Var27 != null ? zp80Var27.x2 : null, zp80Var27 != null ? zp80Var27.t0 : null, zp80Var27 != null ? zp80Var27.J : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 28) {
            boolean zG28 = Intrinsics.g(str, "fbg");
            zp80 zp80Var28 = this.binding;
            if (zG28) {
                P(zp80Var28 != null ? zp80Var28.i3 : null, zp80Var28 != null ? zp80Var28.O1 : null, zp80Var28 != null ? zp80Var28.y2 : null, zp80Var28 != null ? zp80Var28.u0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var28 != null ? zp80Var28.O1 : null, zp80Var28 != null ? zp80Var28.y2 : null, zp80Var28 != null ? zp80Var28.u0 : null, zp80Var28 != null ? zp80Var28.K : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 29) {
            boolean zG29 = Intrinsics.g(str, "fbg");
            zp80 zp80Var29 = this.binding;
            if (zG29) {
                P(zp80Var29 != null ? zp80Var29.j3 : null, zp80Var29 != null ? zp80Var29.P1 : null, zp80Var29 != null ? zp80Var29.z2 : null, zp80Var29 != null ? zp80Var29.v0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var29 != null ? zp80Var29.P1 : null, zp80Var29 != null ? zp80Var29.z2 : null, zp80Var29 != null ? zp80Var29.v0 : null, zp80Var29 != null ? zp80Var29.L : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 30) {
            boolean zG30 = Intrinsics.g(str, "fbg");
            zp80 zp80Var30 = this.binding;
            if (zG30) {
                P(zp80Var30 != null ? zp80Var30.l3 : null, zp80Var30 != null ? zp80Var30.R1 : null, zp80Var30 != null ? zp80Var30.B2 : null, zp80Var30 != null ? zp80Var30.x0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var30 != null ? zp80Var30.R1 : null, zp80Var30 != null ? zp80Var30.B2 : null, zp80Var30 != null ? zp80Var30.x0 : null, zp80Var30 != null ? zp80Var30.N : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 31) {
            boolean zG31 = Intrinsics.g(str, "fbg");
            zp80 zp80Var31 = this.binding;
            if (zG31) {
                P(zp80Var31 != null ? zp80Var31.m3 : null, zp80Var31 != null ? zp80Var31.S1 : null, zp80Var31 != null ? zp80Var31.C2 : null, zp80Var31 != null ? zp80Var31.y0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var31 != null ? zp80Var31.S1 : null, zp80Var31 != null ? zp80Var31.C2 : null, zp80Var31 != null ? zp80Var31.y0 : null, zp80Var31 != null ? zp80Var31.O : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 32) {
            boolean zG32 = Intrinsics.g(str, "fbg");
            zp80 zp80Var32 = this.binding;
            if (zG32) {
                P(zp80Var32 != null ? zp80Var32.n3 : null, zp80Var32 != null ? zp80Var32.T1 : null, zp80Var32 != null ? zp80Var32.D2 : null, zp80Var32 != null ? zp80Var32.z0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var32 != null ? zp80Var32.T1 : null, zp80Var32 != null ? zp80Var32.D2 : null, zp80Var32 != null ? zp80Var32.z0 : null, zp80Var32 != null ? zp80Var32.P : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 33) {
            boolean zG33 = Intrinsics.g(str, "fbg");
            zp80 zp80Var33 = this.binding;
            if (zG33) {
                P(zp80Var33 != null ? zp80Var33.o3 : null, zp80Var33 != null ? zp80Var33.U1 : null, zp80Var33 != null ? zp80Var33.E2 : null, zp80Var33 != null ? zp80Var33.A0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var33 != null ? zp80Var33.U1 : null, zp80Var33 != null ? zp80Var33.E2 : null, zp80Var33 != null ? zp80Var33.A0 : null, zp80Var33 != null ? zp80Var33.Q : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 34) {
            boolean zG34 = Intrinsics.g(str, "fbg");
            zp80 zp80Var34 = this.binding;
            if (zG34) {
                P(zp80Var34 != null ? zp80Var34.p3 : null, zp80Var34 != null ? zp80Var34.V1 : null, zp80Var34 != null ? zp80Var34.F2 : null, zp80Var34 != null ? zp80Var34.B0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var34 != null ? zp80Var34.V1 : null, zp80Var34 != null ? zp80Var34.F2 : null, zp80Var34 != null ? zp80Var34.B0 : null, zp80Var34 != null ? zp80Var34.R : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 35) {
            boolean zG35 = Intrinsics.g(str, "fbg");
            zp80 zp80Var35 = this.binding;
            if (zG35) {
                P(zp80Var35 != null ? zp80Var35.q3 : null, zp80Var35 != null ? zp80Var35.W1 : null, zp80Var35 != null ? zp80Var35.G2 : null, zp80Var35 != null ? zp80Var35.C0 : null, localGameDetailsEntity);
                return;
            } else {
                O(zp80Var35 != null ? zp80Var35.W1 : null, zp80Var35 != null ? zp80Var35.G2 : null, zp80Var35 != null ? zp80Var35.C0 : null, zp80Var35 != null ? zp80Var35.S : null, localGameDetailsEntity, arrayList);
                return;
            }
        }
        if (value != null && value.intValue() == 36) {
            boolean zG36 = Intrinsics.g(str, "fbg");
            zp80 zp80Var36 = this.binding;
            if (zG36) {
                P(zp80Var36 != null ? zp80Var36.r3 : null, zp80Var36 != null ? zp80Var36.X1 : null, zp80Var36 != null ? zp80Var36.H2 : null, zp80Var36 != null ? zp80Var36.D0 : null, localGameDetailsEntity);
            } else {
                O(zp80Var36 != null ? zp80Var36.X1 : null, zp80Var36 != null ? zp80Var36.H2 : null, zp80Var36 != null ? zp80Var36.D0 : null, zp80Var36 != null ? zp80Var36.T : null, localGameDetailsEntity, arrayList);
            }
        }
    }

    public final zp80 getBinding() {
        return this.binding;
    }

    public final boolean getFbgApplied() {
        return this.fbgApplied;
    }

    public final void setBinding(zp80 zp80Var) {
        this.binding = zp80Var;
    }

    public final void setFbgApplied(boolean z) {
        this.fbgApplied = z;
    }

    public final void setNumberBoardData(List<LocalGameDetailsEntity> filterData, ArrayList<Double> betChipList) {
        Context context;
        if (filterData == null || filterData.isEmpty() || (context = getContext()) == null) {
            return;
        }
        int size = filterData.size();
        for (int i = 0; i < size; i++) {
            Integer value = filterData.get(i).getValue();
            if (value != null && value.intValue() == 1) {
                zp80 zp80Var = this.binding;
                if (zp80Var != null) {
                    zp80Var.O2.setTag(filterData.get(i));
                    Unit unit = Unit.a;
                }
                zp80 zp80Var2 = this.binding;
                if (zp80Var2 != null) {
                    zp80Var2.K0.setTag(filterData.get(i));
                    Unit unit2 = Unit.a;
                }
                zp80 zp80Var3 = this.binding;
                if (zp80Var3 != null) {
                    zp80Var3.O2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit3 = Unit.a;
                }
                zp80 zp80Var4 = this.binding;
                if (zp80Var4 != null) {
                    kya0.a(filterData.get(i), zp80Var4.u1);
                    Unit unit4 = Unit.a;
                }
                zp80 zp80Var5 = this.binding;
                if (zp80Var5 != null) {
                    kya0.a(filterData.get(i), zp80Var5.e2);
                    Unit unit5 = Unit.a;
                }
                zp80 zp80Var6 = this.binding;
                O(zp80Var6 != null ? zp80Var6.u1 : null, zp80Var6 != null ? zp80Var6.e2 : null, zp80Var6 != null ? zp80Var6.a0 : null, zp80Var6 != null ? zp80Var6.b : null, filterData.get(i), betChipList);
                zp80 zp80Var7 = this.binding;
                N(zp80Var7 != null ? zp80Var7.O2 : null);
            } else if (value != null && value.intValue() == 2) {
                zp80 zp80Var8 = this.binding;
                if (zp80Var8 != null) {
                    zp80Var8.Z2.setTag(filterData.get(i));
                    Unit unit6 = Unit.a;
                }
                zp80 zp80Var9 = this.binding;
                if (zp80Var9 != null) {
                    zp80Var9.V0.setTag(filterData.get(i));
                    Unit unit7 = Unit.a;
                }
                zp80 zp80Var10 = this.binding;
                if (zp80Var10 != null) {
                    zp80Var10.Z2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit8 = Unit.a;
                }
                zp80 zp80Var11 = this.binding;
                if (zp80Var11 != null) {
                    kya0.a(filterData.get(i), zp80Var11.F1);
                    Unit unit9 = Unit.a;
                }
                zp80 zp80Var12 = this.binding;
                if (zp80Var12 != null) {
                    kya0.a(filterData.get(i), zp80Var12.p2);
                    Unit unit10 = Unit.a;
                }
                zp80 zp80Var13 = this.binding;
                N(zp80Var13 != null ? zp80Var13.Z2 : null);
                zp80 zp80Var14 = this.binding;
                O(zp80Var14 != null ? zp80Var14.F1 : null, zp80Var14 != null ? zp80Var14.p2 : null, zp80Var14 != null ? zp80Var14.l0 : null, zp80Var14 != null ? zp80Var14.B : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 3) {
                zp80 zp80Var15 = this.binding;
                if (zp80Var15 != null) {
                    zp80Var15.k3.setTag(filterData.get(i));
                    Unit unit11 = Unit.a;
                }
                zp80 zp80Var16 = this.binding;
                if (zp80Var16 != null) {
                    zp80Var16.g1.setTag(filterData.get(i));
                    Unit unit12 = Unit.a;
                }
                zp80 zp80Var17 = this.binding;
                if (zp80Var17 != null) {
                    zp80Var17.k3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit13 = Unit.a;
                }
                zp80 zp80Var18 = this.binding;
                if (zp80Var18 != null) {
                    kya0.a(filterData.get(i), zp80Var18.Q1);
                    Unit unit14 = Unit.a;
                }
                zp80 zp80Var19 = this.binding;
                if (zp80Var19 != null) {
                    kya0.a(filterData.get(i), zp80Var19.A2);
                    Unit unit15 = Unit.a;
                }
                zp80 zp80Var20 = this.binding;
                N(zp80Var20 != null ? zp80Var20.k3 : null);
                zp80 zp80Var21 = this.binding;
                O(zp80Var21 != null ? zp80Var21.Q1 : null, zp80Var21 != null ? zp80Var21.A2 : null, zp80Var21 != null ? zp80Var21.w0 : null, zp80Var21 != null ? zp80Var21.M : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 4) {
                zp80 zp80Var22 = this.binding;
                if (zp80Var22 != null) {
                    zp80Var22.s3.setTag(filterData.get(i));
                    Unit unit16 = Unit.a;
                }
                zp80 zp80Var23 = this.binding;
                if (zp80Var23 != null) {
                    zp80Var23.o1.setTag(filterData.get(i));
                    Unit unit17 = Unit.a;
                }
                zp80 zp80Var24 = this.binding;
                if (zp80Var24 != null) {
                    zp80Var24.s3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit18 = Unit.a;
                }
                zp80 zp80Var25 = this.binding;
                if (zp80Var25 != null) {
                    kya0.a(filterData.get(i), zp80Var25.Y1);
                    Unit unit19 = Unit.a;
                }
                zp80 zp80Var26 = this.binding;
                if (zp80Var26 != null) {
                    kya0.a(filterData.get(i), zp80Var26.I2);
                    Unit unit20 = Unit.a;
                }
                zp80 zp80Var27 = this.binding;
                N(zp80Var27 != null ? zp80Var27.s3 : null);
                zp80 zp80Var28 = this.binding;
                O(zp80Var28 != null ? zp80Var28.Y1 : null, zp80Var28 != null ? zp80Var28.I2 : null, zp80Var28 != null ? zp80Var28.E0 : null, zp80Var28 != null ? zp80Var28.U : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 5) {
                zp80 zp80Var29 = this.binding;
                if (zp80Var29 != null) {
                    zp80Var29.t3.setTag(filterData.get(i));
                    Unit unit21 = Unit.a;
                }
                zp80 zp80Var30 = this.binding;
                if (zp80Var30 != null) {
                    zp80Var30.p1.setTag(filterData.get(i));
                    Unit unit22 = Unit.a;
                }
                zp80 zp80Var31 = this.binding;
                if (zp80Var31 != null) {
                    zp80Var31.t3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit23 = Unit.a;
                }
                zp80 zp80Var32 = this.binding;
                if (zp80Var32 != null) {
                    kya0.a(filterData.get(i), zp80Var32.Z1);
                    Unit unit24 = Unit.a;
                }
                zp80 zp80Var33 = this.binding;
                if (zp80Var33 != null) {
                    kya0.a(filterData.get(i), zp80Var33.J2);
                    Unit unit25 = Unit.a;
                }
                zp80 zp80Var34 = this.binding;
                N(zp80Var34 != null ? zp80Var34.t3 : null);
                zp80 zp80Var35 = this.binding;
                O(zp80Var35 != null ? zp80Var35.Z1 : null, zp80Var35 != null ? zp80Var35.J2 : null, zp80Var35 != null ? zp80Var35.F0 : null, zp80Var35 != null ? zp80Var35.V : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 6) {
                zp80 zp80Var36 = this.binding;
                if (zp80Var36 != null) {
                    zp80Var36.u3.setTag(filterData.get(i));
                    Unit unit26 = Unit.a;
                }
                zp80 zp80Var37 = this.binding;
                if (zp80Var37 != null) {
                    zp80Var37.q1.setTag(filterData.get(i));
                    Unit unit27 = Unit.a;
                }
                zp80 zp80Var38 = this.binding;
                if (zp80Var38 != null) {
                    zp80Var38.u3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit28 = Unit.a;
                }
                zp80 zp80Var39 = this.binding;
                if (zp80Var39 != null) {
                    kya0.a(filterData.get(i), zp80Var39.a2);
                    Unit unit29 = Unit.a;
                }
                zp80 zp80Var40 = this.binding;
                if (zp80Var40 != null) {
                    kya0.a(filterData.get(i), zp80Var40.K2);
                    Unit unit30 = Unit.a;
                }
                zp80 zp80Var41 = this.binding;
                N(zp80Var41 != null ? zp80Var41.u3 : null);
                zp80 zp80Var42 = this.binding;
                O(zp80Var42 != null ? zp80Var42.a2 : null, zp80Var42 != null ? zp80Var42.K2 : null, zp80Var42 != null ? zp80Var42.G0 : null, zp80Var42 != null ? zp80Var42.W : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 7) {
                zp80 zp80Var43 = this.binding;
                if (zp80Var43 != null) {
                    zp80Var43.v3.setTag(filterData.get(i));
                    Unit unit31 = Unit.a;
                }
                zp80 zp80Var44 = this.binding;
                if (zp80Var44 != null) {
                    zp80Var44.r1.setTag(filterData.get(i));
                    Unit unit32 = Unit.a;
                }
                zp80 zp80Var45 = this.binding;
                if (zp80Var45 != null) {
                    zp80Var45.v3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit33 = Unit.a;
                }
                zp80 zp80Var46 = this.binding;
                if (zp80Var46 != null) {
                    kya0.a(filterData.get(i), zp80Var46.b2);
                    Unit unit34 = Unit.a;
                }
                zp80 zp80Var47 = this.binding;
                if (zp80Var47 != null) {
                    kya0.a(filterData.get(i), zp80Var47.L2);
                    Unit unit35 = Unit.a;
                }
                zp80 zp80Var48 = this.binding;
                N(zp80Var48 != null ? zp80Var48.v3 : null);
                zp80 zp80Var49 = this.binding;
                O(zp80Var49 != null ? zp80Var49.b2 : null, zp80Var49 != null ? zp80Var49.L2 : null, zp80Var49 != null ? zp80Var49.H0 : null, zp80Var49 != null ? zp80Var49.X : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 8) {
                zp80 zp80Var50 = this.binding;
                if (zp80Var50 != null) {
                    zp80Var50.w3.setTag(filterData.get(i));
                    Unit unit36 = Unit.a;
                }
                zp80 zp80Var51 = this.binding;
                if (zp80Var51 != null) {
                    zp80Var51.s1.setTag(filterData.get(i));
                    Unit unit37 = Unit.a;
                }
                zp80 zp80Var52 = this.binding;
                if (zp80Var52 != null) {
                    zp80Var52.w3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit38 = Unit.a;
                }
                zp80 zp80Var53 = this.binding;
                if (zp80Var53 != null) {
                    kya0.a(filterData.get(i), zp80Var53.c2);
                    Unit unit39 = Unit.a;
                }
                zp80 zp80Var54 = this.binding;
                if (zp80Var54 != null) {
                    kya0.a(filterData.get(i), zp80Var54.M2);
                    Unit unit40 = Unit.a;
                }
                zp80 zp80Var55 = this.binding;
                N(zp80Var55 != null ? zp80Var55.w3 : null);
                zp80 zp80Var56 = this.binding;
                O(zp80Var56 != null ? zp80Var56.c2 : null, zp80Var56 != null ? zp80Var56.M2 : null, zp80Var56 != null ? zp80Var56.I0 : null, zp80Var56 != null ? zp80Var56.Y : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 9) {
                zp80 zp80Var57 = this.binding;
                if (zp80Var57 != null) {
                    zp80Var57.x3.setTag(filterData.get(i));
                    Unit unit41 = Unit.a;
                }
                zp80 zp80Var58 = this.binding;
                if (zp80Var58 != null) {
                    zp80Var58.t1.setTag(filterData.get(i));
                    Unit unit42 = Unit.a;
                }
                zp80 zp80Var59 = this.binding;
                if (zp80Var59 != null) {
                    zp80Var59.x3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit43 = Unit.a;
                }
                zp80 zp80Var60 = this.binding;
                if (zp80Var60 != null) {
                    kya0.a(filterData.get(i), zp80Var60.d2);
                    Unit unit44 = Unit.a;
                }
                zp80 zp80Var61 = this.binding;
                if (zp80Var61 != null) {
                    kya0.a(filterData.get(i), zp80Var61.N2);
                    Unit unit45 = Unit.a;
                }
                zp80 zp80Var62 = this.binding;
                N(zp80Var62 != null ? zp80Var62.x3 : null);
                zp80 zp80Var63 = this.binding;
                O(zp80Var63 != null ? zp80Var63.d2 : null, zp80Var63 != null ? zp80Var63.N2 : null, zp80Var63 != null ? zp80Var63.J0 : null, zp80Var63 != null ? zp80Var63.Z : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 10) {
                zp80 zp80Var64 = this.binding;
                if (zp80Var64 != null) {
                    zp80Var64.P2.setTag(filterData.get(i));
                    Unit unit46 = Unit.a;
                }
                zp80 zp80Var65 = this.binding;
                if (zp80Var65 != null) {
                    zp80Var65.L0.setTag(filterData.get(i));
                    Unit unit47 = Unit.a;
                }
                zp80 zp80Var66 = this.binding;
                if (zp80Var66 != null) {
                    zp80Var66.P2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit48 = Unit.a;
                }
                zp80 zp80Var67 = this.binding;
                if (zp80Var67 != null) {
                    kya0.a(filterData.get(i), zp80Var67.v1);
                    Unit unit49 = Unit.a;
                }
                zp80 zp80Var68 = this.binding;
                if (zp80Var68 != null) {
                    kya0.a(filterData.get(i), zp80Var68.f2);
                    Unit unit50 = Unit.a;
                }
                zp80 zp80Var69 = this.binding;
                N(zp80Var69 != null ? zp80Var69.P2 : null);
                zp80 zp80Var70 = this.binding;
                O(zp80Var70 != null ? zp80Var70.v1 : null, zp80Var70 != null ? zp80Var70.f2 : null, zp80Var70 != null ? zp80Var70.b0 : null, zp80Var70 != null ? zp80Var70.c : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 11) {
                zp80 zp80Var71 = this.binding;
                if (zp80Var71 != null) {
                    zp80Var71.Q2.setTag(filterData.get(i));
                    Unit unit51 = Unit.a;
                }
                zp80 zp80Var72 = this.binding;
                if (zp80Var72 != null) {
                    zp80Var72.M0.setTag(filterData.get(i));
                    Unit unit52 = Unit.a;
                }
                zp80 zp80Var73 = this.binding;
                if (zp80Var73 != null) {
                    zp80Var73.Q2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit53 = Unit.a;
                }
                zp80 zp80Var74 = this.binding;
                if (zp80Var74 != null) {
                    kya0.a(filterData.get(i), zp80Var74.w1);
                    Unit unit54 = Unit.a;
                }
                zp80 zp80Var75 = this.binding;
                if (zp80Var75 != null) {
                    kya0.a(filterData.get(i), zp80Var75.g2);
                    Unit unit55 = Unit.a;
                }
                zp80 zp80Var76 = this.binding;
                N(zp80Var76 != null ? zp80Var76.Q2 : null);
                zp80 zp80Var77 = this.binding;
                O(zp80Var77 != null ? zp80Var77.w1 : null, zp80Var77 != null ? zp80Var77.g2 : null, zp80Var77 != null ? zp80Var77.c0 : null, zp80Var77 != null ? zp80Var77.d : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 12) {
                zp80 zp80Var78 = this.binding;
                if (zp80Var78 != null) {
                    zp80Var78.R2.setTag(filterData.get(i));
                    Unit unit56 = Unit.a;
                }
                zp80 zp80Var79 = this.binding;
                if (zp80Var79 != null) {
                    zp80Var79.N0.setTag(filterData.get(i));
                    Unit unit57 = Unit.a;
                }
                zp80 zp80Var80 = this.binding;
                if (zp80Var80 != null) {
                    zp80Var80.R2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit58 = Unit.a;
                }
                zp80 zp80Var81 = this.binding;
                if (zp80Var81 != null) {
                    kya0.a(filterData.get(i), zp80Var81.x1);
                    Unit unit59 = Unit.a;
                }
                zp80 zp80Var82 = this.binding;
                if (zp80Var82 != null) {
                    kya0.a(filterData.get(i), zp80Var82.h2);
                    Unit unit60 = Unit.a;
                }
                zp80 zp80Var83 = this.binding;
                N(zp80Var83 != null ? zp80Var83.R2 : null);
                zp80 zp80Var84 = this.binding;
                O(zp80Var84 != null ? zp80Var84.x1 : null, zp80Var84 != null ? zp80Var84.h2 : null, zp80Var84 != null ? zp80Var84.d0 : null, zp80Var84 != null ? zp80Var84.e : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 13) {
                zp80 zp80Var85 = this.binding;
                if (zp80Var85 != null) {
                    zp80Var85.S2.setTag(filterData.get(i));
                    Unit unit61 = Unit.a;
                }
                zp80 zp80Var86 = this.binding;
                if (zp80Var86 != null) {
                    zp80Var86.O0.setTag(filterData.get(i));
                    Unit unit62 = Unit.a;
                }
                zp80 zp80Var87 = this.binding;
                if (zp80Var87 != null) {
                    zp80Var87.S2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit63 = Unit.a;
                }
                zp80 zp80Var88 = this.binding;
                if (zp80Var88 != null) {
                    kya0.a(filterData.get(i), zp80Var88.y1);
                    Unit unit64 = Unit.a;
                }
                zp80 zp80Var89 = this.binding;
                if (zp80Var89 != null) {
                    kya0.a(filterData.get(i), zp80Var89.i2);
                    Unit unit65 = Unit.a;
                }
                zp80 zp80Var90 = this.binding;
                N(zp80Var90 != null ? zp80Var90.S2 : null);
                zp80 zp80Var91 = this.binding;
                O(zp80Var91 != null ? zp80Var91.y1 : null, zp80Var91 != null ? zp80Var91.i2 : null, zp80Var91 != null ? zp80Var91.e0 : null, zp80Var91 != null ? zp80Var91.f : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 14) {
                zp80 zp80Var92 = this.binding;
                if (zp80Var92 != null) {
                    zp80Var92.T2.setTag(filterData.get(i));
                    Unit unit66 = Unit.a;
                }
                zp80 zp80Var93 = this.binding;
                if (zp80Var93 != null) {
                    zp80Var93.P0.setTag(filterData.get(i));
                    Unit unit67 = Unit.a;
                }
                zp80 zp80Var94 = this.binding;
                if (zp80Var94 != null) {
                    zp80Var94.T2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit68 = Unit.a;
                }
                zp80 zp80Var95 = this.binding;
                if (zp80Var95 != null) {
                    kya0.a(filterData.get(i), zp80Var95.z1);
                    Unit unit69 = Unit.a;
                }
                zp80 zp80Var96 = this.binding;
                if (zp80Var96 != null) {
                    kya0.a(filterData.get(i), zp80Var96.j2);
                    Unit unit70 = Unit.a;
                }
                zp80 zp80Var97 = this.binding;
                N(zp80Var97 != null ? zp80Var97.T2 : null);
                zp80 zp80Var98 = this.binding;
                O(zp80Var98 != null ? zp80Var98.z1 : null, zp80Var98 != null ? zp80Var98.j2 : null, zp80Var98 != null ? zp80Var98.f0 : null, zp80Var98 != null ? zp80Var98.i : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 15) {
                zp80 zp80Var99 = this.binding;
                if (zp80Var99 != null) {
                    zp80Var99.U2.setTag(filterData.get(i));
                    Unit unit71 = Unit.a;
                }
                zp80 zp80Var100 = this.binding;
                if (zp80Var100 != null) {
                    zp80Var100.Q0.setTag(filterData.get(i));
                    Unit unit72 = Unit.a;
                }
                zp80 zp80Var101 = this.binding;
                if (zp80Var101 != null) {
                    zp80Var101.U2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit73 = Unit.a;
                }
                zp80 zp80Var102 = this.binding;
                if (zp80Var102 != null) {
                    kya0.a(filterData.get(i), zp80Var102.A1);
                    Unit unit74 = Unit.a;
                }
                zp80 zp80Var103 = this.binding;
                if (zp80Var103 != null) {
                    kya0.a(filterData.get(i), zp80Var103.k2);
                    Unit unit75 = Unit.a;
                }
                zp80 zp80Var104 = this.binding;
                N(zp80Var104 != null ? zp80Var104.U2 : null);
                zp80 zp80Var105 = this.binding;
                O(zp80Var105 != null ? zp80Var105.A1 : null, zp80Var105 != null ? zp80Var105.k2 : null, zp80Var105 != null ? zp80Var105.g0 : null, zp80Var105 != null ? zp80Var105.v : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 16) {
                zp80 zp80Var106 = this.binding;
                if (zp80Var106 != null) {
                    zp80Var106.V2.setTag(filterData.get(i));
                    Unit unit76 = Unit.a;
                }
                zp80 zp80Var107 = this.binding;
                if (zp80Var107 != null) {
                    zp80Var107.R0.setTag(filterData.get(i));
                    Unit unit77 = Unit.a;
                }
                zp80 zp80Var108 = this.binding;
                if (zp80Var108 != null) {
                    zp80Var108.V2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit78 = Unit.a;
                }
                zp80 zp80Var109 = this.binding;
                if (zp80Var109 != null) {
                    kya0.a(filterData.get(i), zp80Var109.B1);
                    Unit unit79 = Unit.a;
                }
                zp80 zp80Var110 = this.binding;
                if (zp80Var110 != null) {
                    kya0.a(filterData.get(i), zp80Var110.l2);
                    Unit unit80 = Unit.a;
                }
                zp80 zp80Var111 = this.binding;
                N(zp80Var111 != null ? zp80Var111.V2 : null);
                zp80 zp80Var112 = this.binding;
                O(zp80Var112 != null ? zp80Var112.B1 : null, zp80Var112 != null ? zp80Var112.l2 : null, zp80Var112 != null ? zp80Var112.h0 : null, zp80Var112 != null ? zp80Var112.w : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 17) {
                zp80 zp80Var113 = this.binding;
                if (zp80Var113 != null) {
                    zp80Var113.W2.setTag(filterData.get(i));
                    Unit unit81 = Unit.a;
                }
                zp80 zp80Var114 = this.binding;
                if (zp80Var114 != null) {
                    zp80Var114.S0.setTag(filterData.get(i));
                    Unit unit82 = Unit.a;
                }
                zp80 zp80Var115 = this.binding;
                if (zp80Var115 != null) {
                    zp80Var115.W2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit83 = Unit.a;
                }
                zp80 zp80Var116 = this.binding;
                if (zp80Var116 != null) {
                    kya0.a(filterData.get(i), zp80Var116.C1);
                    Unit unit84 = Unit.a;
                }
                zp80 zp80Var117 = this.binding;
                if (zp80Var117 != null) {
                    kya0.a(filterData.get(i), zp80Var117.m2);
                    Unit unit85 = Unit.a;
                }
                zp80 zp80Var118 = this.binding;
                N(zp80Var118 != null ? zp80Var118.W2 : null);
                zp80 zp80Var119 = this.binding;
                O(zp80Var119 != null ? zp80Var119.C1 : null, zp80Var119 != null ? zp80Var119.m2 : null, zp80Var119 != null ? zp80Var119.i0 : null, zp80Var119 != null ? zp80Var119.y : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 18) {
                zp80 zp80Var120 = this.binding;
                if (zp80Var120 != null) {
                    zp80Var120.X2.setTag(filterData.get(i));
                    Unit unit86 = Unit.a;
                }
                zp80 zp80Var121 = this.binding;
                if (zp80Var121 != null) {
                    zp80Var121.T0.setTag(filterData.get(i));
                    Unit unit87 = Unit.a;
                }
                zp80 zp80Var122 = this.binding;
                if (zp80Var122 != null) {
                    zp80Var122.X2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit88 = Unit.a;
                }
                zp80 zp80Var123 = this.binding;
                if (zp80Var123 != null) {
                    kya0.a(filterData.get(i), zp80Var123.D1);
                    Unit unit89 = Unit.a;
                }
                zp80 zp80Var124 = this.binding;
                if (zp80Var124 != null) {
                    kya0.a(filterData.get(i), zp80Var124.n2);
                    Unit unit90 = Unit.a;
                }
                zp80 zp80Var125 = this.binding;
                N(zp80Var125 != null ? zp80Var125.X2 : null);
                zp80 zp80Var126 = this.binding;
                O(zp80Var126 != null ? zp80Var126.D1 : null, zp80Var126 != null ? zp80Var126.n2 : null, zp80Var126 != null ? zp80Var126.j0 : null, zp80Var126 != null ? zp80Var126.z : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 19) {
                zp80 zp80Var127 = this.binding;
                if (zp80Var127 != null) {
                    zp80Var127.Y2.setTag(filterData.get(i));
                    Unit unit91 = Unit.a;
                }
                zp80 zp80Var128 = this.binding;
                if (zp80Var128 != null) {
                    zp80Var128.U0.setTag(filterData.get(i));
                    Unit unit92 = Unit.a;
                }
                zp80 zp80Var129 = this.binding;
                if (zp80Var129 != null) {
                    zp80Var129.Y2.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit93 = Unit.a;
                }
                zp80 zp80Var130 = this.binding;
                if (zp80Var130 != null) {
                    kya0.a(filterData.get(i), zp80Var130.E1);
                    Unit unit94 = Unit.a;
                }
                zp80 zp80Var131 = this.binding;
                if (zp80Var131 != null) {
                    kya0.a(filterData.get(i), zp80Var131.o2);
                    Unit unit95 = Unit.a;
                }
                zp80 zp80Var132 = this.binding;
                N(zp80Var132 != null ? zp80Var132.Y2 : null);
                zp80 zp80Var133 = this.binding;
                O(zp80Var133 != null ? zp80Var133.E1 : null, zp80Var133 != null ? zp80Var133.o2 : null, zp80Var133 != null ? zp80Var133.k0 : null, zp80Var133 != null ? zp80Var133.A : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 20) {
                zp80 zp80Var134 = this.binding;
                if (zp80Var134 != null) {
                    zp80Var134.a3.setTag(filterData.get(i));
                    Unit unit96 = Unit.a;
                }
                zp80 zp80Var135 = this.binding;
                if (zp80Var135 != null) {
                    zp80Var135.W0.setTag(filterData.get(i));
                    Unit unit97 = Unit.a;
                }
                zp80 zp80Var136 = this.binding;
                if (zp80Var136 != null) {
                    zp80Var136.a3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit98 = Unit.a;
                }
                zp80 zp80Var137 = this.binding;
                if (zp80Var137 != null) {
                    kya0.a(filterData.get(i), zp80Var137.G1);
                    Unit unit99 = Unit.a;
                }
                zp80 zp80Var138 = this.binding;
                if (zp80Var138 != null) {
                    kya0.a(filterData.get(i), zp80Var138.q2);
                    Unit unit100 = Unit.a;
                }
                zp80 zp80Var139 = this.binding;
                N(zp80Var139 != null ? zp80Var139.a3 : null);
                zp80 zp80Var140 = this.binding;
                O(zp80Var140 != null ? zp80Var140.G1 : null, zp80Var140 != null ? zp80Var140.q2 : null, zp80Var140 != null ? zp80Var140.m0 : null, zp80Var140 != null ? zp80Var140.C : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 21) {
                zp80 zp80Var141 = this.binding;
                if (zp80Var141 != null) {
                    zp80Var141.b3.setTag(filterData.get(i));
                    Unit unit101 = Unit.a;
                }
                zp80 zp80Var142 = this.binding;
                if (zp80Var142 != null) {
                    zp80Var142.X0.setTag(filterData.get(i));
                    Unit unit102 = Unit.a;
                }
                zp80 zp80Var143 = this.binding;
                if (zp80Var143 != null) {
                    zp80Var143.b3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit103 = Unit.a;
                }
                zp80 zp80Var144 = this.binding;
                if (zp80Var144 != null) {
                    kya0.a(filterData.get(i), zp80Var144.H1);
                    Unit unit104 = Unit.a;
                }
                zp80 zp80Var145 = this.binding;
                if (zp80Var145 != null) {
                    kya0.a(filterData.get(i), zp80Var145.r2);
                    Unit unit105 = Unit.a;
                }
                zp80 zp80Var146 = this.binding;
                N(zp80Var146 != null ? zp80Var146.b3 : null);
                zp80 zp80Var147 = this.binding;
                O(zp80Var147 != null ? zp80Var147.H1 : null, zp80Var147 != null ? zp80Var147.r2 : null, zp80Var147 != null ? zp80Var147.n0 : null, zp80Var147 != null ? zp80Var147.D : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 22) {
                zp80 zp80Var148 = this.binding;
                if (zp80Var148 != null) {
                    zp80Var148.c3.setTag(filterData.get(i));
                    Unit unit106 = Unit.a;
                }
                zp80 zp80Var149 = this.binding;
                if (zp80Var149 != null) {
                    zp80Var149.Y0.setTag(filterData.get(i));
                    Unit unit107 = Unit.a;
                }
                zp80 zp80Var150 = this.binding;
                if (zp80Var150 != null) {
                    zp80Var150.c3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit108 = Unit.a;
                }
                zp80 zp80Var151 = this.binding;
                if (zp80Var151 != null) {
                    kya0.a(filterData.get(i), zp80Var151.I1);
                    Unit unit109 = Unit.a;
                }
                zp80 zp80Var152 = this.binding;
                if (zp80Var152 != null) {
                    kya0.a(filterData.get(i), zp80Var152.s2);
                    Unit unit110 = Unit.a;
                }
                zp80 zp80Var153 = this.binding;
                N(zp80Var153 != null ? zp80Var153.c3 : null);
                zp80 zp80Var154 = this.binding;
                O(zp80Var154 != null ? zp80Var154.I1 : null, zp80Var154 != null ? zp80Var154.s2 : null, zp80Var154 != null ? zp80Var154.o0 : null, zp80Var154 != null ? zp80Var154.E : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 23) {
                zp80 zp80Var155 = this.binding;
                if (zp80Var155 != null) {
                    zp80Var155.d3.setTag(filterData.get(i));
                    Unit unit111 = Unit.a;
                }
                zp80 zp80Var156 = this.binding;
                if (zp80Var156 != null) {
                    zp80Var156.Z0.setTag(filterData.get(i));
                    Unit unit112 = Unit.a;
                }
                zp80 zp80Var157 = this.binding;
                if (zp80Var157 != null) {
                    zp80Var157.d3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit113 = Unit.a;
                }
                zp80 zp80Var158 = this.binding;
                if (zp80Var158 != null) {
                    kya0.a(filterData.get(i), zp80Var158.J1);
                    Unit unit114 = Unit.a;
                }
                zp80 zp80Var159 = this.binding;
                if (zp80Var159 != null) {
                    kya0.a(filterData.get(i), zp80Var159.t2);
                    Unit unit115 = Unit.a;
                }
                zp80 zp80Var160 = this.binding;
                N(zp80Var160 != null ? zp80Var160.d3 : null);
                zp80 zp80Var161 = this.binding;
                O(zp80Var161 != null ? zp80Var161.J1 : null, zp80Var161 != null ? zp80Var161.t2 : null, zp80Var161 != null ? zp80Var161.p0 : null, zp80Var161 != null ? zp80Var161.F : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 24) {
                zp80 zp80Var162 = this.binding;
                if (zp80Var162 != null) {
                    zp80Var162.e3.setTag(filterData.get(i));
                    Unit unit116 = Unit.a;
                }
                zp80 zp80Var163 = this.binding;
                if (zp80Var163 != null) {
                    zp80Var163.a1.setTag(filterData.get(i));
                    Unit unit117 = Unit.a;
                }
                zp80 zp80Var164 = this.binding;
                if (zp80Var164 != null) {
                    zp80Var164.e3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit118 = Unit.a;
                }
                zp80 zp80Var165 = this.binding;
                if (zp80Var165 != null) {
                    kya0.a(filterData.get(i), zp80Var165.K1);
                    Unit unit119 = Unit.a;
                }
                zp80 zp80Var166 = this.binding;
                if (zp80Var166 != null) {
                    kya0.a(filterData.get(i), zp80Var166.u2);
                    Unit unit120 = Unit.a;
                }
                zp80 zp80Var167 = this.binding;
                N(zp80Var167 != null ? zp80Var167.e3 : null);
                zp80 zp80Var168 = this.binding;
                O(zp80Var168 != null ? zp80Var168.K1 : null, zp80Var168 != null ? zp80Var168.u2 : null, zp80Var168 != null ? zp80Var168.q0 : null, zp80Var168 != null ? zp80Var168.G : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 25) {
                zp80 zp80Var169 = this.binding;
                if (zp80Var169 != null) {
                    zp80Var169.f3.setTag(filterData.get(i));
                    Unit unit121 = Unit.a;
                }
                zp80 zp80Var170 = this.binding;
                if (zp80Var170 != null) {
                    zp80Var170.b1.setTag(filterData.get(i));
                    Unit unit122 = Unit.a;
                }
                zp80 zp80Var171 = this.binding;
                if (zp80Var171 != null) {
                    zp80Var171.f3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit123 = Unit.a;
                }
                zp80 zp80Var172 = this.binding;
                if (zp80Var172 != null) {
                    kya0.a(filterData.get(i), zp80Var172.L1);
                    Unit unit124 = Unit.a;
                }
                zp80 zp80Var173 = this.binding;
                if (zp80Var173 != null) {
                    kya0.a(filterData.get(i), zp80Var173.v2);
                    Unit unit125 = Unit.a;
                }
                zp80 zp80Var174 = this.binding;
                N(zp80Var174 != null ? zp80Var174.f3 : null);
                zp80 zp80Var175 = this.binding;
                O(zp80Var175 != null ? zp80Var175.L1 : null, zp80Var175 != null ? zp80Var175.v2 : null, zp80Var175 != null ? zp80Var175.r0 : null, zp80Var175 != null ? zp80Var175.H : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 26) {
                zp80 zp80Var176 = this.binding;
                if (zp80Var176 != null) {
                    zp80Var176.g3.setTag(filterData.get(i));
                    Unit unit126 = Unit.a;
                }
                zp80 zp80Var177 = this.binding;
                if (zp80Var177 != null) {
                    zp80Var177.c1.setTag(filterData.get(i));
                    Unit unit127 = Unit.a;
                }
                zp80 zp80Var178 = this.binding;
                if (zp80Var178 != null) {
                    zp80Var178.g3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit128 = Unit.a;
                }
                zp80 zp80Var179 = this.binding;
                if (zp80Var179 != null) {
                    kya0.a(filterData.get(i), zp80Var179.M1);
                    Unit unit129 = Unit.a;
                }
                zp80 zp80Var180 = this.binding;
                if (zp80Var180 != null) {
                    kya0.a(filterData.get(i), zp80Var180.w2);
                    Unit unit130 = Unit.a;
                }
                zp80 zp80Var181 = this.binding;
                N(zp80Var181 != null ? zp80Var181.g3 : null);
                zp80 zp80Var182 = this.binding;
                O(zp80Var182 != null ? zp80Var182.M1 : null, zp80Var182 != null ? zp80Var182.w2 : null, zp80Var182 != null ? zp80Var182.s0 : null, zp80Var182 != null ? zp80Var182.I : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 27) {
                zp80 zp80Var183 = this.binding;
                if (zp80Var183 != null) {
                    zp80Var183.h3.setTag(filterData.get(i));
                    Unit unit131 = Unit.a;
                }
                zp80 zp80Var184 = this.binding;
                if (zp80Var184 != null) {
                    zp80Var184.d1.setTag(filterData.get(i));
                    Unit unit132 = Unit.a;
                }
                zp80 zp80Var185 = this.binding;
                if (zp80Var185 != null) {
                    zp80Var185.h3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit133 = Unit.a;
                }
                zp80 zp80Var186 = this.binding;
                if (zp80Var186 != null) {
                    kya0.a(filterData.get(i), zp80Var186.N1);
                    Unit unit134 = Unit.a;
                }
                zp80 zp80Var187 = this.binding;
                if (zp80Var187 != null) {
                    kya0.a(filterData.get(i), zp80Var187.x2);
                    Unit unit135 = Unit.a;
                }
                zp80 zp80Var188 = this.binding;
                N(zp80Var188 != null ? zp80Var188.h3 : null);
                zp80 zp80Var189 = this.binding;
                O(zp80Var189 != null ? zp80Var189.N1 : null, zp80Var189 != null ? zp80Var189.x2 : null, zp80Var189 != null ? zp80Var189.t0 : null, zp80Var189 != null ? zp80Var189.J : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 28) {
                zp80 zp80Var190 = this.binding;
                if (zp80Var190 != null) {
                    zp80Var190.i3.setTag(filterData.get(i));
                    Unit unit136 = Unit.a;
                }
                zp80 zp80Var191 = this.binding;
                if (zp80Var191 != null) {
                    zp80Var191.e1.setTag(filterData.get(i));
                    Unit unit137 = Unit.a;
                }
                zp80 zp80Var192 = this.binding;
                if (zp80Var192 != null) {
                    zp80Var192.i3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit138 = Unit.a;
                }
                zp80 zp80Var193 = this.binding;
                if (zp80Var193 != null) {
                    kya0.a(filterData.get(i), zp80Var193.O1);
                    Unit unit139 = Unit.a;
                }
                zp80 zp80Var194 = this.binding;
                if (zp80Var194 != null) {
                    kya0.a(filterData.get(i), zp80Var194.y2);
                    Unit unit140 = Unit.a;
                }
                zp80 zp80Var195 = this.binding;
                N(zp80Var195 != null ? zp80Var195.i3 : null);
                zp80 zp80Var196 = this.binding;
                O(zp80Var196 != null ? zp80Var196.O1 : null, zp80Var196 != null ? zp80Var196.y2 : null, zp80Var196 != null ? zp80Var196.u0 : null, zp80Var196 != null ? zp80Var196.K : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 29) {
                zp80 zp80Var197 = this.binding;
                if (zp80Var197 != null) {
                    zp80Var197.j3.setTag(filterData.get(i));
                    Unit unit141 = Unit.a;
                }
                zp80 zp80Var198 = this.binding;
                if (zp80Var198 != null) {
                    zp80Var198.f1.setTag(filterData.get(i));
                    Unit unit142 = Unit.a;
                }
                zp80 zp80Var199 = this.binding;
                if (zp80Var199 != null) {
                    zp80Var199.j3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit143 = Unit.a;
                }
                zp80 zp80Var200 = this.binding;
                if (zp80Var200 != null) {
                    kya0.a(filterData.get(i), zp80Var200.P1);
                    Unit unit144 = Unit.a;
                }
                zp80 zp80Var201 = this.binding;
                if (zp80Var201 != null) {
                    kya0.a(filterData.get(i), zp80Var201.z2);
                    Unit unit145 = Unit.a;
                }
                zp80 zp80Var202 = this.binding;
                N(zp80Var202 != null ? zp80Var202.j3 : null);
                zp80 zp80Var203 = this.binding;
                O(zp80Var203 != null ? zp80Var203.P1 : null, zp80Var203 != null ? zp80Var203.z2 : null, zp80Var203 != null ? zp80Var203.v0 : null, zp80Var203 != null ? zp80Var203.L : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 30) {
                zp80 zp80Var204 = this.binding;
                if (zp80Var204 != null) {
                    zp80Var204.l3.setTag(filterData.get(i));
                    Unit unit146 = Unit.a;
                }
                zp80 zp80Var205 = this.binding;
                if (zp80Var205 != null) {
                    zp80Var205.h1.setTag(filterData.get(i));
                    Unit unit147 = Unit.a;
                }
                zp80 zp80Var206 = this.binding;
                if (zp80Var206 != null) {
                    zp80Var206.l3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit148 = Unit.a;
                }
                zp80 zp80Var207 = this.binding;
                if (zp80Var207 != null) {
                    kya0.a(filterData.get(i), zp80Var207.R1);
                    Unit unit149 = Unit.a;
                }
                zp80 zp80Var208 = this.binding;
                if (zp80Var208 != null) {
                    kya0.a(filterData.get(i), zp80Var208.B2);
                    Unit unit150 = Unit.a;
                }
                zp80 zp80Var209 = this.binding;
                N(zp80Var209 != null ? zp80Var209.l3 : null);
                zp80 zp80Var210 = this.binding;
                O(zp80Var210 != null ? zp80Var210.R1 : null, zp80Var210 != null ? zp80Var210.B2 : null, zp80Var210 != null ? zp80Var210.x0 : null, zp80Var210 != null ? zp80Var210.N : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 31) {
                zp80 zp80Var211 = this.binding;
                if (zp80Var211 != null) {
                    zp80Var211.m3.setTag(filterData.get(i));
                    Unit unit151 = Unit.a;
                }
                zp80 zp80Var212 = this.binding;
                if (zp80Var212 != null) {
                    zp80Var212.i1.setTag(filterData.get(i));
                    Unit unit152 = Unit.a;
                }
                zp80 zp80Var213 = this.binding;
                if (zp80Var213 != null) {
                    zp80Var213.m3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit153 = Unit.a;
                }
                zp80 zp80Var214 = this.binding;
                if (zp80Var214 != null) {
                    kya0.a(filterData.get(i), zp80Var214.S1);
                    Unit unit154 = Unit.a;
                }
                zp80 zp80Var215 = this.binding;
                if (zp80Var215 != null) {
                    kya0.a(filterData.get(i), zp80Var215.C2);
                    Unit unit155 = Unit.a;
                }
                zp80 zp80Var216 = this.binding;
                N(zp80Var216 != null ? zp80Var216.m3 : null);
                zp80 zp80Var217 = this.binding;
                O(zp80Var217 != null ? zp80Var217.S1 : null, zp80Var217 != null ? zp80Var217.C2 : null, zp80Var217 != null ? zp80Var217.y0 : null, zp80Var217 != null ? zp80Var217.O : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 32) {
                zp80 zp80Var218 = this.binding;
                if (zp80Var218 != null) {
                    zp80Var218.n3.setTag(filterData.get(i));
                    Unit unit156 = Unit.a;
                }
                zp80 zp80Var219 = this.binding;
                if (zp80Var219 != null) {
                    zp80Var219.j1.setTag(filterData.get(i));
                    Unit unit157 = Unit.a;
                }
                zp80 zp80Var220 = this.binding;
                if (zp80Var220 != null) {
                    zp80Var220.n3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit158 = Unit.a;
                }
                zp80 zp80Var221 = this.binding;
                if (zp80Var221 != null) {
                    kya0.a(filterData.get(i), zp80Var221.T1);
                    Unit unit159 = Unit.a;
                }
                zp80 zp80Var222 = this.binding;
                if (zp80Var222 != null) {
                    kya0.a(filterData.get(i), zp80Var222.D2);
                    Unit unit160 = Unit.a;
                }
                zp80 zp80Var223 = this.binding;
                N(zp80Var223 != null ? zp80Var223.n3 : null);
                zp80 zp80Var224 = this.binding;
                O(zp80Var224 != null ? zp80Var224.T1 : null, zp80Var224 != null ? zp80Var224.D2 : null, zp80Var224 != null ? zp80Var224.z0 : null, zp80Var224 != null ? zp80Var224.P : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 33) {
                zp80 zp80Var225 = this.binding;
                if (zp80Var225 != null) {
                    zp80Var225.o3.setTag(filterData.get(i));
                    Unit unit161 = Unit.a;
                }
                zp80 zp80Var226 = this.binding;
                if (zp80Var226 != null) {
                    zp80Var226.k1.setTag(filterData.get(i));
                    Unit unit162 = Unit.a;
                }
                zp80 zp80Var227 = this.binding;
                if (zp80Var227 != null) {
                    zp80Var227.o3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit163 = Unit.a;
                }
                zp80 zp80Var228 = this.binding;
                if (zp80Var228 != null) {
                    kya0.a(filterData.get(i), zp80Var228.U1);
                    Unit unit164 = Unit.a;
                }
                zp80 zp80Var229 = this.binding;
                if (zp80Var229 != null) {
                    kya0.a(filterData.get(i), zp80Var229.E2);
                    Unit unit165 = Unit.a;
                }
                zp80 zp80Var230 = this.binding;
                N(zp80Var230 != null ? zp80Var230.o3 : null);
                zp80 zp80Var231 = this.binding;
                O(zp80Var231 != null ? zp80Var231.U1 : null, zp80Var231 != null ? zp80Var231.E2 : null, zp80Var231 != null ? zp80Var231.A0 : null, zp80Var231 != null ? zp80Var231.Q : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 34) {
                zp80 zp80Var232 = this.binding;
                if (zp80Var232 != null) {
                    zp80Var232.p3.setTag(filterData.get(i));
                    Unit unit166 = Unit.a;
                }
                zp80 zp80Var233 = this.binding;
                if (zp80Var233 != null) {
                    zp80Var233.l1.setTag(filterData.get(i));
                    Unit unit167 = Unit.a;
                }
                zp80 zp80Var234 = this.binding;
                if (zp80Var234 != null) {
                    zp80Var234.p3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit168 = Unit.a;
                }
                zp80 zp80Var235 = this.binding;
                if (zp80Var235 != null) {
                    kya0.a(filterData.get(i), zp80Var235.V1);
                    Unit unit169 = Unit.a;
                }
                zp80 zp80Var236 = this.binding;
                if (zp80Var236 != null) {
                    kya0.a(filterData.get(i), zp80Var236.F2);
                    Unit unit170 = Unit.a;
                }
                zp80 zp80Var237 = this.binding;
                N(zp80Var237 != null ? zp80Var237.p3 : null);
                zp80 zp80Var238 = this.binding;
                O(zp80Var238 != null ? zp80Var238.V1 : null, zp80Var238 != null ? zp80Var238.F2 : null, zp80Var238 != null ? zp80Var238.B0 : null, zp80Var238 != null ? zp80Var238.R : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 35) {
                zp80 zp80Var239 = this.binding;
                if (zp80Var239 != null) {
                    zp80Var239.q3.setTag(filterData.get(i));
                    Unit unit171 = Unit.a;
                }
                zp80 zp80Var240 = this.binding;
                if (zp80Var240 != null) {
                    zp80Var240.m1.setTag(filterData.get(i));
                    Unit unit172 = Unit.a;
                }
                zp80 zp80Var241 = this.binding;
                if (zp80Var241 != null) {
                    zp80Var241.q3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit173 = Unit.a;
                }
                zp80 zp80Var242 = this.binding;
                if (zp80Var242 != null) {
                    kya0.a(filterData.get(i), zp80Var242.W1);
                    Unit unit174 = Unit.a;
                }
                zp80 zp80Var243 = this.binding;
                if (zp80Var243 != null) {
                    kya0.a(filterData.get(i), zp80Var243.G2);
                    Unit unit175 = Unit.a;
                }
                zp80 zp80Var244 = this.binding;
                N(zp80Var244 != null ? zp80Var244.q3 : null);
                zp80 zp80Var245 = this.binding;
                O(zp80Var245 != null ? zp80Var245.W1 : null, zp80Var245 != null ? zp80Var245.G2 : null, zp80Var245 != null ? zp80Var245.C0 : null, zp80Var245 != null ? zp80Var245.S : null, filterData.get(i), betChipList);
            } else if (value != null && value.intValue() == 36) {
                zp80 zp80Var246 = this.binding;
                if (zp80Var246 != null) {
                    zp80Var246.r3.setTag(filterData.get(i));
                    Unit unit176 = Unit.a;
                }
                zp80 zp80Var247 = this.binding;
                if (zp80Var247 != null) {
                    zp80Var247.n1.setTag(filterData.get(i));
                    Unit unit177 = Unit.a;
                }
                zp80 zp80Var248 = this.binding;
                if (zp80Var248 != null) {
                    zp80Var248.r3.setBackground(Intrinsics.g(filterData.get(i).getColor(), "RED") ? context.getDrawable(R.color.sg_color_e41826) : context.getDrawable(R.color.sg_color_1c1e25));
                    Unit unit178 = Unit.a;
                }
                zp80 zp80Var249 = this.binding;
                if (zp80Var249 != null) {
                    kya0.a(filterData.get(i), zp80Var249.X1);
                    Unit unit179 = Unit.a;
                }
                zp80 zp80Var250 = this.binding;
                if (zp80Var250 != null) {
                    kya0.a(filterData.get(i), zp80Var250.H2);
                    Unit unit180 = Unit.a;
                }
                zp80 zp80Var251 = this.binding;
                N(zp80Var251 != null ? zp80Var251.r3 : null);
                zp80 zp80Var252 = this.binding;
                O(zp80Var252 != null ? zp80Var252.X1 : null, zp80Var252 != null ? zp80Var252.H2 : null, zp80Var252 != null ? zp80Var252.D0 : null, zp80Var252 != null ? zp80Var252.T : null, filterData.get(i), betChipList);
            }
        }
        Unit unit181 = Unit.a;
    }

    public final void setViewModel(v4b0 vm) {
        vm.getClass();
        this.H = vm;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Spin2WinNumberBoard(Context context) {
        this(context, null);
        context.getClass();
    }
}
