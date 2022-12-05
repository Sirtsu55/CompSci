#include <cmath>
#include <iostream>
#include <limits>
#include <sstream>
#include <string>
#include <vector>

struct Vec2 {
    int x, y;

    bool operator==(const Vec2& r) const
    {
        return (x == r.x) && (y == r.y);
    }
};

int main() {
    std::cin.sync_with_stdio(false);
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);
    int n;
    std::cin >> n;

    std::vector<Vec2> locations;
    locations.reserve(n);

    int steps = 0;
    Vec2 currentLoc = {0,0};
    for (int i = 0; i < n; i++) {
        int mag;
        std::string dstr;

        std::cin >> dstr >> mag;
        Vec2 direction;

        if(dstr == "O")
            direction = {mag, 0};
        else if(dstr == "V")
            direction = {-mag, 0};
        else if(dstr == "Y")
            direction = {0, mag};
        else if(dstr == "A")
            direction = {0, -mag};


        locations.push_back(direction);
    }

    std::vector<Vec2> visitedLoc;
    visitedLoc.reserve(n);

    for (int i = 0; i < n; i++) {
        currentLoc.x += locations[i].x;
        currentLoc.y += locations[i].y;

        auto loc = std::find(visitedLoc.begin(), 
             visitedLoc.end(), currentLoc);

        if(loc != visitedLoc.end())
        {
            std::cout << steps;
            exit(0);
        }
        steps += 1;
    };

    


}