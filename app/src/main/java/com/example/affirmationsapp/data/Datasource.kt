import com.example.affirmationsapp.R

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image11),
            Affirmation(R.string.affirmation2, R.drawable.image22),
            Affirmation(R.string.affirmation3, R.drawable.image33),
            Affirmation(R.string.affirmation4, R.drawable.image44),
            Affirmation(R.string.affirmation5, R.drawable.image55),
            Affirmation(R.string.affirmation6, R.drawable.image66),
            Affirmation(R.string.affirmation7, R.drawable.image77),
            Affirmation(R.string.affirmation8, R.drawable.image88),
            Affirmation(R.string.affirmation9, R.drawable.image99),
            Affirmation(R.string.affirmation10, R.drawable.image100)
        )
    }
}
