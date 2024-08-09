package com.Manioudaki.Manioudaki_app.services;

import com.Manioudaki.Manioudaki_app.models.New;

public interface NewsServices {
    public void saveNew(New myNew);

    public void updateNew(New oldNew, New updatedNew);

    public void deleteNew(New myNew);

}
