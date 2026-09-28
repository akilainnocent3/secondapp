package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.collections.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class vho {
    public final Context a;

    public vho(Context context) {
        this.a = context;
    }

    public final void a() {
        Context context = this.a;
        for (String str : b.k("https://s.sporty.net/cms/don_winning_popup_bg_530894ed5d.png", "https://s.sporty.net/cms/don_logo_b7409030da.png", "https://s.sporty.net/cms/img_instant_racing_bronze_1c6f71b0d8.png", "https://s.sporty.net/cms/img_instant_racing_gold_02c2b25fc0.png", "https://s.sporty.net/cms/img_instant_racing_silver_8bc3ec64d1.png", "https://s.sporty.net/cms/img_instant_racing_race_background_967020ba83.png", "https://s.sporty.net/cms/Match_bg_7b175b62c5.png", "https://s.sporty.net/cms/empty_image_bets_f5922b9d45.png", "https://s.sporty.net/ke/main/res/b6284ed38b014df434abedc1a1d09163.gif", "https://s.sporty.net/ke/main/res/bcc53cc762c7ecc188cd1fdcfb93bbb7.gif", "https://s.sporty.net/ke/main/res/b495be1b87cc9d3135076b2467a0050b.gif", "https://s.sporty.net/ke/main/res/453a7bf8028ab6e5592ae457f408c79a.gif", "https://s.sporty.net/ke/main/res/bcc2895659253e0b00d7f606406d6b94.gif", "https://s.sporty.net/ke/main/res/d5cdea3de664473f57411dd3b2a122ac.gif", "https://s.sporty.net/ke/main/res/628ce73741b3a369b62052c49548215e.gif", "https://s.sporty.net/ke/main/res/fcc6276cf1b152d6b02b223d27290e07.gif", "https://s.sporty.net/ke/main/res/f38b7911e2770138975cbb2fd238ce5c.gif", "https://s.sporty.net/ke/main/res/eb6e90be5b670247efc6bcf32980a855.gif", "https://s.sporty.net/cms/Build_and_Go_start_41085d90d3.gif", "https://s.sporty.net/cms/img_iv_gift_hint_bg_gift_9cc1999d4d.png", "https://s.sporty.net/cms/img_iv_gift_hint_bg_left_0eebd7c390.png", "https://s.sporty.net/cms/img_iv_gift_hint_bg_right_dcd064a6c2.png", "https://s.sporty.net/cms/sp_field_bottom_aa8363577c.png", "https://s.sporty.net/cms/sp_field_goal_bdca53c43e.png", "https://s.sporty.net/cms/sp_field_top_8f189b9b63.png", "https://s.sporty.net/cms/instant_win_winning_image_v2_de0e10ff6b.png", "https://s.sporty.net/cms/sporty_Legends_Field_Cover_acf7ebb77f.png", "https://s.sporty.net/cms/sl_team_select_bg_de16da0d1a.png", "https://s.sporty.net/cms/Penalty_Winning_1_4e53fe655f.png", sn5.b(context, R.string.page_instant_virtual__sporty_penalty_image_game_end, new Object[0]), sn5.b(context, R.string.page_instant_virtual__sporty_penalty_image_goal, new Object[0]), sn5.b(context, R.string.page_instant_virtual__sporty_penalty_image_no_goal, new Object[0]), sn5.b(context, R.string.page_instant_virtual__scheduled_football_game_end_image, new Object[0]))) {
            if (c.k(str, ".gif", false)) {
                nan.a aVar = new nan.a(context);
                aVar.h = new qhk.a();
                aVar.c = str;
                qw90.a(context).a(aVar.a());
            } else if (c.k(str, ".png", false)) {
                nan.a aVar2 = new nan.a(context);
                aVar2.c = str;
                qw90.a(context).a(aVar2.a());
            }
        }
    }
}
