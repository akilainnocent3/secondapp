package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface paw {
    Object levelConfigDetails(v1b<? super HTTPResponse<List<LevelConfigDetailDto>>> v1bVar);

    Object userLevelProgress(v1b<? super HTTPResponse<UserLevelProgressDto>> v1bVar);
}
