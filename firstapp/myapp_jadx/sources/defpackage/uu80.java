package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class uu80 {
    public static final /* synthetic */ int a = 0;

    public static Map a(float f, float f2) {
        float f3 = f / f2;
        Float fValueOf = Float.valueOf(0.167f);
        Pair pair = new Pair("bet_card_height", fValueOf);
        Float fValueOf2 = Float.valueOf(0.111f);
        Map mapF = kpu.f(pair, new Pair("top_bet_btn_height", fValueOf2));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("bet_card_height", fValueOf), new Pair("top_bet_btn_height", fValueOf2));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("bet_card_height", Float.valueOf(0.15f)), new Pair("top_bet_btn_height", fValueOf2));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("bet_card_height", fValueOf), new Pair("top_bet_btn_height", fValueOf2)) : mapF;
    }

    public static Map b(float f, float f2) {
        float f3 = f / f2;
        Float fValueOf = Float.valueOf(0.167f);
        Pair pair = new Pair("bet_card_height", fValueOf);
        Float fValueOf2 = Float.valueOf(0.103f);
        Map mapF = kpu.f(pair, new Pair("top_bet_btn_height", fValueOf2));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("bet_card_height", fValueOf), new Pair("top_bet_btn_height", fValueOf2));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("bet_card_height", Float.valueOf(0.15f)), new Pair("top_bet_btn_height", fValueOf2));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("bet_card_height", fValueOf), new Pair("top_bet_btn_height", fValueOf2)) : mapF;
    }

    public static Map c(float f, float f2) {
        Float fValueOf = Float.valueOf(0.432f);
        Float fValueOf2 = Float.valueOf(0.0338f);
        float f3 = f / f2;
        Float fValueOf3 = Float.valueOf(0.0375f);
        Pair pair = new Pair("side_bet_tab_height", fValueOf3);
        Float fValueOf4 = Float.valueOf(0.45f);
        Map mapF = kpu.f(pair, new Pair("ou_range_height_wo_tournament", fValueOf4));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("side_bet_tab_height", fValueOf2), new Pair("ou_range_height_wo_tournament", fValueOf));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("side_bet_tab_height", fValueOf2), new Pair("ou_range_height_wo_tournament", fValueOf));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("side_bet_tab_height", fValueOf3), new Pair("ou_range_height_wo_tournament", fValueOf4)) : mapF;
    }

    public static Map d(float f, float f2) {
        float f3 = f / f2;
        Integer numValueOf = Integer.valueOf(R.dimen._9ssp);
        Pair pair = new Pair("min_max_text_size", numValueOf);
        Integer numValueOf2 = Integer.valueOf(R.dimen._24ssp);
        Pair pair2 = new Pair("minus_plus_text_size", numValueOf2);
        Pair pair3 = new Pair("center_title_text_size", numValueOf);
        Integer numValueOf3 = Integer.valueOf(R.dimen._14ssp);
        Pair pair4 = new Pair("center_amount_size", numValueOf3);
        Pair pair5 = new Pair("over_under_text1", numValueOf3);
        Integer numValueOf4 = Integer.valueOf(R.dimen._10ssp);
        Pair pair6 = new Pair("placed_bet_text_size", numValueOf4);
        Integer numValueOf5 = Integer.valueOf(R.dimen._12ssp);
        Pair pair7 = new Pair("placed_bet_amount_size", numValueOf5);
        Integer numValueOf6 = Integer.valueOf(R.dimen._2sdp);
        Pair pair8 = new Pair("center_title_top_margin", numValueOf6);
        Integer numValueOf7 = Integer.valueOf(R.dimen._5sdp);
        Pair pair9 = new Pair("fbg_icon_padding", numValueOf7);
        Integer numValueOf8 = Integer.valueOf(R.dimen._3sdp);
        Map mapF = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("margin_3sdp", numValueOf8));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("min_max_text_size", numValueOf), new Pair("minus_plus_text_size", numValueOf2), new Pair("center_title_text_size", numValueOf), new Pair("center_amount_size", numValueOf3), new Pair("over_under_text1", numValueOf3), new Pair("placed_bet_text_size", numValueOf4), new Pair("placed_bet_amount_size", numValueOf5), new Pair("center_title_top_margin", numValueOf8), new Pair("fbg_icon_padding", numValueOf7), new Pair("margin_3sdp", numValueOf8));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("min_max_text_size", numValueOf), new Pair("minus_plus_text_size", numValueOf2), new Pair("center_title_text_size", numValueOf), new Pair("center_amount_size", numValueOf3), new Pair("over_under_text1", numValueOf3), new Pair("placed_bet_text_size", numValueOf4), new Pair("placed_bet_amount_size", numValueOf5), new Pair("center_title_top_margin", numValueOf6), new Pair("fbg_icon_padding", numValueOf7), new Pair("margin_3sdp", numValueOf8));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("min_max_text_size", numValueOf), new Pair("minus_plus_text_size", numValueOf2), new Pair("center_title_text_size", numValueOf), new Pair("center_amount_size", numValueOf3), new Pair("over_under_text1", numValueOf3), new Pair("placed_bet_text_size", numValueOf4), new Pair("placed_bet_amount_size", numValueOf5), new Pair("center_title_top_margin", numValueOf6), new Pair("fbg_icon_padding", numValueOf7), new Pair("margin_3sdp", numValueOf8)) : mapF;
    }

    public static Map e(float f, float f2) {
        float f3 = f / f2;
        Integer numValueOf = Integer.valueOf(R.dimen._8ssp);
        Pair pair = new Pair("min_max_text_size", numValueOf);
        Integer numValueOf2 = Integer.valueOf(R.dimen._16ssp);
        Pair pair2 = new Pair("minus_plus_text_size", numValueOf2);
        Pair pair3 = new Pair("center_title_text_size", numValueOf);
        Integer numValueOf3 = Integer.valueOf(R.dimen._12ssp);
        Pair pair4 = new Pair("center_amount_size", numValueOf3);
        Pair pair5 = new Pair("over_under_text1", numValueOf3);
        Pair pair6 = new Pair("placed_bet_text_size", numValueOf);
        Integer numValueOf4 = Integer.valueOf(R.dimen._10ssp);
        Pair pair7 = new Pair("placed_bet_amount_size", numValueOf4);
        Integer numValueOf5 = Integer.valueOf(R.dimen._2sdp);
        Pair pair8 = new Pair("center_title_top_margin", numValueOf5);
        Integer numValueOf6 = Integer.valueOf(R.dimen._4sdp);
        Map mapF = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("fbg_icon_padding", numValueOf6));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("min_max_text_size", numValueOf), new Pair("minus_plus_text_size", numValueOf2), new Pair("center_title_text_size", numValueOf), new Pair("center_amount_size", numValueOf3), new Pair("over_under_text1", numValueOf3), new Pair("placed_bet_text_size", numValueOf), new Pair("placed_bet_amount_size", numValueOf4), new Pair("center_title_top_margin", numValueOf5), new Pair("fbg_icon_padding", numValueOf6));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("min_max_text_size", numValueOf), new Pair("minus_plus_text_size", numValueOf2), new Pair("center_title_text_size", numValueOf), new Pair("center_amount_size", numValueOf3), new Pair("over_under_text1", numValueOf3), new Pair("placed_bet_text_size", numValueOf), new Pair("placed_bet_amount_size", numValueOf4), new Pair("center_title_top_margin", numValueOf5), new Pair("fbg_icon_padding", numValueOf6));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("min_max_text_size", numValueOf), new Pair("minus_plus_text_size", numValueOf2), new Pair("center_title_text_size", numValueOf), new Pair("center_amount_size", numValueOf3), new Pair("over_under_text1", numValueOf3), new Pair("placed_bet_text_size", numValueOf), new Pair("placed_bet_amount_size", numValueOf4), new Pair("center_title_top_margin", numValueOf5), new Pair("fbg_icon_padding", numValueOf6)) : mapF;
    }

    public static Map f(float f, float f2) {
        float f3 = f / f2;
        Float fValueOf = Float.valueOf(0.0227f);
        Pair pair = new Pair("spacer_1_width", fValueOf);
        Float fValueOf2 = Float.valueOf(0.0277f);
        Pair pair2 = new Pair("view1_height", fValueOf2);
        Float fValueOf3 = Float.valueOf(0.027f);
        Pair pair3 = new Pair("side_bet_card_v_spacer", fValueOf3);
        Float fValueOf4 = Float.valueOf(0.022f);
        Pair pair4 = new Pair("side_bet_card_h_spacer", fValueOf4);
        Float fValueOf5 = Float.valueOf(0.06f);
        Pair pair5 = new Pair("view2_space", fValueOf5);
        Float fValueOf6 = Float.valueOf(0.193f);
        Pair pair6 = new Pair("layout_amount_height", fValueOf6);
        Float fValueOf7 = Float.valueOf(0.863f);
        Pair pair7 = new Pair("layout_amount_width", fValueOf7);
        Float fValueOf8 = Float.valueOf(0.77f);
        Pair pair8 = new Pair("min_bg_height", fValueOf8);
        Float fValueOf9 = Float.valueOf(0.75f);
        Pair pair9 = new Pair("min_bg_height_range", fValueOf9);
        Float fValueOf10 = Float.valueOf(0.24f);
        Pair pair10 = new Pair("min_bg_width_range", fValueOf10);
        Float fValueOf11 = Float.valueOf(0.12f);
        Pair pair11 = new Pair("min_bg_width", fValueOf11);
        Float fValueOf12 = Float.valueOf(0.044f);
        Pair pair12 = new Pair("view3_space", fValueOf12);
        Float fValueOf13 = Float.valueOf(0.87f);
        Pair pair13 = new Pair("amt_select_layout_width", fValueOf13);
        Pair pair14 = new Pair("amt_select_layout_height", fValueOf11);
        Pair pair15 = new Pair("view5_space", Float.valueOf(0.08f));
        Float fValueOf14 = Float.valueOf(0.19f);
        Pair pair16 = new Pair("placebet_btn_height", fValueOf14);
        Float fValueOf15 = Float.valueOf(0.46f);
        Pair pair17 = new Pair("over_btn_width", fValueOf15);
        Float fValueOf16 = Float.valueOf(0.64f);
        Pair pair18 = new Pair("bet_place_text", fValueOf16);
        Float fValueOf17 = Float.valueOf(0.954f);
        Pair pair19 = new Pair("placebet_ui_width", fValueOf17);
        Float fValueOf18 = Float.valueOf(0.032f);
        Pair pair20 = new Pair("view_6_space", fValueOf18);
        Float fValueOf19 = Float.valueOf(0.136f);
        Pair pair21 = new Pair("close_btn", fValueOf19);
        Float fValueOf20 = Float.valueOf(0.4f);
        Pair pair22 = new Pair("fbg_icon_height", fValueOf20);
        Float fValueOf21 = Float.valueOf(0.886f);
        Map mapF = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, new Pair("layout_amount_width_range", fValueOf21));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("spacer_1_width", Float.valueOf(0.0247f)), new Pair("view1_height", Float.valueOf(0.0279f)), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", Float.valueOf(0.173f)), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf9), new Pair("min_bg_width_range", fValueOf10), new Pair("min_bg_width", fValueOf11), new Pair("view3_space", fValueOf12), new Pair("amt_select_layout_width", fValueOf13), new Pair("amt_select_layout_height", Float.valueOf(0.11f)), new Pair("view5_space", Float.valueOf(0.13f)), new Pair("placebet_btn_height", fValueOf14), new Pair("over_btn_width", fValueOf15), new Pair("bet_place_text", fValueOf16), new Pair("placebet_ui_width", fValueOf17), new Pair("view_6_space", fValueOf18), new Pair("close_btn", fValueOf19), new Pair("fbg_icon_height", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("spacer_1_width", Float.valueOf(0.0247f)), new Pair("view1_height", Float.valueOf(0.0279f)), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", Float.valueOf(0.173f)), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf9), new Pair("min_bg_width_range", fValueOf10), new Pair("min_bg_width", fValueOf11), new Pair("view3_space", fValueOf12), new Pair("amt_select_layout_width", fValueOf13), new Pair("amt_select_layout_height", Float.valueOf(0.11f)), new Pair("view5_space", Float.valueOf(0.13f)), new Pair("placebet_btn_height", fValueOf14), new Pair("over_btn_width", fValueOf15), new Pair("bet_place_text", fValueOf16), new Pair("placebet_ui_width", fValueOf17), new Pair("view_6_space", fValueOf18), new Pair("close_btn", fValueOf19), new Pair("fbg_icon_height", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        if (f3 >= 1.82f) {
            return kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf9), new Pair("min_bg_width_range", fValueOf10), new Pair("min_bg_width", fValueOf11), new Pair("view3_space", fValueOf12), new Pair("amt_select_layout_width", fValueOf13), new Pair("amt_select_layout_height", fValueOf11), new Pair("view5_space", Float.valueOf(0.08f)), new Pair("placebet_btn_height", fValueOf14), new Pair("over_btn_width", fValueOf15), new Pair("bet_place_text", fValueOf16), new Pair("placebet_ui_width", fValueOf17), new Pair("view_6_space", fValueOf18), new Pair("close_btn", fValueOf19), new Pair("fbg_icon_height", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        if (f3 >= 1.75f) {
            return kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf9), new Pair("min_bg_width_range", Float.valueOf(0.22f)), new Pair("min_bg_width", Float.valueOf(0.11f)), new Pair("view3_space", fValueOf12), new Pair("amt_select_layout_width", fValueOf13), new Pair("amt_select_layout_height", fValueOf11), new Pair("view5_space", Float.valueOf(0.08f)), new Pair("placebet_btn_height", fValueOf14), new Pair("over_btn_width", fValueOf15), new Pair("bet_place_text", fValueOf16), new Pair("placebet_ui_width", fValueOf17), new Pair("view_6_space", fValueOf18), new Pair("close_btn", fValueOf19), new Pair("fbg_icon_height", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf9), new Pair("min_bg_width_range", fValueOf10), new Pair("min_bg_width", fValueOf11), new Pair("view3_space", fValueOf12), new Pair("amt_select_layout_width", fValueOf13), new Pair("amt_select_layout_height", fValueOf11), new Pair("view5_space", Float.valueOf(0.08f)), new Pair("placebet_btn_height", fValueOf14), new Pair("over_btn_width", fValueOf15), new Pair("bet_place_text", fValueOf16), new Pair("placebet_ui_width", fValueOf17), new Pair("view_6_space", fValueOf18), new Pair("close_btn", fValueOf19), new Pair("fbg_icon_height", fValueOf20), new Pair("layout_amount_width_range", fValueOf21)) : mapF;
    }

    public static Map g(float f, float f2) {
        float f3 = f / f2;
        Float fValueOf = Float.valueOf(0.0227f);
        Pair pair = new Pair("spacer_1_width", fValueOf);
        Float fValueOf2 = Float.valueOf(0.0277f);
        Pair pair2 = new Pair("view1_height", fValueOf2);
        Float fValueOf3 = Float.valueOf(0.027f);
        Pair pair3 = new Pair("side_bet_card_v_spacer", fValueOf3);
        Float fValueOf4 = Float.valueOf(0.022f);
        Pair pair4 = new Pair("side_bet_card_h_spacer", fValueOf4);
        Float fValueOf5 = Float.valueOf(0.05f);
        Pair pair5 = new Pair("view2_space", fValueOf5);
        Float fValueOf6 = Float.valueOf(0.2f);
        Pair pair6 = new Pair("layout_amount_height", fValueOf6);
        Float fValueOf7 = Float.valueOf(0.863f);
        Pair pair7 = new Pair("layout_amount_width", fValueOf7);
        Float fValueOf8 = Float.valueOf(0.7f);
        Pair pair8 = new Pair("min_bg_height", fValueOf8);
        Pair pair9 = new Pair("min_bg_height_range", fValueOf8);
        Float fValueOf9 = Float.valueOf(0.092f);
        Pair pair10 = new Pair("min_bg_width", fValueOf9);
        Float fValueOf10 = Float.valueOf(0.044f);
        Pair pair11 = new Pair("view3_space", fValueOf10);
        Float fValueOf11 = Float.valueOf(0.87f);
        Pair pair12 = new Pair("amt_select_layout_width", fValueOf11);
        Float fValueOf12 = Float.valueOf(0.1f);
        Pair pair13 = new Pair("amt_select_layout_height", fValueOf12);
        Float fValueOf13 = Float.valueOf(0.08f);
        Pair pair14 = new Pair("view5_space", fValueOf13);
        Pair pair15 = new Pair("placebet_btn_height", fValueOf6);
        Float fValueOf14 = Float.valueOf(0.46f);
        Pair pair16 = new Pair("over_btn_width", fValueOf14);
        Float fValueOf15 = Float.valueOf(0.64f);
        Pair pair17 = new Pair("bet_place_text", fValueOf15);
        Float fValueOf16 = Float.valueOf(0.954f);
        Pair pair18 = new Pair("placebet_ui_width", fValueOf16);
        Float fValueOf17 = Float.valueOf(0.032f);
        Pair pair19 = new Pair("view_6_space", fValueOf17);
        Float fValueOf18 = Float.valueOf(0.136f);
        Pair pair20 = new Pair("close_btn", fValueOf18);
        Float fValueOf19 = Float.valueOf(0.3f);
        Pair pair21 = new Pair("fbg_icon_height", fValueOf19);
        Float fValueOf20 = Float.valueOf(0.192f);
        Pair pair22 = new Pair("min_bg_width_range", fValueOf20);
        Float fValueOf21 = Float.valueOf(0.886f);
        Map mapF = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, new Pair("layout_amount_width_range", fValueOf21));
        if (f3 >= 2.1f) {
            return kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf8), new Pair("min_bg_width", fValueOf9), new Pair("view3_space", fValueOf10), new Pair("amt_select_layout_width", fValueOf11), new Pair("amt_select_layout_height", fValueOf12), new Pair("view5_space", fValueOf13), new Pair("placebet_btn_height", fValueOf6), new Pair("over_btn_width", fValueOf14), new Pair("bet_place_text", fValueOf15), new Pair("placebet_ui_width", fValueOf16), new Pair("view_6_space", fValueOf17), new Pair("close_btn", fValueOf18), new Pair("fbg_icon_height", fValueOf19), new Pair("min_bg_width_range", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        if (f3 >= 2.0f) {
            return kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf8), new Pair("min_bg_width", fValueOf9), new Pair("view3_space", fValueOf10), new Pair("amt_select_layout_width", fValueOf11), new Pair("amt_select_layout_height", fValueOf12), new Pair("view5_space", fValueOf13), new Pair("placebet_btn_height", fValueOf6), new Pair("over_btn_width", fValueOf14), new Pair("bet_place_text", fValueOf15), new Pair("placebet_ui_width", fValueOf16), new Pair("view_6_space", fValueOf17), new Pair("close_btn", fValueOf18), new Pair("fbg_icon_height", fValueOf19), new Pair("min_bg_width_range", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        if (f3 >= 1.82f) {
            return kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf8), new Pair("min_bg_width", fValueOf9), new Pair("view3_space", fValueOf10), new Pair("amt_select_layout_width", fValueOf11), new Pair("amt_select_layout_height", fValueOf12), new Pair("view5_space", fValueOf13), new Pair("placebet_btn_height", fValueOf6), new Pair("over_btn_width", fValueOf14), new Pair("bet_place_text", fValueOf15), new Pair("placebet_ui_width", fValueOf16), new Pair("view_6_space", fValueOf17), new Pair("close_btn", fValueOf18), new Pair("fbg_icon_height", fValueOf19), new Pair("min_bg_width_range", fValueOf20), new Pair("layout_amount_width_range", fValueOf21));
        }
        if (f3 >= 1.75f) {
            return kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf8), new Pair("min_bg_width", Float.valueOf(0.09f)), new Pair("view3_space", fValueOf10), new Pair("amt_select_layout_width", fValueOf11), new Pair("amt_select_layout_height", fValueOf12), new Pair("view5_space", fValueOf13), new Pair("placebet_btn_height", fValueOf6), new Pair("over_btn_width", fValueOf14), new Pair("bet_place_text", fValueOf15), new Pair("placebet_ui_width", fValueOf16), new Pair("view_6_space", fValueOf17), new Pair("close_btn", fValueOf18), new Pair("fbg_icon_height", fValueOf19), new Pair("min_bg_width_range", Float.valueOf(0.19f)), new Pair("layout_amount_width_range", fValueOf21));
        }
        return f3 >= 1.5f ? kpu.f(new Pair("spacer_1_width", fValueOf), new Pair("view1_height", fValueOf2), new Pair("side_bet_card_v_spacer", fValueOf3), new Pair("side_bet_card_h_spacer", fValueOf4), new Pair("view2_space", fValueOf5), new Pair("layout_amount_height", fValueOf6), new Pair("layout_amount_width", fValueOf7), new Pair("min_bg_height", fValueOf8), new Pair("min_bg_height_range", fValueOf8), new Pair("min_bg_width", fValueOf9), new Pair("view3_space", fValueOf10), new Pair("amt_select_layout_width", fValueOf11), new Pair("amt_select_layout_height", fValueOf12), new Pair("view5_space", fValueOf13), new Pair("placebet_btn_height", fValueOf6), new Pair("over_btn_width", fValueOf14), new Pair("bet_place_text", fValueOf15), new Pair("placebet_ui_width", fValueOf16), new Pair("view_6_space", fValueOf17), new Pair("close_btn", fValueOf18), new Pair("fbg_icon_height", fValueOf19), new Pair("min_bg_width_range", fValueOf20), new Pair("layout_amount_width_range", fValueOf21)) : mapF;
    }
}
